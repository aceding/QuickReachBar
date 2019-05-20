package com.ace.qrb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

public class QuickReachBar extends Dialog {

    private View mRootView;

    private RecyclerView mRecyclerView;

    private Activity mActivity;

    public QuickReachBar(@NonNull Activity activity) {
        super(activity, R.style.MenuDialogStyle);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            getWindow().setDimAmount(0.5f);
        }
        mActivity = activity;
        mRootView = LayoutInflater.from(activity).inflate(R.layout.layout_quick_seach_bar, null);
        setContentView(mRootView);
        initViews();
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mActivity);
        linearLayoutManager.setOrientation(OrientationHelper.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        SavedActivitiesAdapter adapter = new SavedActivitiesAdapter(mActivity,
                ApplicationImpl.sQrManager.savedActivities, mItemOnClickListener);
        mRecyclerView.setAdapter(adapter);

        mRootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    private View.OnClickListener mItemOnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            SavedActivityInfo activityInfo = (SavedActivityInfo) v.getTag();
            dismiss();
            Intent intent = new Intent(mActivity, activityInfo.activityCls);
            mActivity.startActivity(intent);
            mActivity.overridePendingTransition(R.anim.activity_enter_in, R.anim.activity_stay_origin);
        }
    };

    @Override
    public void show() {
        super.show();
    }

    public static QuickReachBar createQuickReachBar(Activity activity) {
        final QuickReachBar dialog = new QuickReachBar(activity);
        if (Build.VERSION.SDK_INT != 23) {
            dialog.getWindow().setWindowAnimations(R.style.ActionSheetAnimation);
        }
        return dialog;
    }
}

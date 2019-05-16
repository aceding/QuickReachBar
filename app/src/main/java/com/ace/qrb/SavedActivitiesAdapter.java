package com.ace.qrb;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SavedActivitiesAdapter extends RecyclerView.Adapter<SavedActivityViewHolder> {

    private Context mContext;

    private List<SavedActivityInfo> mSavedActivities;

    private View.OnClickListener mItemOnClickListener;

    public SavedActivitiesAdapter(Context context, List<SavedActivityInfo> savedActivities, View.OnClickListener itemOnClickListener) {
        mContext = context;
        mSavedActivities = savedActivities;
        mItemOnClickListener = itemOnClickListener;
    }

    @Override
    public SavedActivityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.layout_saved_activity_item
                , null);
        return new SavedActivityViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SavedActivityViewHolder holder, int position) {
        SavedActivityInfo activityInfo = mSavedActivities.get(position);
        holder.bindData(activityInfo, mItemOnClickListener);
    }

    @Override
    public int getItemCount() {
        return null == mSavedActivities ? 0 : mSavedActivities.size();
    }
}

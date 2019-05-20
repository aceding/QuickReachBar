package com.ace.qrb.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ace.qrb.QuickReachBar;
import com.ace.qrb.R;

public class InternalActivity extends FragmentActivity{

    private Button mBtnGotoMoreInternal;

    private Button mBtnShowQrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);

        initViews();
    }

    private void initViews() {
        mBtnGotoMoreInternal = (Button) findViewById(R.id.btn_goto_more_internal);
        mBtnShowQrb = (Button) findViewById(R.id.btn_show_qrb);

        mBtnGotoMoreInternal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InternalActivity.this, MoreInternalActivity.class);
                startActivity(intent);
            }
        });

        mBtnShowQrb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                QuickReachBar quickReachBar = QuickReachBar.createQuickReachBar(InternalActivity.this);
                quickReachBar.show();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
    }
}

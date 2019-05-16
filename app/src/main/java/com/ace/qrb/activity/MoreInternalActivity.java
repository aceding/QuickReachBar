package com.ace.qrb.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ace.qrb.R;

public class MoreInternalActivity extends AppCompatActivity {

    private Button mBtnShowQrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_internal);
        initViews();
    }

    private void initViews() {
        mBtnShowQrb = (Button) findViewById(R.id.btn_show_qrb);

        mBtnShowQrb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

    }
}

package com.ace.qrb.activity;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.ace.qrb.R;

public class NearbyActivity extends QuickReachActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);

        initViews();
    }

    private Button mBtnSave;

    private void initViews() {
        mBtnSave = (Button) findViewById(R.id.btn_save);
        mBtnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                onActivitySaved();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
    }
}

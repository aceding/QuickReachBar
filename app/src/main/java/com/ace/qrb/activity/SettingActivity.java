package com.ace.qrb.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ace.qrb.R;

public class SettingActivity extends QuickReachActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initViews();
    }

    private Button mBtnSave;

    private void initViews(){
        mBtnSave = (Button) findViewById(R.id.btn_save);
        mBtnSave.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                onActivitySaved();
            }
        });
    }

}

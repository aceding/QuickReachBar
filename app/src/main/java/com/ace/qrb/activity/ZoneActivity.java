package com.ace.qrb.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ace.qrb.R;

public class ZoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);
        initViews();
    }

    private Button mBtnSave;

    private void initViews() {
        mBtnSave = (Button) findViewById(R.id.btn_save);
        mBtnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });
    }
}

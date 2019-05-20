package com.ace.qrb.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ace.qrb.R;

public class MainActivity extends FragmentActivity {

    private Button mBtnGotoInternal;

    private Button mBtnGotoNearby;

    private Button mBtnGotoWallet;

    private Button mBtnGotoZone;

    private Button mBtnGotoSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mBtnGotoInternal = (Button) findViewById(R.id.btn_goto_internal);
        mBtnGotoNearby = (Button) findViewById(R.id.btn_goto_nearby);
        mBtnGotoWallet = (Button) findViewById(R.id.btn_goto_wallet);
        mBtnGotoZone = (Button) findViewById(R.id.btn_goto_zone);
        mBtnGotoSetting = (Button) findViewById(R.id.btn_goto_setting);

        mBtnGotoInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InternalActivity.class);
                startActivity(intent);
            }
        });

        mBtnGotoNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NearbyActivity.class);
                startActivity(intent);
            }
        });

        mBtnGotoWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WalletActivity.class);
                startActivity(intent);
            }
        });

        mBtnGotoZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ZoneActivity.class);
                startActivity(intent);
            }
        });

        mBtnGotoSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }

}

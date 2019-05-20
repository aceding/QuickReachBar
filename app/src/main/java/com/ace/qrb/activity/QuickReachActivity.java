package com.ace.qrb.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.ace.qrb.ApplicationImpl;
import com.ace.qrb.QuickReachInterface;
import com.ace.qrb.utils.BitmapUtils;

public class QuickReachActivity extends FragmentActivity implements QuickReachInterface {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivitySaved() {
        Bitmap bmp =
                BitmapUtils.createSnapshotOfView((View) findViewById(android.R.id.content).getParent());
        ApplicationImpl.sQrManager.onActivitySaved(getClass(), bmp);
        moveTaskToBack(true);
    }

    @Override
    public void onActivityRemoved() {
        ApplicationImpl.sQrManager.onActivityRemoved(getClass());
    }

    @Override
    public void onActivityRestored() {

    }

    @Override
    public void finish() {
        super.finish();
        ApplicationImpl.sQrManager.onActivityRemoved(getClass());
    }
}

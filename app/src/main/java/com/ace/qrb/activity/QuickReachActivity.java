package com.ace.qrb.activity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ace.qrb.ApplicationImpl;
import com.ace.qrb.QuickReachInterface;
import com.ace.qrb.utils.BitmapUtils;

public class QuickReachActivity extends AppCompatActivity implements QuickReachInterface {

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

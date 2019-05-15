package com.ace.qrb;

import android.app.Activity;
import android.graphics.Bitmap;

public class SavedActivityInfo {

    public Class<? extends Activity> activityCls;

    public Bitmap snapshotBmp;

    public SavedActivityInfo(Class<? extends Activity> cls, Bitmap bmp) {
        this.activityCls = cls;
        this.snapshotBmp = bmp;
    }

}

package com.ace.qrb;

import android.app.Activity;
import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class QrbManager {

    public List<SavedActivityInfo> savedActivities;

    public QrbManager() {
        savedActivities = new ArrayList<>();
    }

    public void onActivitySaved(Class<? extends Activity> cls, Bitmap bmp) {
        int index = -1;
        for (int i = 0, n = savedActivities.size(); i < n; i++) {
            if (savedActivities.get(i).activityCls == cls) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            savedActivities.get(index).snapshotBmp = bmp;
        } else {
            savedActivities.add(new SavedActivityInfo(cls, bmp));
        }
    }

    public void onSavedActivityRemoved(Class<? extends Activity> cls) {
        for (int i = 0, n = savedActivities.size(); i < n; i++) {
            if (savedActivities.get(i).activityCls == cls) {
                savedActivities.remove(i);
                break;
            }
        }
    }
}

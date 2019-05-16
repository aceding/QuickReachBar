package com.ace.qrb.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

public class BitmapUtils {

    public static Bitmap createSnapshotOfView(View view) {
        view.getDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(),
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }
}

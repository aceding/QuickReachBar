package com.ace.qrb;

import android.app.Application;

public class ApplicationImpl extends Application {

    public static ApplicationImpl sInstance;

    public QrbManager qrbManager;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        qrbManager = new QrbManager();
    }
}

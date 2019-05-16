package com.ace.qrb;

import android.app.Application;

public class ApplicationImpl extends Application {

    public static ApplicationImpl sInstance;

    public static final QuickReachManager sQrManager = new QuickReachManager();

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

}

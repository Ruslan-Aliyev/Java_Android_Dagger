package com.example.java_android_dagger;

import android.app.Application;

// 2) appComponent lives in the Application class to share its lifecycle
public class BaseApplication extends Application {
    // 3) Reference to the application graph that is used across the whole app
    ApplicationComponent appComponent = DaggerApplicationComponent.create();
}

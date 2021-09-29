package com.example.java_android_dagger;

import dagger.Component;

// 1) Definition of the Application graph

// The Component is declaring what and where to inject.
// A Component should always be an interface.
// Dagger will generate a class, append `Dagger` in front of the component name: `DaggerApplicationComponent` in this case.
@Component
public interface ApplicationComponent {
    // 5) This tells Dagger that MainActivity requests injection so the graph needs to satisfy all the dependencies of the fields that MainActivity is injecting.
    // You can name it anything, such as `poke()`. It doesn't have to be `inject()`
    void inject(MainActivity mainActivity);
}

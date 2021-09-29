package com.example.java_android_dagger;

import javax.inject.Inject;

public class Dependency {

    public String testText = "Test Text";

    // 4) @Inject tells Dagger how to create instances of Dependency
    @Inject
    public Dependency() {

    }
}

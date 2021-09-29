package com.example.java_android_dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // 4) You want Dagger to provide an instance of Dependency from the graph
    @Inject
    Dependency dependency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 6) Make Dagger instantiate @Inject fields in MainActivity
        ((BaseApplication) getApplicationContext()).appComponent.inject(this);
        // Now dependency is available

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView testTextField = (TextView) findViewById(R.id.test_text_field);
        testTextField.setText(dependency.testText);
    }
}
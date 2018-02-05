package com.orbbec.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author tanzhuohui
 */
public class MainActivity extends AppCompatActivity {
    private static String TAG = "tzh";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: test1");
        Log.d(TAG, "onCreate: test2");
        Log.d(TAG, "onCreate: test3");
        Log.d(TAG, "onCreate: test4");
        Log.d(TAG, "onCreate: test5");
        Log.d(TAG, "onCreate: test6");
    }
}

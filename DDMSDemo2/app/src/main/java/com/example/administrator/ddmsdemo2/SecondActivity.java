package com.example.administrator.ddmsdemo2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/30.
 */

public class SecondActivity extends Activity {
    private static final String LIFT_TAG="FirstAvtivity";

    protected void onCreate(Bundle savedInstanceState){
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onCreate");
        super.onCreate(savedInstanceState);
    }
    @Override
    protected void onStop() {
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onDestory");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onPause");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onStart");
        super.onStart();
    }

    protected void onRestart() {
        Log.v(FirstActivity.LIFT_TAG,"SecondActivity ---> onRestart");
        super.onStart();
    }
}

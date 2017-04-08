package com.example.administrator.ddmsdemo2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    static final String LIFT_TAG="FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.v(FirstActivity.LIFT_TAG,"FirstActivity ---> onCreate");
        Button mybt=(Button)findViewById(R.id.bt);
        mybt.setText("NEXT Activity");
        mybt.setOnClickListener(new ButtonOnClickListener());
    }
    class ButtonOnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent();
            intent.setClass(FirstActivity.this,SecondActivity.class);
            FirstActivity.this.startActivity(intent);
        }
    }

    @Override
    protected void onStop() {
        Log.v(FirstActivity.LIFT_TAG,"FirstActivity ---> onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(FirstActivity.LIFT_TAG,"FirstActivity ---> onDestory");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.v(FirstActivity.LIFT_TAG,"FirstActivity ---> onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(FirstActivity.LIFT_TAG,"FirstActivity ---> onPause");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.v(FirstActivity.LIFT_TAG,"FirstActivity ---> onStart");
        super.onStart();
    }
}

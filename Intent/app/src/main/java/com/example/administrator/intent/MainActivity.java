package com.example.administrator.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioButton ra=null;
    RadioButton rb=null;
    RadioButton rc=null;
    RadioButton rd=null;
    RadioButton r=null;
    RadioGroup rag=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rag =(RadioGroup) findViewById(R.id.radioGroup);

        ra=(RadioButton)findViewById(R.id.a);
        rb=(RadioButton)findViewById(R.id.b);
        rc=(RadioButton)findViewById(R.id.c);
        rd=(RadioButton)findViewById(R.id.d);

        Button btn_sure=(Button)findViewById(R.id.sure);
        Button btn_cancel=(Button)findViewById(R.id.cancel);
        btn_sure.setOnClickListener(new btn_sure());
        btn_cancel.setOnClickListener(new btn_cancel());
    }
    class btn_sure implements View.OnClickListener {
        public void onClick(View v){
            String ans="";
            if(ra.isChecked()){
                ans="on";
            }else if(rb.isChecked()){
                ans="at";
            }else if(rc.isChecked()){
                ans="if";
            }else if(rd.isChecked()){
                ans="in";
            }
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,resultActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("ans",ans);
            intent.putExtras(bundle);
            MainActivity.this.startActivity(intent);
        }
    }
    class btn_cancel implements View.OnClickListener {
        public void onClick(View v){
            rag.clearCheck();
            setTitle("");
        }
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1&&resultCode==1){
            Bundle bunde=data.getExtras();
            String ans=bunde.getString("ans");
        }
    }
}

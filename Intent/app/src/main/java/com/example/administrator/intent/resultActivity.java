package com.example.administrator.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.administrator.intent.R.styleable.View;

/**
 * Created by Administrator on 2017/3/23.
 */

public class resultActivity extends Activity {
    private Intent intent;
    private Bundle bunde;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Bundle bunde=this.getIntent().getExtras();
        String ans=bunde.getString("ans");
        String sexText="";
        if(ans.equals("in")){
            sexText="正确";
        }else {
            sexText="错误";
        }
        TextView tv1=(TextView)findViewById(R.id.result);
        tv1.setText("你的选择是："+sexText);
        Button btn_back=(Button)findViewById(R.id.back);
        btn_back.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View v){
               resultActivity.this.setResult(RESULT_OK,intent);
               resultActivity.this.finish();
           }
        });
    }
}

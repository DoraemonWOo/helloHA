package com.example.administrator.menu;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.menu.R;

/**
 * Created by Administrator on 2017/4/6.
 */

public class OptionsMenu extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsmenu);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,1,1,R.string.save);
        menu.add(0,2,2,R.string.exit);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptiionsItemSelected(MenuItem item){
        if(item.getItemId()==2){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

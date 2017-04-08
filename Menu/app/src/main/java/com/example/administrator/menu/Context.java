package com.example.administrator.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.view.ContextMenu.ContextMenuInfo;

/**
 * Created by Administrator on 2017/4/6.
 */

public class Context extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextmenu);
        TextView tv=new TextView(this);
        tv.setText("ContextMenu");
        registerForContextMenu(tv);
        setContentView(tv);
    }

    public boolean onContextItemSelected(MenuItem item){
        super.onContextItemSelected(item);
        switch(item.getItemId()){
            case 1:
                break;
            case 2:
                break;
        }
        return super.onContextItemSelected(item);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        menu.add(0, 1, 1, R.string.newf);
        menu.add(0, 2, 2, R.string.open);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}

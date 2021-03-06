package com.dream.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.dream.base.BaseActivity;
import com.dream.plugin.PluginActivity;

/**
 * 相关模块列表
 */
public class MainActivity extends BaseActivity implements Toolbar.OnMenuItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tb_main_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("William");
        toolbar.setSubtitle("Dream");

        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setOnMenuItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }


    /**
     * This method will be invoked when a menu item is clicked if the item itself did
     * not already handle the event.
     *
     * @param item {@link MenuItem} that was clicked
     * @return <code>true</code> if the event was handled, <code>false</code> otherwise.
     */
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit:
                Toast.makeText(this, "查找按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_share:
                Toast.makeText(this, "分享按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "设置按钮", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_widget: // 控件使用
                ListActivity.startAction(this, ListActivity.PATH_WIDGET, "Widget Demo", R.array.arr_activity);
                break;

            case R.id.btn_plugin: // 插件开发
                startActivity(new Intent(this, PluginActivity.class));
                break;

            case R.id.btn_senior: // 新特性
                ListActivity.startAction(this, ListActivity.PATH_SENIOR, "Senior Demo", R.array.arr_senior);
                break;

            case R.id.btn_view: // 自定义View
                break;

            case R.id.btn_ainm: // 动画详解
                ListActivity.startAction(this, ListActivity.PATH_ANIM, "Anim Demo", R.array.arr_anim);
                break;

            case R.id.btn_net: // 网络相关
                ListActivity.startAction(this, ListActivity.PATH_NET, "Android Net", R.array.arr_net);
                break;
        }
    }


}

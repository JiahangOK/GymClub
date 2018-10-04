package edu.bjtu.gymclub.gymclub;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;

import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;


import java.util.ArrayList;

public class MainInterfaceActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ArrayList<String> menuLists;
    private ArrayAdapter<String> adapter;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    private RadioButton rb_sport, rb_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_interface);


        initView();
//        manager = getSupportFragmentManager();
//
//        rb_sport = (RadioButton) findViewById(R.id.rb_sport);
//        rb_info = (RadioButton) findViewById(R.id.rb_info);
//
//
//        //点击radioButton触发的事件
//        rb_sport.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                transaction = manager.beginTransaction();
//                transaction.replace(R.id.content_layout,new sportFragment());
//                transaction.commit();
//            }
//        });
//
//        rb_info.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                transaction = manager.beginTransaction();
//                transaction.replace(R.id.content_layout,new infoFragment());
//                transaction.commit();
//            }
//        });
//
//        transaction = manager.beginTransaction();
//        transaction.add(R.id.content_layout,new sportFragment());
//        transaction.commit();
//
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
////        ActionBar actionBar=getSupportActionBar();
////        if(actionBar!=null){
////            actionBar.setDisplayHomeAsUpEnabled(true);
////            actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
////        }
//
//        mDrawerList = (ListView)findViewById(R.id.listview);
//        menuLists = new ArrayList<String>();
//        menuLists.add("Home");
//        menuLists.add("Announcement");
//        menuLists.add("Schedule");
//        menuLists.add("Coaches");
//        adapter=new ArrayAdapter<String>(
//                this,android.R.layout.simple_list_item_1,menuLists
//        );
//
//        mDrawerList.setAdapter(adapter);
//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar1);
//        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        if(actionBar != null){
//            actionBar.setDisplayHomeAsUpEnabled(true);
//            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.ic_drawer);
//            int originalWidth = originalBitmap.getWidth();
//            int originalHeight = originalBitmap.getHeight();
//            int newWidth = 100;
//            int newHeight = 150; // 自定义 高度 暂时没用
//            float scale = ((float) newHeight) /originalHeight;
//            Matrix matrix = new Matrix();
//            matrix.postScale(scale, scale);
//            Bitmap changedBitmap = Bitmap.createBitmap(originalBitmap, 0, 0,originalWidth, originalHeight, matrix, true);
//            BitmapDrawable b=new BitmapDrawable(null, changedBitmap);
//            actionBar.setHomeAsUpIndicator(b);
//        }





    }


    private void initView(){

        manager = getSupportFragmentManager();

        rb_sport = (RadioButton) findViewById(R.id.rb_sport);
        rb_info = (RadioButton) findViewById(R.id.rb_info);


        //点击radioButton触发的事件
        rb_sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.replace(R.id.content_layout,new sportFragment());
                transaction.commit();
            }
        });

        rb_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.replace(R.id.content_layout,new infoFragment());
                transaction.commit();
            }
        });
        rb_sport.setChecked(true);

        transaction = manager.beginTransaction();

        transaction.add(R.id.content_layout,new sportFragment());
        rb_sport.setChecked(true);
        transaction.commit();



        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBar actionBar=getSupportActionBar();
//        if(actionBar!=null){
//            actionBar.setDisplayHomeAsUpEnabled(true);
//            actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
//        }

//        mDrawerList = (ListView)findViewById(R.id.listview);
//        menuLists = new ArrayList<String>();
//        menuLists.add("Home");
//        menuLists.add("Announcement");
//        menuLists.add("Schedule");
//        menuLists.add("Coaches");
//        adapter=new ArrayAdapter<String>(
//                this,android.R.layout.simple_list_item_1,menuLists
//        );
//
//        mDrawerList.setAdapter(adapter);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.ic_drawer);
            int originalWidth = originalBitmap.getWidth();
            int originalHeight = originalBitmap.getHeight();
            int newWidth = 100;
            int newHeight = 150; // 自定义 高度 暂时没用
            float scale = ((float) newHeight) /originalHeight;
            Matrix matrix = new Matrix();
            matrix.postScale(scale, scale);
            Bitmap changedBitmap = Bitmap.createBitmap(originalBitmap, 0, 0,originalWidth, originalHeight, matrix, true);
            BitmapDrawable b=new BitmapDrawable(null, changedBitmap);
            actionBar.setHomeAsUpIndicator(b);
        }


        initSideView(mDrawerLayout);
    }


    private void initSideView(DrawerLayout drawerLayout){
        mDrawerList = (ListView)findViewById(R.id.listview);//listview
        menuLists = new ArrayList<String>();//list
        menuLists.add("Home");
        menuLists.add("Announcement");
        menuLists.add("Schedule");
        menuLists.add("Coaches");
        adapter=new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,menuLists
        );

        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(menuLists.get(position).equals("Home")){
                    Intent intent = new Intent(MainInterfaceActivity.this,MainInterfaceActivity.class);
                    startActivity(intent);
                }
                    if(menuLists.get(position).equals("Announcement")){
                    Intent intent = new Intent(MainInterfaceActivity.this,AnnounceActivity.class);
                    startActivity(intent);
                }



            }
        });

        drawerLayout.openDrawer(Gravity.LEFT);//侧滑打开  不设置则不会默认打开
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);

                break;

        }
        return true;
    }




}

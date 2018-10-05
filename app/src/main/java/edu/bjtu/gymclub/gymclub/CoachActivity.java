package edu.bjtu.gymclub.gymclub;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import forcoach.Coach;
import forcoach.CoachAdapter;

public class CoachActivity extends AppCompatActivity {

//    private String[] data = { "Bailie", "Calvin", "Carolyn", "Catharine",
//            "Daisy", "Damon", "Kermit", "Jacob", "Cherry", "Tony","Nathan","Gale","Olivia","Shane","Owen" };
private List<Coach> coachList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);

        //上方蓝色框
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//返回
            }
        });


        //控制listview
        initCoaches();
        CoachAdapter adapter = new CoachAdapter
                (CoachActivity.this, R.layout.coach_member,coachList);
        ListView listView=(ListView)findViewById(R.id.coachlist);
        listView.setAdapter(adapter);

         }



    private void initCoaches(){
        Coach c1 = new Coach("c1",R.drawable.c1);
        coachList.add(c1);
        Coach c2=new Coach("c2",R.drawable.c2);
        coachList.add(c2);
        Coach c3=new Coach("c3",R.drawable.c3);
        coachList.add(c3);
        Coach c4=new Coach("c4",R.drawable.c4);
        coachList.add(c4);
        Coach c5=new Coach( "c5", R.drawable.c5);
        coachList.add(c5);
        Coach c6=new Coach("c6",R.drawable.c6);
        coachList.add(c6);
        Coach c7=new Coach("c7",R.drawable.c7);
        coachList.add(c7);
        Coach c8=new Coach("c8",R.drawable.c8);
        coachList.add(c8);
        Coach c9=new Coach("c9",R.drawable.c9);
        coachList.add(c9);



    }

}

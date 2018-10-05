package edu.bjtu.gymclub.gymclub;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CoachActivity extends AppCompatActivity {

    private String[] data = { "Apple", "Banana", "Orange", "Watermelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (CoachActivity.this, android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.coaches);
        listView.setAdapter(adapter);

         }

}

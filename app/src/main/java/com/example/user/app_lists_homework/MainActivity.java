package com.example.user.app_lists_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whiskies_list);

        TopWhiskies topWhiskies = new TopWhiskies();
        ArrayList<Whisky> list = topWhiskies.getList();

        TopWhiskiesAdapter whiskiesAdapter = new TopWhiskiesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(whiskiesAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.action_about){
//            to take us to a login page (activity)
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}

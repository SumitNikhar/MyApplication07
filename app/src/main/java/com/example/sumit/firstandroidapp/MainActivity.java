package com.example.sumit.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]  mobileArray={"sumit","amit","awdesh","bhushan","harish","Hrithik","salman","Ranbir","Srk","Shahid","NULL","salman","Ranbir","Srk","Shahid","NULL"};
          String str = "Hrithik";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, mobileArray);
        ListView mylist = (ListView) findViewById(R.id.mobile_list);
        mylist.setAdapter(adapter);

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String mobile = String.valueOf(parent.getItemAtPosition(position));
               if(mobile == str) {
                   Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                   startActivity(intent);
                   Toast.makeText(MainActivity.this, mobile, Toast.LENGTH_LONG).show();
               }

            }
        });








    }
}

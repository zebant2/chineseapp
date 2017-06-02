package com.example.hp.chinese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotobasics1(View view){
        Intent intent1 = new Intent (this, Basics1.class);
        startActivity(intent1);
    }
    public void gotobasics2(View view){
        Intent intent2 = new Intent (this, Basics2.class);
        startActivity(intent2);
    }
    public void gotopractice(View view){
        Intent intentp = new Intent (this, Practice.class);
        startActivity(intentp);
    }

    }




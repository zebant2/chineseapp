package com.example.hp.chinese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class lesson1_pg5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_pg5);
    }
    public static class Vars {
        public int points; // Default to 5.

        public void setPoints(int x) {
            this.points = x; // actually "set" the value.
        }

        public int getPoints() {
            return points;
        }

    }




}

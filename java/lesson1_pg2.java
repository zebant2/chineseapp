package com.example.hp.chinese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class lesson1_pg2 extends AppCompatActivity {
public int points= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_pg2);
    }
    public void less1pg3(View view) {
        Intent intentpg3 = new Intent(this, lesson1_pg3.class);
        startActivity(intentpg3);
    }

    public int selector(View v) {
        CheckBox i = (CheckBox) findViewById(R.id.i2);
        boolean isselected = i.isChecked();

        CheckBox son = (CheckBox) findViewById(R.id.son2);
        boolean sonisselected = son.isChecked();

        CheckBox ansdaughter = (CheckBox) findViewById(R.id.daughterans);
        boolean daughterisselected = ansdaughter.isChecked();

        CheckBox you = (CheckBox) findViewById(R.id.you);
        boolean ans1isselected = you.isChecked();

        if (daughterisselected) {
            points = points+1;
            displaycorrect();

        }
        else{
            displaywrong();
        }
        return points;


    }
    void displaywrong() {

        TextView correctans = (TextView) findViewById(R.id.display_total2);
        correctans.setText(" WRONG ");
    }
    void displaycorrect() {

        TextView correctans = (TextView) findViewById(R.id.display_total2);
        correctans.setText(" CORRECT ");
    }


}


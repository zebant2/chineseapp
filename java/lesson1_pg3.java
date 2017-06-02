package com.example.hp.chinese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class lesson1_pg3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_pg3);
    }

    public void less1pg4(View view) {
        Intent intentpg4 = new Intent(this, lesson1_pg4.class);
        startActivity(intentpg4);
    }
    public void selector(View v) {
        CheckBox hello = (CheckBox) findViewById(R.id.hello);
        boolean helloisselected = hello.isChecked();

        CheckBox bye = (CheckBox) findViewById(R.id.byeans);
        boolean ansisselected = bye.isChecked();

        CheckBox sorry = (CheckBox) findViewById(R.id.sorry);
        boolean sorryisselected = sorry.isChecked();

        CheckBox thanks = (CheckBox) findViewById(R.id.thankyou);
        boolean thanksisselected = thanks.isChecked();

        if (ansisselected) {
            displaycorrect();

        }
        else{
            displaywrong();
        }


    }
    void displaywrong() {

        TextView correctans = (TextView) findViewById(R.id.display_total3);
        correctans.setText(" WRONG ");
    }
    void displaycorrect() {

        TextView correctans = (TextView) findViewById(R.id.display_total3);
        correctans.setText(" CORRECT ");
    }
}

package com.example.hp.chinese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class blesson1 extends AppCompatActivity {
    

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_blesson1);
        }

        public void less1pg2(View view) {
            Intent intentpg2 = new Intent(this, lesson1_pg2.class);
            startActivity(intentpg2);
        }

        public void selector(View v) {
            CheckBox woman = (CheckBox) findViewById(R.id.woman1);
            boolean womanisselected = woman.isChecked();

            CheckBox son = (CheckBox) findViewById(R.id.son);
            boolean sonisselected = son.isChecked();

            CheckBox daughter = (CheckBox) findViewById(R.id.daughter);
            boolean daughterisselected = daughter.isChecked();

            CheckBox ans1 = (CheckBox) findViewById(R.id.rightans);
            boolean ans1isselected = ans1.isChecked();

            if (ans1isselected) {
                displaycorrect();
                int points + 1 = points;
            } else {
                displaywrong();
            }


        }

        void displaywrong() {

            TextView correctans = (TextView) findViewById(R.id.display_total);
            correctans.setText(" WRONG ");
        }

        void displaycorrect() {

            TextView correctans = (TextView) findViewById(R.id.display_total);
            correctans.setText(" CORRECT ");
        }
    }
}

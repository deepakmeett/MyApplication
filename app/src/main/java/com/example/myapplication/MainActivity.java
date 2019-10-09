package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5, ed7, ed8, ed9, ed10, ed11, ed12, ed13;
    Button b1;
    RadioGroup rg1;
    RadioButton rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        rg1 = findViewById(R.id.rg1);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        ed9 = findViewById(R.id.ed9);
        ed10 = findViewById(R.id.ed10);
        ed11 = findViewById(R.id.ed11);
        ed12 = findViewById(R.id.ed12);
        ed13 = findViewById(R.id.ed13);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioID = rg1.getCheckedRadioButtonId();
                rb1 = findViewById(radioID);


                String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13;

                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                s3 = ed3.getText().toString();
                s4 = ed4.getText().toString();
                s5 = ed5.getText().toString();
                s6 = rg1.getTouchables().toString();
                s7 = ed7.getText().toString();
                s8 = ed8.getText().toString();
                s9 = ed9.getText().toString();
                s10 = ed10.getText().toString();
                s11 = ed11.getText().toString();
                s12 = ed12.getText().toString();
                s13 = ed13.getText().toString();

                Intent in = new Intent(MainActivity.this, Main2Activity.class);

                in.putExtra("ed1", s1);
                in.putExtra("ed2", s2);
                in.putExtra("ed3", s3);
                in.putExtra("ed4", s4);
                in.putExtra("ed5", s5);
                in.putExtra("rg1", s6);
                in.putExtra("ed7", s7);
                in.putExtra("ed8", s8);
                in.putExtra("ed9", s9);
                in.putExtra("ed10", s10);
                in.putExtra("ed11", s11);
                in.putExtra("ed12", s12);
                in.putExtra("ed13", s13);

                startActivity(in);

            }
        });

    }
}
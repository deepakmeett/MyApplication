package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t4 = findViewById(R.id.textView4);
        t5 = findViewById(R.id.textView5);
        t6 = findViewById(R.id.textView6);
        t7 = findViewById(R.id.textView7);
        t8 = findViewById(R.id.textView8);
        t9 = findViewById(R.id.textView9);
        t10 = findViewById(R.id.textView10);
        t11 = findViewById(R.id.textView11);
        t12 = findViewById(R.id.textView12);
        t13 = findViewById(R.id.textView13);

        Intent i = getIntent();

        String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13;

        s1 = i.getStringExtra("ed1");
        s2 = i.getStringExtra("ed2");
        s3 = i.getStringExtra("ed3");
        s4 = i.getStringExtra("ed4");
        s5 = i.getStringExtra("ed5");
        s6 = i.getStringExtra("ed6");
        s7 = i.getStringExtra("ed7");
        s8 = i.getStringExtra("ed8");
        s9 = i.getStringExtra("ed9");
        s10 = i.getStringExtra("ed10");
        s11 = i.getStringExtra("ed11");
        s12 = i.getStringExtra("ed12");
        s13 = i.getStringExtra("ed13");

        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);
        t5.setText(s5);
        t6.setText(s6);
        t7.setText(s7);
        t8.setText(s8);
        t9.setText(s9);
        t10.setText(s10);
        t11.setText(s11);
        t12.setText(s12);
        t13.setText(s13);
    }
}

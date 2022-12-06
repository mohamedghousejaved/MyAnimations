package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    SharedPreferences sp;
    TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a=findViewById(R.id.textView);

        sp=getSharedPreferences("xcbx",MODE_PRIVATE);
        a.setText(sp.getString("bv","def val"));
        a.setTextColor(Color.BLUE);

    }
}
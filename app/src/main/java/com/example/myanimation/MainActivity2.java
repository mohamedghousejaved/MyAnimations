package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText a;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a=findViewById(R.id.editTextTextPersonName2);
        sp=getSharedPreferences("xcbx",MODE_PRIVATE);

        a.setText(sp.getString("bv","def val"));
    }
}
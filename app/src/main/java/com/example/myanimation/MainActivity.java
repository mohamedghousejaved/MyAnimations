package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation animation;
    Animation unnimation;
    TextView tv;
    ImageView kv;

    EditText sv;
    Button butt;
    SharedPreferences sp;
    SharedPreferences.Editor ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.te);
        kv=findViewById(R.id.imageView);
        butt=findViewById(R.id.button);
        sv=findViewById(R.id.editTextTextPersonName);

        animation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.ro);

        unnimation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.ro);

        tv.startAnimation(animation);

        kv.startAnimation(unnimation);

        sp=getSharedPreferences("xcbx",MODE_PRIVATE);
        ed=sp.edit();

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wss=new Intent(MainActivity.this,MainActivity2.class);
                //wss.putExtra("bv",sv.getText().toString());

                ed.putString("bv",sv.getText().toString());
                ed.commit();
                startActivity(wss);
            }
        });
    }
}
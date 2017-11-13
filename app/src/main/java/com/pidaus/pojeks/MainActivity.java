package com.pidaus.pojeks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move(View view){
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        imageView1.startAnimation(animation1);
    }

    public void up(View view){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.up);
        imageView1.startAnimation(animation1);
    }

    public void down(View view){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.down);
        imageView1.startAnimation(animation1);
    }

    public void left(View view){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
        imageView1.startAnimation(animation1);
    }
}

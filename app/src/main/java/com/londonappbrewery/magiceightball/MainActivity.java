package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Rollbutton;
        Rollbutton=(Button) findViewById(R.id.Rollbutton);
        final int[] imageArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final ImageView ball=(ImageView) findViewById(R.id.image_ball);
        Rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random a=new Random();
                int b=a.nextInt(5);
                ball.setImageResource(imageArray[b]);
            }
        });

    }
}

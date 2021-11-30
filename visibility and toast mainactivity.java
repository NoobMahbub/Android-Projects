package com.techhelpbd.techhelpbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button bGone,bShow,bToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        bGone = findViewById(R.id.bGone);
        bShow = findViewById(R.id.bShow);
        bToast = findViewById(R.id.bToast);

        bShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image.setVisibility(View.VISIBLE);


            }
        });
        bGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.GONE);
            }
        });
        bToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //code here

                Toast.makeText(MainActivity.this,"Hello I am a Toast",Toast.LENGTH_LONG).show();


            }
        });


    }
}

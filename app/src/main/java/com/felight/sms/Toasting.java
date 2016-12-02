package com.felight.navigate;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toasting extends AppCompatActivity {

     Button topleft;
     Button topcenter;
     Button topright;
     Button centerleft;
     Button center;
     Button centerright;
     Button bottomleft;
     Button bottomcenter;
     Button bottomright;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasting);

        topleft = (Button) findViewById(R.id.btntopLeft);
        topcenter = (Button) findViewById(R.id.btntopCenter);
        topright = (Button) findViewById(R.id.btntopRight);
        centerleft = (Button) findViewById(R.id.btncenterLeft);
        center = (Button) findViewById(R.id.btncenter);
        centerright = (Button) findViewById(R.id.btncenterRight);
        bottomleft = (Button) findViewById(R.id.btnbottomLeft);
        bottomcenter = (Button) findViewById(R.id.btnbottomCenter);
        bottomright = (Button) findViewById(R.id.btnbottomRight);

        topleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Top Left",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,150);
                toast.show();
            }
        });


        topcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Top Center",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER,0,150);
                toast.show();
            }
        });


        topright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Top Right",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,150);
                toast.show();
            }
        });

        centerleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Center Left",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
                toast.show();
            }
        });


        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Center center",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
                toast.show();
            }
        });


        centerright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Center Right",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.RIGHT,0,0);
                toast.show();
            }
        });


        bottomleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Bottom Left",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,0,0);
                toast.show();
            }
        });


        bottomright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Bottom Right",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                toast.show();
            }
        });


        bottomcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(getBaseContext(),"Bottom center",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                toast.show();
            }
        });

    }
}


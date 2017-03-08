package com.example.android.apfdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView dashboard_item = (ImageView) findViewById(R.id.item1);
        dashboard_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DashBoardActivity.class);
                startActivity(i);
            }
        });

        ImageView bachrol_item = (ImageView) findViewById(R.id.item2);
        bachrol_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(MainActivity.this, BachrolActivity.class);
                //startActivity(i);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        });

        ImageView bunlde_patch_item = (ImageView) findViewById(R.id.item3);
        bunlde_patch_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(MainActivity.this, BundlePatchActivity.class);
               // startActivity(i);

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oracle.com"));
                startActivity(browserIntent);
            }
        });

        ImageView cpm_item = (ImageView) findViewById(R.id.item4);
        cpm_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CPMActivity.class);
                startActivity(i);
            }
        });

        ImageView fa_item = (ImageView) findViewById(R.id.item5);
        fa_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FAActivity.class);
                startActivity(i);
            }
        });

        ImageView reports_item = (ImageView) findViewById(R.id.item6);
        reports_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ReportsActivity.class);
                startActivity(i);
            }
        });


    }
}

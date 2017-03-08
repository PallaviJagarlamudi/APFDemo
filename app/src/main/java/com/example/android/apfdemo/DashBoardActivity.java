package com.example.android.apfdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        ImageView db_item1 = (ImageView) findViewById(R.id.dbItem1);
        db_item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashBoardActivity.this, DBFirstActivity.class);
                startActivity(i);
            }
        });

        ImageView db_item2 = (ImageView) findViewById(R.id.dbItem2);
        db_item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashBoardActivity.this, DBSecondActivity.class);
                startActivity(i);
            }
        });

        ImageView db_item3 = (ImageView) findViewById(R.id.dbItem3);
        db_item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashBoardActivity.this, DBThirdActivity.class);
                startActivity(i);
            }
        });
    }
}

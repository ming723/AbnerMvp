package com.abner.ming.abnermvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.abner.ming.abnermvp.demo1.ActivityDemo1;
import com.abner.ming.abnermvp.demo2.ActivityDemo2;
import com.abner.ming.abnermvp.httptest.ActivityHttpTest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_main1).setOnClickListener(this);
        findViewById(R.id.tv_main2).setOnClickListener(this);
        findViewById(R.id.tv_main3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_main1:
                startActivity(new Intent(MainActivity.this,ActivityDemo1.class));
                break;
            case R.id.tv_main2:
                startActivity(new Intent(MainActivity.this,ActivityDemo2.class));
                break;
            case R.id.tv_main3:
                startActivity(new Intent(MainActivity.this,ActivityHttpTest.class));
                break;
        }
    }
}

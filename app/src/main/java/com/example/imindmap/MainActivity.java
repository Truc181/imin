package com.example.imindmap;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Thread bamgio=new Thread(){
            public void run()
            {
                try {
                    sleep(3000);
                } catch (Exception e) {

                }
                finally
                {
                    Intent activitymoi=new Intent("com.example.imindmap.dangnhap");
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }

    protected void onPause(){
        super.onPause();
        finish();
    }

    }



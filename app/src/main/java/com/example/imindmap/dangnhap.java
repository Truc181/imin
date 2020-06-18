package com.example.imindmap;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dangnhap extends AppCompatActivity {
    private Button btn_dangky, btn_layMK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        getSupportActionBar().setTitle("Đăng nhập");
        btn_dangky = (Button) findViewById(R.id.btn_dangky);
        btn_layMK = (Button) findViewById(R.id.btn_layMK);
        btn_dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dangnhap.this, dangky.class);
                startActivity(intent);
            }
        });
        btn_layMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dangnhap.this, reset.class);
                startActivity(intent);
            }
        });
    }}


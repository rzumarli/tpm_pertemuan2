package com.example.tpm_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button menuBtnLuas,menuBtnKeliling;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuBtnKeliling = findViewById(R.id.menuBtnKeliling);
        menuBtnLuas = findViewById(R.id.menuBtnLuas);

        menuBtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKeliling = new Intent(getApplicationContext(),kelilingLingkaran.class);
                startActivity(intentKeliling);
            }
        });

        menuBtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLuas = new Intent(getApplicationContext(),luasLingkaran.class);
                startActivity(intentLuas);
            }
        });
    }
}

package com.example.tpm_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luasLingkaran extends AppCompatActivity {
    private EditText valueJariJari;
    private Button btnHasilKeliling;
    private TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);


        valueJariJari = findViewById(R.id.valueJariJari);
        btnHasilKeliling = findViewById(R.id.btnHasilKeliling);
        tvHasil = findViewById(R.id.tvHasil);

        btnHasilKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
//                    double phi = 3,14;
                    String sValueKeliling = valueJariJari.getText().toString();

                    double r = Double.parseDouble(sValueKeliling);

                    double hasil = 0.5*3.14*r*r;

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);

                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

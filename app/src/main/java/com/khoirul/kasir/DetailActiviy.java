package com.khoirul.kasir;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActiviy extends AppCompatActivity {

    protected Cursor cursor;

    TextView nama, harga;
    Button chart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        chart = findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmpNama;
                int tmpHarga;
                tmpNama = nama.getText().toString();
                tmpHarga = Integer.parseInt(harga.getText().toString());


                Toast.makeText(DetailActiviy.this, "barang berhasil ditambahkan ke keranjang", Toast.LENGTH_LONG).show();
                MainActivity.ma.RefreshList();

            }
        });

    }


}
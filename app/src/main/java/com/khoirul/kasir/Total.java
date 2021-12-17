package com.khoirul.kasir;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Total extends AppCompatActivity {

    protected Cursor cursor;
    Database database;
    Button cek;
    ListView listBarang;
    ArrayList<Integer> harga;
    TextView totaluang;
    String[] daftar;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        database = new Database(this);
        SQLiteDatabase db2 = database.getReadableDatabase();
        cursor = db2.rawQuery("SELECT * FROM cart", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for(int i = 0; i < cursor.getCount();i++) {
            cursor.moveToPosition(i);
            daftar[i] = cursor.getString(0).toString();
        }
        listBarang = findViewById(R.id.listBarang);

        listBarang.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));

    }

}
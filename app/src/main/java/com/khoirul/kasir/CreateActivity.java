package com.khoirul.kasir;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;

import java.util.HashMap;
import java.util.Map;

public class CreateActivity extends AppCompatActivity {


    Button simpan;
    EditText nama, harga;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        simpan.setOnClickListener(v -> {
            if(nama.getText().length()>0 && harga.getText().length()>0) {
                saveData(nama.getText().toString(), Integer.parseInt(harga.getText().toString()));

            }else {
                Toast.makeText(getApplicationContext(), "Isi data dulu", Toast.LENGTH_LONG).show();
            }
        });

    }
    private void saveData(String nama, Integer harga) {
        Map<String, Object> data = new HashMap<>();
        data.put("nama", nama);
        data.put("harga", harga);
        db.

    }
}
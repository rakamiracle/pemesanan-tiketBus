package com.najwa.pemesanantiketbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class KelolaJadwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_jadwal);

        // Toolbar initialization
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        // Button initialization
        Button btnTambahJadwal = findViewById(R.id.btn_tambah_jadwal);
        Button btnDataJadwal = findViewById(R.id.btn_data_jadwal);
        Button btnTambahRute = findViewById(R.id.btn_tambah_rute);
        Button btnDataRute = findViewById(R.id.btn_data_rute);

        // Button click listeners
        btnTambahJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KelolaJadwal.this, TambahJadwal.class);
                startActivity(intent);
            }
        });

        btnDataJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KelolaJadwal.this, DataJadwal.class);
                startActivity(intent);
            }
        });

        btnTambahRute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KelolaJadwal.this, TambahRute.class);
                startActivity(intent);
            }
        });

        btnDataRute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KelolaJadwal.this, DataRute.class);
                startActivity(intent);
            }
        });
    }
}

package com.najwa.pemesanantiketbus;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ETiket extends AppCompatActivity {

    TextView tvJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etiket);

        tvJudul = findViewById(R.id.tvJudul);

        // Ambil data dari intent
        String nama = getIntent().getStringExtra("nama");
        String bus = getIntent().getStringExtra("bus");
        String jam = getIntent().getStringExtra("jam");
        String jumlah = getIntent().getStringExtra("jumlah");

        String tiket = "E-Tiket\n" +
                "Nama: " + nama + "\n" +
                "Bus: " + bus + "\n" +
                "Jam: " + jam + "\n" +
                "Jumlah Tiket: " + jumlah;

        tvJudul.setText(tiket);
    }
}


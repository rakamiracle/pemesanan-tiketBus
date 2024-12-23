package com.najwa.pemesanantiketbus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LihatJadwalActivity extends AppCompatActivity {

    // Deklarasi TextView untuk menampilkan jadwal
    private TextView tvJadwal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Mengatur layout untuk activity
        setContentView(R.layout.activity_lihat_jadwal);

        // Menghubungkan komponen UI TextView dengan id yang ada di layout
        tvJadwal = findViewById(R.id.tvJadwal);

        // Memuat jadwal (contoh statis, bisa diganti dengan data dinamis dari API atau database)
        tampilkanJadwal();
    }

    // Method untuk menampilkan jadwal
    private void tampilkanJadwal() {
        // Contoh jadwal statis (bisa diganti dengan data yang dinamis)
        String jadwal = "1. Bus A - 08:00 WIB\n" +
                "2. Bus B - 10:00 WIB\n" +
                "3. Bus C - 15:00 WIB";

        // Menampilkan jadwal pada TextView
        tvJadwal.setText(jadwal);
    }
}

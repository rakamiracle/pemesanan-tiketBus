package com.najwa.pemesanantiketbus;

import com.najwa.pemesanantiketbus.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    Button btnLihatJadwal, btnPesanTiket, btnRiwayat, btnKelola;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Menyambungkan tombol dengan elemen UI di layout
        btnLihatJadwal = findViewById(R.id.btnLihatJadwal);
        btnPesanTiket = findViewById(R.id.btnPesanTiket);
        btnRiwayat = findViewById(R.id.btnRiwayat);
        btnKelola = findViewById(R.id.btnKelola);

        // Menetapkan aksi untuk tombol Lihat Jadwal
        btnLihatJadwal.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, LihatJadwalActivity.class)));

        // Menetapkan aksi untuk tombol Pesan Tiket
        btnPesanTiket.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, PesanTiket.class)));

        // Menetapkan aksi untuk tombol Riwayat Pemesanan
        btnRiwayat.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, RiwayatPemesanan.class)));

        // Menetapkan aksi untuk tombol Kelola
        btnKelola.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, KelolaJadwal.class)));

        // Menghubungkan BottomNavigationView dengan activity
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_menu);

        // Menetapkan listener untuk navigasi menu
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    return true;

                case R.id.nav_search:
                    // Aksi untuk menu search, misalnya membuka aktivitas pencarian
                    startActivity(new Intent(HomeActivity.this, Search.class));
                    return true;

                case R.id.nav_profile:
                    // Aksi untuk menu profile, misalnya membuka profil pengguna
                    startActivity(new Intent(HomeActivity.this, Profile.class));
                    return true;
            }
            return false;
        });
    }
}

package com.najwa.pemesanantiketbus;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class RiwayatPemesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_pemesanan);

        // Inisialisasi Views
        TextView statusPembayaran = findViewById(R.id.status_pembayaran);
        TextView nominal = findViewById(R.id.nominal);
        TextView tanggalTransaksi = findViewById(R.id.tanggal_transaksi);
        TextView tiketTersedia = findViewById(R.id.tiket_tersedia);

        // Set Data Riwayat (Contoh Statik)
        statusPembayaran.setText("Status Pembayaran: Berhasil");
        nominal.setText("Transaksi sebesar Rp 20,000 sukses");
        tanggalTransaksi.setText("17 Des");
        tiketTersedia.setText("Tiket tersedia: 1");
    }
}

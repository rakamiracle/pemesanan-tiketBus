package com.najwa.pemesanantiketbus;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PesanTiket extends AppCompatActivity {

    // Deklarasi variabel untuk komponen UI
    private TextView tvRute, tvTanggal, tvPemesan, tvPenumpang;
    private EditText etNamaPemesan, etNoTelepon, etNamaPenumpang, etJK;
    private Button btnSelanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesantiket);

        // Inisialisasi komponen UI
        tvRute = findViewById(R.id.tvRute);
        tvTanggal = findViewById(R.id.tvTanggal);
        tvPemesan = findViewById(R.id.tvPemesan);
        tvPenumpang = findViewById(R.id.tvPenumpang);

        etNamaPemesan = findViewById(R.id.etNamaPemesan);
        etNoTelepon = findViewById(R.id.etNoHp);
        etNamaPenumpang = findViewById(R.id.etNamaPenumpang);
        etJK = findViewById(R.id.etJenisKelamin);

        btnSelanjutnya = findViewById(R.id.btnSelanjutnya);

        // Menangani event klik tombol Selanjutnya
        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan data input dari EditText
                String namaPemesan = etNamaPemesan.getText().toString().trim();
                String noTelepon = etNoTelepon.getText().toString().trim();
                String namaPenumpang = etNamaPenumpang.getText().toString().trim();
                String jenisKelamin = etJK.getText().toString().trim();

                // Validasi input
                if (TextUtils.isEmpty(namaPemesan) || TextUtils.isEmpty(noTelepon) ||
                        TextUtils.isEmpty(namaPenumpang) || TextUtils.isEmpty(jenisKelamin)) {
                    // Menampilkan pesan jika ada input yang kosong
                    showMessage("Harap isi semua kolom!");
                } else if (!noTelepon.matches("\\d+")) {
                    // Validasi nomor telepon hanya angka
                    showMessage("Nomor telepon harus berupa angka!");
                } else {
                    // Menampilkan data yang dimasukkan
                    showMessage("Data Pemesan: " + namaPemesan + "\n" +
                            "Nomor Telepon: " + noTelepon + "\n" +
                            "Nama Penumpang: " + namaPenumpang + "\n" +
                            "Jenis Kelamin: " + jenisKelamin);
                }
            }
        });
    }

    // Fungsi untuk menampilkan pesan (misalnya Toast)
    private void showMessage(String message) {
        Toast.makeText(PesanTiket.this, message, Toast.LENGTH_SHORT).show();
    }
}

package com.najwa.pemesanantiketbus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity {

    private EditText etSearch;
    private Button btnSearch;
    private TextView tvResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Menyambungkan elemen UI
        etSearch = findViewById(R.id.etSearch);
        btnSearch = findViewById(R.id.btnSearch);
        tvResult = findViewById(R.id.tvResult);

        // Menetapkan aksi tombol pencarian
        btnSearch.setOnClickListener(v -> {
            // Mengambil input pencarian dari EditText
            String query = etSearch.getText().toString().trim();

            // Mengecek apakah input pencarian kosong
            if (!query.isEmpty()) {
                // Menampilkan hasil pencarian (sederhana hanya menampilkan kata kunci pencarian)
                tvResult.setText("Hasil pencarian untuk: " + query);
                // Anda dapat menambahkan logika pencarian lebih lanjut sesuai kebutuhan
            } else {
                tvResult.setText("Masukkan kata kunci pencarian.");
            }
        });
    }
}

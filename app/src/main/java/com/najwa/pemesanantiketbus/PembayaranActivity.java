package com.najwa.pemesanantiketbus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PembayaranActivity extends AppCompatActivity {

    TextView tvDetail;
    EditText edtNama, edtJumlah;
    Button btnBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        tvDetail = findViewById(R.id.tvDetail);
        edtNama = findViewById(R.id.edtNama);
        edtJumlah = findViewById(R.id.edtJumlah);
        btnBayar = findViewById(R.id.btnBayar);

        // Ambil data dari intent
        String bus = getIntent().getStringExtra("bus");
        String jam = getIntent().getStringExtra("jam");
        tvDetail.setText("Bus: " + bus + "\nJam: " + jam);

        btnBayar.setOnClickListener(v -> {
            String nama = edtNama.getText().toString();
            String jumlah = edtJumlah.getText().toString();

            if (!nama.isEmpty() && !jumlah.isEmpty()) {
                Intent intent = new Intent(PembayaranActivity.this, ETiket.class);
                intent.putExtra("nama", nama);
                intent.putExtra("bus", bus);
                intent.putExtra("jam", jam);
                intent.putExtra("jumlah", jumlah);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Isi semua kolom", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

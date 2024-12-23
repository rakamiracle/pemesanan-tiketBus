package com.najwa.pemesanantiketbus;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Registrasi extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        edtUsername = findViewById(R.id.etNamaLengkap);
        edtPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnDaftar);

        btnRegister.setOnClickListener(v -> {
            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();

            SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(username, password);
            editor.apply();

            Toast.makeText(this, "Registrasi berhasil", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}


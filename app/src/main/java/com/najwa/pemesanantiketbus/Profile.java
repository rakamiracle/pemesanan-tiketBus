package com.najwa.pemesanantiketbus;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private ImageView imgProfile;
    private TextView tvName, tvEmail;
    private Button btnEditProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Menyambungkan UI dengan elemen layout
        imgProfile = findViewById(R.id.imgProfile);
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        btnEditProfile = findViewById(R.id.btnEditProfile);

        // Menetapkan data profil pengguna (misalnya data dari shared preferences atau database)
        String userName = "John Doe";  // Gantilah dengan nama pengguna
        String userEmail = "john.doe@example.com";  // Gantilah dengan email pengguna

        tvName.setText(userName);
        tvEmail.setText(userEmail);

        // Aksi ketika tombol Edit Profil ditekan
        btnEditProfile.setOnClickListener(v -> {
            // Gantilah dengan aktivitas edit profil jika ada
            // startActivity(new Intent(ProfileActivity.this, EditProfileActivity.class));
        });
    }
}

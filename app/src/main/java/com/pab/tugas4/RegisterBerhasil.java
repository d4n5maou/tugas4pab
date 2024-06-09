package com.pab.tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_berhasil);

        TextView usernameTextView = findViewById(R.id.usernameTextview);
        TextView passwordTextView = findViewById(R.id.passwordTextview);
        TextView emailTextView = findViewById(R.id.emailTextview);

        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String password = intent.getStringExtra("PASSWORD");
        String email = intent.getStringExtra("EMAIL");

        usernameTextView.setText(": " + username);
        passwordTextView.setText(": " + password);
        emailTextView.setText(": " + email);
    }
}

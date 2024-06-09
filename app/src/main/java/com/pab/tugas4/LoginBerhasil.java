package com.pab.tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_berhasil);

        TextView usernameTextView = findViewById(R.id.usernameTextview);
        TextView passwordTextView = findViewById(R.id.passwordTextview);

        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String password = intent.getStringExtra("PASSWORD");

        usernameTextView.setText(": " + username);
        passwordTextView.setText(": " + password);
    }
}

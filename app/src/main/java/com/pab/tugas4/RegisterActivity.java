package com.pab.tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        // Find the login button and set an OnClickListener
        Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(intent);
        });

        EditText usernameEditText = findViewById(R.id.fusername);
        EditText passwordEditText = findViewById(R.id.fpassword);
        EditText emailEditText = findViewById(R.id.femail);
        Button createButton = findViewById(R.id.btnCreate);

        createButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String email = emailEditText.getText().toString();

            Intent intent = new Intent(RegisterActivity.this, RegisterBerhasil.class);
            intent.putExtra("USERNAME", username);
            intent.putExtra("PASSWORD", password);
            intent.putExtra("EMAIL", email);
            startActivity(intent);
        });
    }
}

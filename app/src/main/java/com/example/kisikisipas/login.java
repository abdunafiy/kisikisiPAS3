package com.example.kisikisipas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {
    // SharedPreferences file name
    private static final String PREFS_NAME = "MyPrefsFile";
    Button btnLogin;
    EditText txtUsername, txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Get SharedPreferences object
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        txtUsername =  findViewById(R.id.txtUSERNAME);
        txtpassword =  findViewById(R.id.txtPASWORD);
        btnLogin =  findViewById(R.id.tombol);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // menyimpan sharedpreference
                editor.putString("username", txtUsername.getText().toString());
                editor.apply();

                // intent ke home
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
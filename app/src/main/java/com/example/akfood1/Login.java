package com.example.akfood1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button btnLogin;
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.buttonOk);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                String strEmail = credentials.getString("Username", null);
                String strPassword = credentials.getString("Password", null);

                String email_from_ed = username.getText().toString();
                String password_from_ed = password.getText().toString();

                if (strEmail != null && email_from_ed != null && strEmail.equalsIgnoreCase(email_from_ed)) {
                    if (strPassword != null && password_from_ed != null && strPassword.equalsIgnoreCase(password_from_ed)) {
                        Toast.makeText(Login.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Login.this,MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
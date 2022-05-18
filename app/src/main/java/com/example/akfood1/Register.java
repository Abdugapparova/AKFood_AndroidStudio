package com.example.akfood1;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    private EditText username;
    private EditText phoneNumber;
    private EditText email;
    private EditText password;
    private EditText confPass;
    private Button btnCreateUser;

    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";
    public static final int REQUEST_CODE_WRITE_PERM = 401;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        phoneNumber=findViewById(R.id.phoneNumber);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confPass = findViewById(R.id.confPass);
        btnCreateUser = findViewById(R.id.buttonOk);

        btnCreateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strPassword = password.getText().toString();
                String strConfirmPassword = confPass.getText().toString();
                String strUsername = username.getText().toString();
                String strEmail = email.getText().toString();
                String strPhoneNumber = phoneNumber.getText().toString();

                if (strPassword != null && strConfirmPassword != null && strPassword.equalsIgnoreCase(strConfirmPassword)) {
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = credentials.edit();
                    editor.putString("Password", strPassword);
                    editor.putString("Username", strUsername);
                    editor.putString("Email", strEmail);
                    editor.putString("Phone Number", strPhoneNumber);
                    editor.commit();

                    Register.this.finish();
                }
            }
        });
    }
}

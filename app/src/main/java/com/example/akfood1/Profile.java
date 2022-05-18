package com.example.akfood1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Login.class);
                startActivity(intent);
            }
        });
        Button register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Register.class);
                startActivity(intent);
            }
        });
    }
}

//    /** CustomAlertDialog */
//    public void showAlertDialog() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder
//                .setTitle("AlertDialogExample!")
//                .setMessage("Do you want to close this application ?")
//                .setCancelable(false)
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        finish();
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        dialog.cancel();
//                    }
//                });
//
//        AlertDialog alert = builder.create();
//        alert.show();
//    }
//
//    EditText name,surname,password,phoneNumber,email;
//    Button buttonOk;
    /** CustomDialog */
//    public void showCustomDialog() {
//        Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.register);
//
//        EditText editText = dialog.getWindow().findViewById(R.id.loginText);
//
//        Button btn = dialog.getWindow().findViewById(R.id.buttonOk);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String val = editText.getText().toString();
//                Toast.makeText(getApplicationContext(), val, Toast.LENGTH_LONG).show();
//                dialog.dismiss();
//
//            }
//        });
//        dialog.show();
//    }


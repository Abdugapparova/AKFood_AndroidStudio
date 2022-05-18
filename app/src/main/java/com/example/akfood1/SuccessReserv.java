package com.example.akfood1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akfood1.orders.OrderSuccess;

public class SuccessReserv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_reserv);

        Button button= findViewById(R.id.goToHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SuccessReserv.this, MainActivity.class));

            }
        });
    }
}
package com.example.akfood1.orders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.navigation.Navigation;

import com.example.akfood1.MainActivity;
import com.example.akfood1.R;

public class OrderSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_success);

        Button button= findViewById(R.id.goToHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OrderSuccess.this, MainActivity.class));

            }
        });
    }
}
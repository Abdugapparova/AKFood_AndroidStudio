package com.example.akfood1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class History extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView textView=findViewById(R.id.textView23);
        TextView textView1=findViewById(R.id.textView40);
        TextView textView2=findViewById(R.id.textView41);
        TextView textView3=findViewById(R.id.textView42);

        SharedPreferences prefs = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_WORLD_READABLE);
        textView.setText(prefs.getString("Number of people",""));
        textView1.setText(prefs.getString("Choose Time",""));
        textView2.setText(prefs.getString("Choose Date",""));
        textView3.setText(prefs.getString("Select seating type",""));

    }
}
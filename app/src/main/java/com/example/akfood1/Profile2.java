package com.example.akfood1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.akfood1.orders.Orders;

public class Profile2 extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        TextView textView=findViewById(R.id.textView6);
        TextView textView1=findViewById(R.id.textView13);
        TextView textView2=findViewById(R.id.textView11);
        TextView textView3=findViewById(R.id.textView12);

        SharedPreferences prefs = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_WORLD_READABLE);
        textView.setText(prefs.getString("Username",""));
        textView1.setText(prefs.getString("Email",""));
        textView2.setText(prefs.getString("Phone Number",""));
        textView3.setText(prefs.getString("Password",""));

        Button logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Profile2.this,Profile.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.about_us) {
            startActivity(new Intent(this, AboutUs.class));
            return true;
        }
        else if(item.getItemId()==R.id.homepage){
            startActivity(new Intent(this,MainActivity.class));
            return true;
        }
        else if (item.getItemId() == R.id.orders) {
            startActivity(new Intent(Profile2.this, Orders.class));
            return true;
        }
        else if (item.getItemId() == R.id.reserv) {
            startActivity(new Intent(Profile2.this, Reservation.class));
            return true;
        }
        else if(item.getItemId()==R.id.profile){
            startActivity(new Intent(Profile2.this, Profile2.class));
            return true;
        }
        else if(item.getItemId()==R.id.searchMenu){
            startActivity(new Intent(Profile2.this,SearchResults.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
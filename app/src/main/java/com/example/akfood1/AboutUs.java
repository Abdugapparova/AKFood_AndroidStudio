package com.example.akfood1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.akfood1.orders.Orders;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
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
            startActivity(new Intent(AboutUs.this, Orders.class));
            return true;
        }
        else if (item.getItemId() == R.id.reserv) {
            startActivity(new Intent(AboutUs.this, Reservation.class));
            return true;
        }
        else if(item.getItemId()==R.id.profile){
            startActivity(new Intent(AboutUs.this, Profile2.class));
            return true;
        }
        else if(item.getItemId()==R.id.searchMenu){
            startActivity(new Intent(AboutUs.this,SearchResults.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
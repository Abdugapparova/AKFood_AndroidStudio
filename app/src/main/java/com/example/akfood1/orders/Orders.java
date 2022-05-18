package com.example.akfood1.orders;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.akfood1.AboutUs;
import com.example.akfood1.MainActivity;
import com.example.akfood1.Profile2;
import com.example.akfood1.R;
import com.example.akfood1.Reservation;
import com.example.akfood1.SearchResults;
import com.example.akfood1.orders.fragments.OrderNoodles;
import com.example.akfood1.topCategories.FastFood;

public class Orders extends AppCompatActivity {
    Button orderOnline;
    Button orderRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders2);

        orderOnline=findViewById(R.id.orderOnline);
        orderRes=findViewById(R.id.orderRes);
        //Log.d("Orders", "onCreate");

        orderOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Orders.this, OrderOnline.class);
                startActivity(intent);
            }
        });
        orderRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Orders.this, OrderInRestaurant.class);
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
        else if (item.getItemId() == R.id.orders) {
            startActivity(new Intent(Orders.this, Orders.class));
            return true;
        }
        else if (item.getItemId() == R.id.reserv) {
            startActivity(new Intent(Orders.this, Reservation.class));
            return true;
        }
        else if(item.getItemId()==R.id.profile){
            startActivity(new Intent(Orders.this, Profile2.class));
            return true;
        }
        else if(item.getItemId()==R.id.searchMenu){
            startActivity(new Intent(Orders.this, SearchResults.class));
            return true;
        }
        else if(item.getItemId()==R.id.homepage){
            startActivity(new Intent(this,MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
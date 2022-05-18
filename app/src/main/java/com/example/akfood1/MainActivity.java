package com.example.akfood1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.akfood1.orders.Orders;
import com.example.akfood1.topCategories.Dessert;
import com.example.akfood1.topCategories.FastFood;
import com.example.akfood1.topCategories.Cake;
import com.example.akfood1.topCategories.Restaurant;
import com.example.akfood1.topCategories.Soups;
import com.example.akfood1.typeOfFoods.Burgers;
import com.example.akfood1.typeOfFoods.Noodles;
import com.example.akfood1.typeOfFoods.Pizza;
import com.example.akfood1.typeOfFoods.Soups2;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";
//    private Dishes dish=new Dishes(1,"Chicken Burger",1500.0,"Fast Food");
//    private Dishes dish1=new Dishes(2,"Chicken Nuggets",1750.0,"Fast Food");



    public int PxToDp(int px) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px, getResources().getDisplayMetrics());
    }

    EditText text_edit;
    LinearLayout lin_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        text_edit = findViewById(R.id.search);
        lin_list = findViewById(R.id.lin_pad);
        Log.d(TAG, "onCreate");


        TextView fastFood = findViewById(R.id.fastfood);
        fastFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FastFood.class);
                startActivity(intent);
            }
        });
        TextView dessert = findViewById(R.id.dessert);
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dessert.class);
                startActivity(intent);
            }
        });
        TextView soups = findViewById(R.id.soup);
        soups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Soups.class);
                startActivity(intent);
            }
        });
        TextView res = findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Restaurant.class);
                startActivity(intent);
            }
        });
        TextView cake = findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cake.class);
                startActivity(intent);
            }
        });
        ImageView noodle = findViewById(R.id.noodle);
        noodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Noodles.class);
                startActivity(intent);
            }
        });
        ImageView pizza = findViewById(R.id.pizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pizza.class);
                startActivity(intent);
            }
        });
        ImageView burger = findViewById(R.id.burger);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Burgers.class);
                startActivity(intent);
            }
        });
        ImageView soup = findViewById(R.id.soupp);
        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Soups2.class);
                startActivity(intent);
            }
        });
        Button button = findViewById(R.id.menu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuPage.class);
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
            startActivity(new Intent(MainActivity.this, Orders.class));
            return true;
        }
        else if (item.getItemId() == R.id.reserv) {
            startActivity(new Intent(MainActivity.this, Reservation.class));
            return true;
        }
        else if(item.getItemId()==R.id.profile){
            startActivity(new Intent(MainActivity.this, Profile2.class));
            return true;
        }
        else if(item.getItemId()==R.id.searchMenu){
            startActivity(new Intent(MainActivity.this,SearchResults.class));
            return true;
        }
        else if(item.getItemId()==R.id.homepage){
            startActivity(new Intent(this,MainActivity.class));
            return true;
        }
        else if(item.getItemId()==R.id.history){
            startActivity(new Intent(this,History.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

}
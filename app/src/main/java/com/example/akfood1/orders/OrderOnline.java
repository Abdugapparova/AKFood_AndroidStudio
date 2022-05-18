package com.example.akfood1.orders;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.akfood1.R;
import com.example.akfood1.models.Dishes;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OrderOnline extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";
    private Dishes dish = new Dishes(1, "Chicken Burger", 1000.0, "Burgers");
    private Dishes dish1 = new Dishes(2, "Cheese Burger", 1200.0, "Burgers");
    private Dishes dish2 = new Dishes(3, "Beef Burger", 1500.0, "Burgers");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_online);

//        List<Dishes> dishes = new ArrayList<>();
//        dishes.add(dish);
//        dishes.add(dish1);
//        dishes.add(dish2);
//
//        SharedPreferences mPrefs = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
//        SharedPreferences.Editor prefsEditor = mPrefs.edit();
//        Gson gson = new Gson();
//        String json = gson.toJson(dishes);
//        prefsEditor.putString("Dishes", json);
//        prefsEditor.commit();
//
//        TextView textView = findViewById(R.id.textView24);
//        Gson gson1 = new Gson();
//        String json1 = mPrefs.getString("Dishes", "");
//        Type type = new TypeToken<List<Dishes>>() {
//        }.getType();
//        List<Dishes> dishesList = gson1.fromJson(json1, type);
//        textView.setText("\n" + dishesList);
    }
}
package com.example.akfood1;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.akfood1.models.Dishes;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MenuPage extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";
    private Dishes dish = new Dishes(1, "Chicken Burger", 1000.0, "Burgers");
    private Dishes dish1 = new Dishes(2, "Cheese Burger", 1200.0, "Burgers");
    private Dishes dish2 = new Dishes(3, "Beef Burger", 1500.0, "Burgers");

    private Dishes dish3 = new Dishes(4, "CheeseBurger Pizza", 2300.0, "Pizza");
    private Dishes dish4 = new Dishes(5, "Cheese Pizza", 1800.0, "Pizza");
    private Dishes dish5 = new Dishes(6, "Carbonara", 2300.0, "Pizza");

    private Dishes dish6 = new Dishes(7, "Espresso Tiramisu", 6600.0, "Dessert");
    private Dishes dish7 = new Dishes(8, "Cheese Cake", 10000.0, "Dessert");
    private Dishes dish8 = new Dishes(9, "Classic Creme Brulee", 2500.0, "Dessert");

    private Dishes dish9 = new Dishes(10, "Chilled Apple Ginger Soup", 3500.0, "Soups");
    private Dishes dish10 = new Dishes(11, "Hearty Grains and Butternut Squash Soup", 4000.0, "Soups");
    private Dishes dish11 = new Dishes(12, "Roasted Jalapeno and Corn Chowder", 5500.0, "Soups");

    private Dishes dish12 = new Dishes(13, "Spicy Korean Beef Noodle", 3200.0, "Noodles");
    private Dishes dish13 = new Dishes(14, "Cheese Tortelloni Rosa", 2300.0, "Noodles");
    private Dishes dish14 = new Dishes(15, "Japanese Pan Noodles with Tofu", 4500.0, "Noodles");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        List<Dishes> dishes = new ArrayList<>();
        dishes.add(dish);
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
        dishes.add(dish6);
        dishes.add(dish7);
        dishes.add(dish8);
        dishes.add(dish9);
        dishes.add(dish10);
        dishes.add(dish11);
        dishes.add(dish12);
        dishes.add(dish13);
        dishes.add(dish14);

        SharedPreferences mPrefs = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(dishes);
        prefsEditor.putString("Dishes", json);
        prefsEditor.commit();

        TextView textView = findViewById(R.id.textView24);
        Gson gson1 = new Gson();
        String json1 = mPrefs.getString("Dishes", "");
        Type type = new TypeToken<List<Dishes>>() {}.getType();
        List<Dishes> dishesList = gson1.fromJson(json1, type);
        textView.setText("\n"+dishesList);
    }
}


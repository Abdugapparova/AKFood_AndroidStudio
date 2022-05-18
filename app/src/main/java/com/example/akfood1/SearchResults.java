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
import android.widget.Toast;

import com.example.akfood1.models.Dishes;
import com.example.akfood1.orders.Orders;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SearchResults extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "dishes";
    private final static String DISHES_INFO_LIST_TAG = "DISHES_INFO_LIST_TAG";
    private EditText searchText;

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
        setContentView(R.layout.activity_search_results);
        TextView textView = findViewById(R.id.textView9);



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

        /// Save info
        SharedPreferences mPrefs = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        //BURGERS
        prefsEditor.putString("name","Chicken Burger");
        prefsEditor.putString("price","1000.0");
        prefsEditor.putString("type","Burgers");

        prefsEditor.putString("name1","Cheese Burger");
        prefsEditor.putString("price","1200.0");
        prefsEditor.putString("type1","Burgers");

        prefsEditor.putString("name6","Beef Burger");
        prefsEditor.putString("price6","1500.0");
        prefsEditor.putString("type6","Burgers");

        //PIZZA
        prefsEditor.putString("name2","Carbonara");
        prefsEditor.putString("price2","2300.0");
        prefsEditor.putString("type2","Pizza");

        prefsEditor.putString("name7","CheeseBurger Pizza");
        prefsEditor.putString("price7","2300.0");
        prefsEditor.putString("type7","Pizza");

        prefsEditor.putString("name8","Cheese Pizza");
        prefsEditor.putString("price8","1800.0");
        prefsEditor.putString("type8","Pizza");

        // DESSERT
        prefsEditor.putString("name3","Cheese Cake");
        prefsEditor.putString("price3","10000.0");
        prefsEditor.putString("type3","Dessert");

        // NOODLES
        prefsEditor.putString("name4","Spicy Korean Beef Noodle");
        prefsEditor.putString("price4","3200.0");
        prefsEditor.putString("type4","Noodles");

        prefsEditor.putString("name5","Cheese Tortelloni Rosa");
        prefsEditor.putString("price5","2300.0");
        prefsEditor.putString("type5","Noodles");
        prefsEditor.commit();

        //String price=mPrefs.getString("price","");
//        if(name.equalsIgnoreCase(search)){
//            textView.setText(name+"\n"+price);
//        }

        searchText=findViewById(R.id.search);
        Button button = findViewById(R.id.searchButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    String name = credentials.getString("name", null);
                    String price = credentials.getString("price", null);
                    String type = credentials.getString("type", null);

                    String name1=credentials.getString("name1",null);
                    String price1=credentials.getString("price1",null);
                    String type1=credentials.getString("type1",null);

                    String name2=credentials.getString("name2",null);
                    String price2=credentials.getString("price2",null);
                    String type2=credentials.getString("type2",null);

                    String name3=credentials.getString("name3",null);
                    String price3=credentials.getString("price3",null);
                    String type3=credentials.getString("type3",null);

                    String name4=credentials.getString("name4",null);
                    String price4=credentials.getString("price4",null);
                    String type4=credentials.getString("type4",null);

                    String name5=credentials.getString("name5",null);
                    String price5=credentials.getString("price5",null);
                    String type5=credentials.getString("type5",null);

                    String name6=credentials.getString("name6",null);
                    String price6=credentials.getString("price6",null);
                    String type6=credentials.getString("type6",null);

                    String name7=credentials.getString("name7",null);
                    String price7=credentials.getString("price7",null);
                    String type7=credentials.getString("type7",null);

                    String name8=credentials.getString("name8",null);
                    String price8=credentials.getString("price8",null);
                    String type8=credentials.getString("type8",null);
                    String search = searchText.getText().toString();


                    if (name != null && name.equals(search)) {
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name+"\nPrice:"+price+"\nType:"+type);
                    }
                    else if(name1 != null && name1.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name1+"\nPrice:"+price1+"\nType:"+type1);
                    }
                    else if(name2 != null && name2.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name2+"\nPrice:"+price2+"\nType:"+type2);
                    }
                    else if(name3 != null && name3.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name3+"\nPrice:"+price3+"\nType:"+type3);
                    }
                    else if(name4 != null && name4.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name4+"\nPrice:"+price4+"\nType:"+type4);
                    }
                    else if(name5 != null && name5.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name5+"\nPrice:"+price5+"\nType:"+type5);
                    }
                    else if(name6 != null && name6.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name6+"\nPrice:"+price6+"\nType:"+type6);
                    }
                    else if(name7 != null && name7.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name7+"\nPrice:"+price7+"\nType:"+type7);
                    }
                    else if(name8 != null && name8.equals(search)){
                        Toast.makeText(SearchResults.this, "Successful!", Toast.LENGTH_SHORT).show();
                        textView.setText("Name:"+name8+"\nPrice:"+price8+"\nType:"+type8);
                    }

                    else {
                        Toast.makeText(SearchResults.this, "Fail", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        //Gson gson = new Gson();
        //String json = gson.toJson(dishes);
        //prefsEditor.putString("Dishes", json);
        //prefsEditor.commit();

        // Get info from database by dish name
//
//        Gson gson1 = new Gson();
//        String json1 = mPrefs.getString("Dishes", "");
//        Type type = new TypeToken<List<Dishes>>() {
//        }.getType();
//        List<Dishes> dishesList = gson1.fromJson(json1, type);
//
//        //-----------------
//
//
//        String result = null;
//        int length = dishesList.size();
//
//        for (int i = 0; i < length; i++) {
//            Dishes dishInfoDto = dishesList.get(i);
//            StringBuffer dishInfoBuf = new StringBuffer();
//            dishInfoBuf.append("\nName: ");
//            dishInfoBuf.append(dishInfoDto.getName());
//            dishInfoBuf.append("\nPrice: ");
//            dishInfoBuf.append(dishInfoDto.getPrice());
//            dishInfoBuf.append("\nType: ");
//            dishInfoBuf.append(dishInfoDto.getType());
//            //textView.setText(dishInfoDto.toString());
//
//            Button button = findViewById(R.id.searchButton);
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (dishInfoDto.getName().equalsIgnoreCase(search)) {
//                        textView.setText(dishInfoDto.toString());
//                    }
//                }
//            });
//        }


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
            startActivity(new Intent(SearchResults.this, Orders.class));
            return true;
        }
        else if (item.getItemId() == R.id.reserv) {
            startActivity(new Intent(SearchResults.this, Reservation.class));
            return true;
        }
        else if(item.getItemId()==R.id.profile){
            startActivity(new Intent(SearchResults.this, Profile2.class));
            return true;
        }
        else if(item.getItemId()==R.id.searchMenu){
            startActivity(new Intent(SearchResults.this,SearchResults.class));
            return true;
        }
        else if(item.getItemId()==R.id.homepage){
            startActivity(new Intent(this,MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}



package com.example.akfood1.orders;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.example.akfood1.R;

public class MyOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        TextView text=findViewById(R.id.myOrderText);
        TextView text1=findViewById(R.id.myOrderText1);
        TextView text2=findViewById(R.id.myOrderText2);
        TextView text3=findViewById(R.id.myOrderText3);

        SharedPreferences prefs = getSharedPreferences("Burger", Context.MODE_PRIVATE);
        String name=prefs.getString("name","");
        String price=prefs.getString("price","");
        String type=prefs.getString("type","");

        text.setText("Name:" + name + "\nPrice:" + price + "\nType:" + type);

        String name1=prefs.getString("name1","");
        String price1=prefs.getString("price1","");
        String type1=prefs.getString("type1","");

        text.setText("Name:" + name1 + "\nPrice:" + price1 + "\nType:" + type1);

        String name2=prefs.getString("name2","");
        String price2=prefs.getString("price2","");
        String type2=prefs.getString("type2","");

        text.setText("Name:" + name2 + "\nPrice:" + price2 + "\nType:" + type2);

        SharedPreferences prefs2 = getSharedPreferences("Dessert", Context.MODE_PRIVATE);
        String name3=prefs2.getString("name","");
        String price3=prefs2.getString("price","");
        String type3=prefs2.getString("type","");

        text1.setText("Name:"+name3+"\nPrice:"+price3+"\nType:"+type3);

        SharedPreferences prefs3 = getSharedPreferences("Noodles", Context.MODE_PRIVATE);
        String name4=prefs3.getString("name","");
        String price4=prefs3.getString("price","");
        String type4=prefs3.getString("type","");

        text2.setText("Name:"+name4+"\nPrice:"+price4+"\nType:"+type4);

        SharedPreferences prefs4 = getSharedPreferences("Soups", Context.MODE_PRIVATE);
        String name5=prefs4.getString("name","");
        String price5=prefs4.getString("price","");
        String type5=prefs4.getString("type","");

        text3.setText("Name:"+name5+"\nPrice:"+price5+"\nType:"+type5);

        Button button= findViewById(R.id.placeOrder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyOrder.this,OrderSuccess.class));
            }
        });
    }
}
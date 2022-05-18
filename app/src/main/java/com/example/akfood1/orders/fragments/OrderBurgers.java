package com.example.akfood1.orders.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.example.akfood1.R;
import com.example.akfood1.models.Dishes;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderBurgers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderBurgers extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    //SharedPreferences mPrefs = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OrderBurgers() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderBurgers.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderBurgers newInstance(String param1, String param2) {
        OrderBurgers fragment = new OrderBurgers();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    Button button2;
    Button button3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_order_burgers, container, false);
        button2 =view.findViewById(R.id.b2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_orderBurgers_to_orderSoups);
            }
        });
        button3 =view.findViewById(R.id.b3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_orderBurgers_to_orderNoodles);
            }
        });

        ImageView cBurger= view.findViewById(R.id.cheeseburger);
        cBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSharedPreferences("Burger1", Context.MODE_PRIVATE).edit()
                        .putString("name","Cheese Burger")
                        .putString("price","1200.0")
                        .putString("type","Burgers").apply();
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });
        ImageView beefB= view.findViewById(R.id.beefBurger);
        beefB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSharedPreferences("Burger1", Context.MODE_PRIVATE).edit()
                        .putString("name1","Beef Burger")
                        .putString("price1","1500.0")
                        .putString("type1","Burgers").apply();
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });
        ImageView chickenB= view.findViewById(R.id.chickenBurger);
        chickenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSharedPreferences("Burger1", Context.MODE_PRIVATE).edit()
                        .putString("name2","Chicken Burger")
                        .putString("price2","1000.0")
                        .putString("type2","Burgers").apply();
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });

        Button button= view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });
        return view;
    }
}
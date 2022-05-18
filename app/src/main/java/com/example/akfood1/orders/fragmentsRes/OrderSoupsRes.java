package com.example.akfood1.orders.fragmentsRes;

import android.content.Context;
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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderSoupsRes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderSoupsRes extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OrderSoupsRes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderSoups.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderSoupsRes newInstance(String param1, String param2) {
        OrderSoupsRes fragment = new OrderSoupsRes();
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

    Button button1;
    Button button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_order_soups_r, container, false);
        button1 =view.findViewById(R.id.b4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_orderSoupsRes_to_orderBurgersRes2);
            }
        });
        button2 =view.findViewById(R.id.b5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_orderSoupsRes_to_orderDessertsRes2);
            }
        });
        Button button= view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.myOrder2);

            }
        });
        ImageView cBurger= view.findViewById(R.id.appleSoup);
        cBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSharedPreferences("Soups", Context.MODE_PRIVATE).edit()
                        .putString("name","Chilled Apple Ginger Soup")
                        .putString("price","3500.0")
                        .putString("type","Soups").apply();
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });
        TextView beefB= view.findViewById(R.id.squashSoupT);
        beefB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSharedPreferences("Soups", Context.MODE_PRIVATE).edit()
                        .putString("name1","Hearty Grains and Butternut Squash Soup")
                        .putString("price1","4000.0")
                        .putString("type1","Soups").apply();
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });
        ImageView chickenB= view.findViewById(R.id.cornSoup);
        chickenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSharedPreferences("Soups", Context.MODE_PRIVATE).edit()
                        .putString("name2","Roasted Jalapeno and Corn Chowder")
                        .putString("price2","5500.0")
                        .putString("type2","Soups").apply();
                Navigation.findNavController(view).navigate(R.id.myOrder);
            }
        });
        return view;
    }
}
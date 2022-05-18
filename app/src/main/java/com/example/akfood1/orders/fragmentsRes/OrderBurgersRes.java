package com.example.akfood1.orders.fragmentsRes;

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
 * Use the {@link OrderBurgersRes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderBurgersRes extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OrderBurgersRes() {
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
    public static OrderBurgersRes newInstance(String param1, String param2) {
        OrderBurgersRes fragment = new OrderBurgersRes();
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
        View view= inflater.inflate(R.layout.fragment_order_burgers_r, container, false);
        button2 =view.findViewById(R.id.b2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_orderDessertsRes2_to_orderSoupsRes);
            }
        });
        button3 =view.findViewById(R.id.b3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_orderBurgersRes2_to_orderNoodlesRes);
            }
        });
        List<Dishes> dishesList=new ArrayList<>();
        ImageView cBurger= view.findViewById(R.id.cBurger2);
        cBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishesList.add(new Dishes(2, "Cheese Burger", 1200.0, "Burgers"));
            }
        });
        ImageView beefB= view.findViewById(R.id.beefB2);
        beefB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishesList.add(new Dishes(3, "Beef Burger", 1500.0, "Burgers"));
            }
        });
        ImageView chickenB= view.findViewById(R.id.chickenB2);
        chickenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishesList.add(new Dishes(1, "Chicken Burger", 1000.0, "Burgers"));
            }
        });
        TextView text=view.findViewById(R.id.myOrderText);
        Button button= view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.myOrder2);
                text.setText(dishesList.toString());
            }
        });
        return view;

    }
}
package com.example.akfood1.orders.fragmentsRes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;

import com.example.akfood1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderDessertsRes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderDessertsRes extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OrderDessertsRes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderDesserts.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderDessertsRes newInstance(String param1, String param2) {
        OrderDessertsRes fragment = new OrderDessertsRes();
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

    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_order_desserts_r, container, false);
        button = view.findViewById(R.id.b6);
        button.setOnClickListener(this);

        Button button= view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.myOrder2);

            }
        });

        return view;
    }

    public void onClick(View view) {
        Navigation.findNavController(view).navigate(R.id.action_orderDessertsRes2_to_orderSoupsRes);
    }
}
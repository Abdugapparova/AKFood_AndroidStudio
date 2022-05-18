package com.example.akfood1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
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
import com.example.akfood1.models.ReservationM;
import com.example.akfood1.orders.Orders;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation extends AppCompatActivity {
    private EditText numTable;
    private EditText time;
    private EditText date;

    private TextView t;
    private TextView t1;
    private EditText e1;

    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";
    public static final int REQUEST_CODE_WRITE_PERM = 401;
    String d="20/06/2022";
    String d1="28/05/2022";
    private ReservationM reservationM=new ReservationM(1,2,14,d,"Standard");
    private ReservationM reservationM2=new ReservationM(2,5,17,d1,"Outdoor");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        //---------------------------------------------
        numTable=findViewById(R.id.numTable);
        time=findViewById(R.id.time);
        date = findViewById(R.id.date);
        Button button = findViewById(R.id.button3);

        e1=findViewById(R.id.type);
        Button buttonOk=findViewById(R.id.button4);
        // -------------------------------------------------

        List<ReservationM> reservationList = new ArrayList<>();
        reservationList.add(reservationM);
        reservationList.add(reservationM2);

        /// Save info
        Context ctx=getApplicationContext();
        SharedPreferences mPrefs = ctx.getSharedPreferences(CREDENTIAL_SHARED_PREF, MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(reservationList);
        prefsEditor.putString("Reservations", json);
        prefsEditor.commit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(Reservation.this).create();
                SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);

                String numP = credentials.getString("numPeople", null);numP="2";
                String sTime = credentials.getString("time", null);sTime="14";
                String sDate = credentials.getString("date", null);sDate="20/06/2022";

                String numTable2 = numTable.getText().toString();
                String time2 = time.getText().toString();
                String date2 = date.getText().toString();

                if (numP != null && numP.equalsIgnoreCase(numTable2)) {
                    if (sTime != null && sTime.equalsIgnoreCase(time2)) {
                        if(sDate!=null && sDate.equalsIgnoreCase(date2)) {
                            Toast.makeText(Reservation.this, "Fail", Toast.LENGTH_SHORT).show();
                            alertDialog.setTitle("Sorry! We don't have tables available at this time");
                        }
                        else{
                            Toast.makeText(Reservation.this, "Success!", Toast.LENGTH_SHORT).show();
                            alertDialog.setTitle("Success!");
                        }
                    } else {
                        Toast.makeText(Reservation.this, "Success!", Toast.LENGTH_SHORT).show();
                        alertDialog.setTitle("Success!");
                    }
                } else {
                    Toast.makeText(Reservation.this, "Success!", Toast.LENGTH_SHORT).show();
                    alertDialog.setTitle("Success!");
                }
                alertDialog.show();
            }
        });

        // When we click the OK button, we write all the info to the database and open the success page
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numTable1 = numTable.getText().toString();
                String time1 = time.getText().toString();
                String date1 = date.getText().toString();
                String type=e1.getText().toString();

                if (numTable1 != null && time1 != null && date1!=null && type!=null) {
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = credentials.edit();
                    editor.putString("Number of people", numTable1);
                    editor.putString("Choose Time", time1);
                    editor.putString("Choose Date", date1);
                    editor.putString("Select seating type",type);
                    editor.commit();

                    Reservation.this.finish();
                }
                Intent intent = new Intent(Reservation.this, SuccessReserv.class);
                startActivity(intent);
            }
        });
    }

    // Menu button
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
            startActivity(new Intent(Reservation.this, Orders.class));
            return true;
        }
        else if (item.getItemId() == R.id.reserv) {
            startActivity(new Intent(Reservation.this, Reservation.class));
            return true;
        }
        else if(item.getItemId()==R.id.profile){
            startActivity(new Intent(Reservation.this, Profile2.class));
            return true;
        }
        else if(item.getItemId()==R.id.searchMenu){
            startActivity(new Intent(Reservation.this,SearchResults.class));
            return true;
        }
        else if(item.getItemId()==R.id.homepage){
            startActivity(new Intent(this,MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
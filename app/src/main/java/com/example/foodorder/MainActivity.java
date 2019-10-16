package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorder.bean.HotelList;
import com.example.foodorder.adapter.HotelListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



    RecyclerView recycler;
    private List<HotelList> hotelLists = new ArrayList<>();
    private HotelListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {

        recycler = findViewById(R.id.recycler);

        mAdapter = new HotelListAdapter(hotelLists,getApplicationContext());
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(mLayoutManager);
        recycler.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.setAdapter(mAdapter);

        recycler.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recycler, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                HotelList hotelListone = hotelLists.get(position);
                Toast.makeText(getApplicationContext(), hotelListone.getHotel_name() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        ListHotels();


    }

    private void ListHotels() {


        HotelList hotelList= new HotelList("FOODY CAFE ","Bob Evans ","FoodCircles", "Veg and NonVeg"," Veg and NonVeg"," Veg and NonVeg",
                R.drawable.hotelclipart,R.drawable.bobrestaurant,R.drawable.restaurent);
        hotelLists.add(hotelList);

        hotelList= new HotelList("FOODY CAFE ","Bob Evans ","FoodCircles", "Veg and NonVeg"," Veg and NonVeg","Veg and NonVeg",
                R.drawable.hotelclipart,R.drawable.bobrestaurant,R.drawable.restaurent);
        hotelLists.add(hotelList);

        hotelList= new HotelList("FOODY CAFE ","Bob Evans ","FoodCircles", "Veg and NonVeg","Veg and NonVeg","Veg and NonVeg",
                R.drawable.hotelclipart,R.drawable.bobrestaurant,R.drawable.restaurent);
        hotelLists.add(hotelList);

        hotelList= new HotelList("FOODY CAFE ","Bob Evans ","FoodCircles", "Veg and NonVeg","Veg and NonVeg","Veg and NonVeg",
                R.drawable.hotelclipart,R.drawable.bobrestaurant,R.drawable.restaurent);
        hotelLists.add(hotelList);
        mAdapter.notifyDataSetChanged();
    }
}

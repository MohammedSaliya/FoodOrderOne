package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodorder.bean.FoodList;
import com.example.foodorder.adapter.FoodListAdapter;

import java.util.ArrayList;
import java.util.List;

public class FoodItems extends AppCompatActivity {

    FoodListAdapter foodListAdapter;
    RecyclerView recyclerview;
    private List<FoodList> foodLists = new ArrayList<>();

//    public static final String MyPREFERENCES = "MyPrefs" ;
//    public static final String FoodName = "nameKey";
//    public static final String Description = "descKey";
//    public static final String Price = "priceKey";
//    public static final String Image = "imageKey";
//    SharedPreferences sharedpreferences;
//
//
//    Button Addbtn;

    TextView food1,desc1,price1;
    ImageView foodimage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items);

        initView();
    }

    private void initView() {

//        Addbtn=findViewById(R.id.Addbtn);
        food1=findViewById(R.id.food1);
        desc1=findViewById(R.id.desc1);
        price1=findViewById(R.id.price1);
        foodimage1=findViewById(R.id.foodimage1);


        recyclerview=findViewById(R.id.recyclerview);

        foodListAdapter = new FoodListAdapter(foodLists,getApplicationContext());
        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setAdapter(foodListAdapter);

        FoodListInfo();

//        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//        Addbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String FN  = food1.getText().toString();
//                String FD  = desc1.getText().toString();
//                String FP  = price1.getText().toString();
//
//
//                SharedPreferences.Editor editor = sharedpreferences.edit();
//
//                Intent intent=new Intent(FoodItems.this,CartActivity.class);
//                startActivity(intent);
//
//                editor.putString(FoodName, FN);
//                editor.putString(Description, FD);
//                editor.putString(Price, FP);
////                editor.putString(Email, e);
//
//                editor.commit();
//                Toast.makeText(FoodItems.this,"Thanks",Toast.LENGTH_LONG).show();
//
//
//
//
//            }
//        });

    }

    private void FoodListInfo() {

       FoodList foodList= new FoodList("FOODY CAFE Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
               "Taste and very healthy","Taste and very healthy","Spicy and hot",
               "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodLists.add(foodList);

        foodList= new FoodList("PIZZA HUTZZ ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodLists.add(foodList);

        foodList= new FoodList("ICE-CREAMS ","Cookies & Cream Plinth","Choco Chip Cookie Scoop","Cookies and Cream","Double Chocolate chunk","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 100","$ 185","$ 160","$ 220",R.drawable.cookiescreamplinth,R.drawable.chocchipcookiescoop,R.drawable.cookiesandcream,R.drawable.doublechockolatechunk);
        foodLists.add(foodList);

        foodList= new FoodList("FOODY CAFE Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodLists.add(foodList);
        foodListAdapter.notifyDataSetChanged();


    }
}

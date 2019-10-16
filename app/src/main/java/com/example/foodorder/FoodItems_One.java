package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorder.adapter.Food_List_Adapter_One;
import com.example.foodorder.bean.FoodListOne;

import java.util.ArrayList;
import java.util.List;

public class FoodItems_One extends AppCompatActivity {


    Food_List_Adapter_One foodListAdapterOne;
    RecyclerView Recyclerview1;
    private List<FoodListOne> foodListOneList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items__one);
        initView();
    }

    private void initView() {


        Recyclerview1=findViewById(R.id.Recyclerview1);

        foodListAdapterOne = new Food_List_Adapter_One(foodListOneList,getApplicationContext());
        Recyclerview1.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        Recyclerview1.setLayoutManager(mLayoutManager);
        Recyclerview1.setAdapter(foodListAdapterOne);

        FoodListInfo();
    }

    private void FoodListInfo() {

        FoodListOne foodListOne = new FoodListOne("BOB EVANS Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListOneList.add(foodListOne);

        foodListOne= new FoodListOne("BOB EVANS Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListOneList.add(foodListOne);

        foodListOne= new FoodListOne("BOB EVANS Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListOneList.add(foodListOne);

        foodListOne= new FoodListOne("BOB EVANS Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListOneList.add(foodListOne);

        foodListAdapterOne.notifyDataSetChanged();


    }
}

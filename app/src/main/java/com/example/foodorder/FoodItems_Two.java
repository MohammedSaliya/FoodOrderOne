package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorder.adapter.Food_List_Adapter_Two;
import com.example.foodorder.bean.FoodListOne;
import com.example.foodorder.bean.FoodListTwo;

import java.util.ArrayList;
import java.util.List;

public class FoodItems_Two extends AppCompatActivity {

    RecyclerView Recyclerview2;
    Food_List_Adapter_Two foodListAdapterTwo;
    private List<FoodListTwo> foodListTwoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items__two);
        initView();
    }

    private void initView() {


        Recyclerview2=findViewById(R.id.Recyclerview2);

        foodListAdapterTwo = new Food_List_Adapter_Two(foodListTwoList,getApplicationContext());
        Recyclerview2.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        Recyclerview2.setLayoutManager(mLayoutManager);
        Recyclerview2.setAdapter(foodListAdapterTwo);

        FoodListInfo();
    }

    private void FoodListInfo() {

        FoodListTwo foodListTwo = new FoodListTwo("FOODCIRCLES Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListTwoList.add(foodListTwo);

        foodListTwo= new FoodListTwo("FOODCIRCLES Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListTwoList.add(foodListTwo);

        foodListTwo= new FoodListTwo("FOODCIRCLES Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListTwoList.add(foodListTwo);

        foodListTwo= new FoodListTwo("FOODCIRCLES Menus ","Briyani","Burger","Pizza","Grilled Chicken","Perfect Taste",
                "Taste and very healthy","Taste and very healthy","Spicy and hot",
                "$ 250","$ 85","$ 155","$ 440",R.drawable.briyani,R.drawable.burger,R.drawable.noodles,R.drawable.chicken);
        foodListTwoList.add(foodListTwo);

        foodListAdapterTwo.notifyDataSetChanged();


    }
}

package com.example.foodorder.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.foodorder.CartActivity;
import com.example.foodorder.FoodItems_One;
import com.example.foodorder.R;
import com.example.foodorder.bean.FoodList;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.MyViewHolder>  {
    int minteger = 0;


    private List<FoodList> foodLists;
    private Context context;


    public FoodListAdapter(List<FoodList> foodLists, Context context) {
        this.foodLists = foodLists;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main_one, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final FoodList foodList = foodLists.get(position);

        holder.foodlist_hotel.setText(foodList.getFoodlist());
        holder.food1.setText(foodList.getFood_one());
        holder.food2.setText(foodList.getFood_two());
        holder.food3.setText(foodList.getFood_three());
        holder.food4.setText(foodList.getFood_four());

        holder.desc1.setText(foodList.getDesc_one());
        holder.desc2.setText(foodList.getDesc_two());
        holder.desc3.setText(foodList.getDesc_three());
        holder.desc4.setText(foodList.getDesc_four());

        holder.price1.setText(foodList.getPrice_one());
        holder.price2.setText(foodList.getPrice_two());
        holder.price3.setText(foodList.getPrice_three());
        holder.price4.setText(foodList.getPrice_four());


        holder.foodimage1.setImageResource(foodLists.get(position).getFoodimage_one());
        holder.foodimage2.setImageResource(foodLists.get(position).getFoodimage_two());
        holder.foodimage3.setImageResource(foodLists.get(position).getFoodimage_three());
        holder.foodimage4.setImageResource(foodLists.get(position).getFoodimage_four());


        holder.ViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CartActivity.class);
                v.getContext().startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return foodLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        TextView integer_number,food1,food2,food3,food4,desc1,desc2,desc3,desc4,price1,price2,price3,price4,foodlist_hotel;
        ImageView foodimage1,foodimage2,foodimage3,foodimage4;


        Button ViewButton;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            foodlist_hotel=itemView.findViewById(R.id.foodlist_hotel);
            food1 = itemView.findViewById(R.id.food1);
            food2 = itemView.findViewById(R.id.food2);
            food3 = itemView.findViewById(R.id.food3);
            food4 = itemView.findViewById(R.id.food4);

            desc1 = itemView.findViewById(R.id.desc1);
            desc2 = itemView.findViewById(R.id.desc2);
            desc3 = itemView.findViewById(R.id.desc3);
            desc4 = itemView.findViewById(R.id.desc4);


            price1 = itemView.findViewById(R.id.price1);
            price2 = itemView.findViewById(R.id.price2);
            price3 = itemView.findViewById(R.id.price3);
            price4 = itemView.findViewById(R.id.price4);

            foodimage1 = itemView.findViewById(R.id.foodimage1);
            foodimage2 = itemView.findViewById(R.id.foodimage2);
            foodimage3 = itemView.findViewById(R.id.foodimage3);
            foodimage4 = itemView.findViewById(R.id.foodimage4);


            ViewButton=itemView.findViewById(R.id.ViewButton);
        }
    }
}

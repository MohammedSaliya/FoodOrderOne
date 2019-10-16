package com.example.foodorder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorder.R;
import com.example.foodorder.bean.FoodListTwo;

import java.util.List;

public class Food_List_Adapter_Two extends RecyclerView.Adapter<Food_List_Adapter_Two.MyViewHolder> {
    private List<FoodListTwo> foodListTwoList;
    private Context context;

    public Food_List_Adapter_Two(List<FoodListTwo> foodListTwoList, Context context) {
        this.foodListTwoList = foodListTwoList;
        this.context = context;
    }

    @NonNull
    @Override
    public Food_List_Adapter_Two.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main_three, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Food_List_Adapter_Two.MyViewHolder holder, int position) {
        FoodListTwo foodListTwo= foodListTwoList.get(position);

        holder.foodlist_hotel3.setText(foodListTwo.getFoodlist_Name_AA());
        holder.food13.setText(foodListTwo.getFood_one_AA());
        holder.food23.setText(foodListTwo.getFood_two_AA());
        holder.food331.setText(foodListTwo.getFood_three_AA());
        holder.food43.setText(foodListTwo.getFood_four_AA());

        holder.desc13.setText(foodListTwo.getDesc_one_BB());
        holder.desc23.setText(foodListTwo.getDesc_two_BB());
        holder.desc331.setText(foodListTwo.getDesc_three_BB());
        holder.desc43.setText(foodListTwo.getDesc_four_BB());

        holder.price13.setText(foodListTwo.getPrice_one_CC());
        holder.price23.setText(foodListTwo.getPrice_two_CC());
        holder.price331.setText(foodListTwo.getPrice_three_CC());
        holder.price43.setText(foodListTwo.getPrice_four_CC());



        holder.foodimage13.setImageResource(foodListTwoList.get(position).getFoodimage_one_DD());
        holder.foodimage23.setImageResource(foodListTwoList.get(position).getFoodimage_two_DD());
        holder.foodimage331.setImageResource(foodListTwoList.get(position).getFoodimage_three_DD());
        holder.foodimage43.setImageResource(foodListTwoList.get(position).getFoodimage_four_DD());

    }

    @Override
    public int getItemCount() {
        return foodListTwoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView food13,food23,food331,food43,desc13,desc23,desc331,desc43,price13,price23,price331,price43,foodlist_hotel3;
        ImageView foodimage13,foodimage23,foodimage331,foodimage43;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            foodlist_hotel3=itemView.findViewById(R.id.foodlist_hotel3);
            food13 = itemView.findViewById(R.id.food13);
            food23 = itemView.findViewById(R.id.food23);
            food331 = itemView.findViewById(R.id.food331);
            food43 = itemView.findViewById(R.id.food43);

            desc13 = itemView.findViewById(R.id.desc13);
            desc23 = itemView.findViewById(R.id.desc23);
            desc331 = itemView.findViewById(R.id.desc331);
            desc43 = itemView.findViewById(R.id.desc43);


            price13 = itemView.findViewById(R.id.price13);
            price23 = itemView.findViewById(R.id.price23);
            price331 = itemView.findViewById(R.id.price331);
            price43 = itemView.findViewById(R.id.price43);

            foodimage13 = itemView.findViewById(R.id.foodimage13);
            foodimage23 = itemView.findViewById(R.id.foodimage23);
            foodimage331 = itemView.findViewById(R.id.foodimage331);
            foodimage43 = itemView.findViewById(R.id.foodimage43);
        }
    }
}

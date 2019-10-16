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
import com.example.foodorder.bean.FoodListOne;

import java.util.List;

public class Food_List_Adapter_One extends RecyclerView.Adapter<Food_List_Adapter_One.MyViewHolder> {

    List<FoodListOne>foodListOneList;
    Context context;

    public Food_List_Adapter_One(List<FoodListOne> foodListOneList, Context context) {
        this.foodListOneList = foodListOneList;
        this.context = context;
    }

    @NonNull
    @Override
    public Food_List_Adapter_One.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main_two, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Food_List_Adapter_One.MyViewHolder holder, int position) {
        FoodListOne foodListOne= foodListOneList.get(position);

        holder.foodlist_hotel2.setText(foodListOne.getFoodlist_Name());
        holder.food11.setText(foodListOne.getFood_one_A());
        holder.food22.setText(foodListOne.getFood_two_A());
        holder.food33.setText(foodListOne.getFood_three_A());
        holder.food44.setText(foodListOne.getFood_four_A());

        holder.desc11.setText(foodListOne.getDesc_one_B());
        holder.desc22.setText(foodListOne.getDesc_two_B());
        holder.desc33.setText(foodListOne.getDesc_three_B());
        holder.desc44.setText(foodListOne.getDesc_four_B());

        holder.price11.setText(foodListOne.getPrice_one_C());
        holder.price22.setText(foodListOne.getPrice_two_C());
        holder.price33.setText(foodListOne.getPrice_three_C());
        holder.price44.setText(foodListOne.getPrice_four_C());



        holder.foodimage11.setImageResource(foodListOneList.get(position).getFoodimage_one_D());
        holder.foodimage22.setImageResource(foodListOneList.get(position).getFoodimage_two_D());
        holder.foodimage33.setImageResource(foodListOneList.get(position).getFoodimage_three_D());
        holder.foodimage44.setImageResource(foodListOneList.get(position).getFoodimage_four_D());

    }

    @Override
    public int getItemCount() {
        return foodListOneList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView food11,food22,food33,food44,desc11,desc22,desc33,desc44,price11,price22,price33,price44,foodlist_hotel2;
        ImageView foodimage11,foodimage22,foodimage33,foodimage44;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            foodlist_hotel2=itemView.findViewById(R.id.foodlist_hotel2);
            food11 = itemView.findViewById(R.id.food11);
            food22 = itemView.findViewById(R.id.food22);
            food33 = itemView.findViewById(R.id.food33);
            food44 = itemView.findViewById(R.id.food44);

            desc11 = itemView.findViewById(R.id.desc11);
            desc22 = itemView.findViewById(R.id.desc22);
            desc33 = itemView.findViewById(R.id.desc33);
            desc44 = itemView.findViewById(R.id.desc44);


            price11 = itemView.findViewById(R.id.price11);
            price22 = itemView.findViewById(R.id.price22);
            price33 = itemView.findViewById(R.id.price33);
            price44 = itemView.findViewById(R.id.price44);

            foodimage11 = itemView.findViewById(R.id.foodimage11);
            foodimage22 = itemView.findViewById(R.id.foodimage22);
            foodimage33 = itemView.findViewById(R.id.foodimage33);
            foodimage44 = itemView.findViewById(R.id.foodimage44);

        }
    }
}

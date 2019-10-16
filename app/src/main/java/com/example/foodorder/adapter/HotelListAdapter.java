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

import com.example.foodorder.FoodItems;
import com.example.foodorder.FoodItems_One;
import com.example.foodorder.FoodItems_Two;
import com.example.foodorder.R;
import com.example.foodorder.bean.HotelList;

import java.util.List;

public class HotelListAdapter extends RecyclerView.Adapter<HotelListAdapter.MyViewHolder> {


    private List<HotelList> hotelLists;

    private Context context;

    public HotelListAdapter(List<HotelList> hotelLists, Context context) {
        this.hotelLists = hotelLists;
        this.context = context;
    }

    @NonNull
    @Override
    public HotelListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelListAdapter.MyViewHolder holder, int position) {

        HotelList hotelList = hotelLists.get(position);
        holder.hotel_name.setText(hotelList.getHotel_name());
        holder.hotel_name1.setText(hotelList.getHotel_nameone());
        holder.hotel_name2.setText(hotelList.getHotel_nametwo());
        holder.type.setText(hotelList.getType());
        holder.type1.setText(hotelList.getTypeone());
        holder.type2.setText(hotelList.getTypetwo());

        holder.hotel_image.setImageResource(hotelLists.get(position).getHotel_image());
        holder.hotel_image1.setImageResource(hotelLists.get(position).getHotel_imageone());
        holder.hotel_image2.setImageResource(hotelLists.get(position).getHotel_imagetwo());



        holder.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), FoodItems.class);
                v.getContext().startActivity(intent);

            }
        });

            holder.next1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), FoodItems_One.class);
                    v.getContext().startActivity(intent);

                }
            });
            holder.next2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), FoodItems_Two.class);
                    v.getContext().startActivity(intent);

                }
            });

    }

    @Override
    public int getItemCount() {
        return hotelLists.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView hotel_name,hotel_name1,hotel_name2,type,type1,type2;
        ImageView hotel_image,hotel_image1,hotel_image2;

        Button next,next1,next2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hotel_name = itemView.findViewById(R.id.hotel_name);
            hotel_name1 = itemView.findViewById(R.id.hotel_name1);
            hotel_name2 = itemView.findViewById(R.id.hotel_name2);

            type = itemView.findViewById(R.id.type);
            type1 = itemView.findViewById(R.id.type1);
            type2 = itemView.findViewById(R.id.type2);

            hotel_image = itemView.findViewById(R.id.hotel_image);
            hotel_image1 = itemView.findViewById(R.id.hotel_image1);
            hotel_image2 = itemView.findViewById(R.id.hotel_image2);


            next = itemView.findViewById(R.id.next);

            next1 = itemView.findViewById(R.id.next1);
            next2 = itemView.findViewById(R.id.next2);



    }
}}

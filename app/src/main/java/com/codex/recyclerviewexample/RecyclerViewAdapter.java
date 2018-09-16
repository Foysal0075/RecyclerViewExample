package com.codex.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private List<Person> personList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<Person> personList) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate the custom Recycler View

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_model,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv.setText(personList.get(position).getName());
        holder.locationView.setText(personList.get(position).getLocation());
        holder.professionView.setText(personList.get(position).getProfession());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tv,locationView,professionView;

        //Constructor
        public MyViewHolder (View itemView){


            super(itemView);

            tv = itemView.findViewById(R.id.name_view);
            locationView = itemView.findViewById(R.id.location_view);
            professionView = itemView.findViewById(R.id.profession_view);
        }
    }
}

package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<planet> {
    private ArrayList<planet> planets;
    Context context;

    public CustomAdapter(@NonNull Context context, ArrayList<planet> planets) {
        super(context, R.layout.item_list_layout, planets);
        this.planets = planets;
        this.context = context;
    }

    private static class MyViewHolder{
        ImageView imageView;
        TextView planetName;
        TextView moons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        planet planet = getItem(position);

        MyViewHolder holder;
        final View result;

        if(convertView == null){
            holder = new MyViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list_layout, parent, false);
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.moons = convertView.findViewById(R.id.moon_number);
            holder.planetName = convertView.findViewById(R.id.planet_name);
            convertView.setTag(holder);
        } else {
            holder = (MyViewHolder) convertView.getTag();
        }
        assert planet != null;
        holder.imageView.setImageResource(planet.getPlanetID());
        holder.planetName.setText(planet.getPlanetName());
        holder.moons.setText(planet.getMoons());
        return convertView;
    }
}

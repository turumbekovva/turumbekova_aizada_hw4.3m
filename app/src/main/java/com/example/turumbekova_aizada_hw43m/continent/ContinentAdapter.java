package com.example.turumbekova_aizada_hw43m.continent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.turumbekova_aizada_hw43m.R;

import java.util.ArrayList;

public class ContinentAdapter {
    private ArrayList<ContinentModel> continentModels;
    public ContinentAdapter(ArrayList<ContinentModel> continentModels){
        this.continentModels = continentModels;
    }
    @NonNull
    @Override
    public onCreateViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType){
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent))
    }
    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder,int position){
        holder.bind(continentModels.get(position));
    }
    @Override
    public int getItemCount(){
        return continentModels.size();
    }
}

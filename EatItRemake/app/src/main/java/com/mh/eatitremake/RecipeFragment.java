package com.mh.eatitremake;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecipeFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecipeAdapter mTravelAdapter;
    private List<Recipe> mRecipes;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_view, parent, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerview_recipes);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);

        /*
        GET ALL RECIPES BEfORE CREATING THE ADAPTER
        */
        //SUPER PROVIZORIU  INCEPAND DE AICI
        List<Ingredient> mlist = new ArrayList<>();
        mlist.add (new Ingredient("cartofi","not yet",30));
        mlist.add (new Ingredient("carnat","not yet",30));
        mlist.add (new Ingredient("branza","not yet",30));

        Recipe firstRecipe = new Recipe("Cartofi copti", 3, "easy","descriere","main dish",30,"https://dl.airtable.com/Z63XVsqQauq6CwpajKyU_Image%2022%20May%202017%2006%3A55%20PM.jpg",mlist);
        mRecipes = new ArrayList<>();
        mRecipes.add(firstRecipe);
        //PANA AICI

        mTravelAdapter = new RecipeAdapter(mRecipes);
        mRecyclerView.setAdapter(mTravelAdapter);

        return rootView;
    }
}
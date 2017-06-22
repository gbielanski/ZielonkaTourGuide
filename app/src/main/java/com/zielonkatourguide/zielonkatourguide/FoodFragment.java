package com.zielonkatourguide.zielonkatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

    private AttractionsAdapter attractionsAdapter;

    public FoodFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootElement = inflater.inflate(R.layout.attractions_list, container, false);
        ListView listView = (ListView) rootElement.findViewById(R.id.list);
        ArrayList<Attraction> monumentsList = new ArrayList<>();
        monumentsList.add(new Attraction(R.drawable.food_rozlogi, getString(R.string.food_rozlogi)));
        monumentsList.add(new Attraction(R.drawable.food_cubana, getString(R.string.food_cubana)));
        monumentsList.add(new Attraction(R.drawable.food_ring, getString(R.string.food_ring)));
        monumentsList.add(new Attraction(R.drawable.food_ives, getString(R.string.food_ives)));
        monumentsList.add(new Attraction(R.drawable.food_dagrasso, getString(R.string.food_dagrasso)));
        monumentsList.add(new Attraction(R.drawable.food_macjack, getString(R.string.food_mackjack)));
        attractionsAdapter = new AttractionsAdapter(getActivity(), monumentsList);
        listView.setAdapter(attractionsAdapter);
        return rootElement;

    }
}

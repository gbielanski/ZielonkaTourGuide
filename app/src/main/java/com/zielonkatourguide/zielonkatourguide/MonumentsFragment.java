package com.zielonkatourguide.zielonkatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MonumentsFragment extends Fragment {

    private AttractionsAdapter attractionsAdapter;

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootElement = inflater.inflate(R.layout.attractions_list, container, false);
        ListView listView = (ListView) rootElement.findViewById(R.id.list);
        ArrayList<Attraction> monumentsList = new ArrayList<>();
        monumentsList.add(new Attraction(R.drawable.monument_church, getString(R.string.monument_church)));
        monumentsList.add(new Attraction(R.drawable.monument_skwer, getString(R.string.monument_square)));
        monumentsList.add(new Attraction(R.drawable.monument_former_hostel, getString(R.string.monument_former_hostel)));
        monumentsList.add(new Attraction(R.drawable.monument_house, getString(R.string.monument_residence)));
        monumentsList.add(new Attraction(R.drawable.monument_plaque, getString(R.string.monument_plaque)));
        monumentsList.add(new Attraction(R.drawable.monument_museum, getString(R.string.monument_museum)));
        attractionsAdapter = new AttractionsAdapter(getActivity(), monumentsList);
        listView.setAdapter(attractionsAdapter);

        return rootElement;
    }
}

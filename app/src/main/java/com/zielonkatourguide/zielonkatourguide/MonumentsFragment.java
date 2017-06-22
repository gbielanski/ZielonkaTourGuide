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
        monumentsList.add(new Attraction(getString(R.string.monument_1)));
        monumentsList.add(new Attraction(getString(R.string.monument_2)));
        monumentsList.add(new Attraction(getString(R.string.monument_3)));
        monumentsList.add(new Attraction(getString(R.string.monument_4)));
        monumentsList.add(new Attraction(getString(R.string.monument_5)));
        monumentsList.add(new Attraction(getString(R.string.monument_6)));
        attractionsAdapter = new AttractionsAdapter(getActivity(), monumentsList);
        listView.setAdapter(attractionsAdapter);

        return rootElement;
    }
}

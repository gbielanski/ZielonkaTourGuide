package com.zielonkatourguide.zielonkatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TransportFragment extends Fragment {
    public TransportFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootElement = inflater.inflate(R.layout.attractions_list, container, false);
        ListView listView = (ListView)rootElement.findViewById(R.id.list);
        ArrayList<Attraction> attractionsList = new ArrayList<>();
        attractionsList.add(new Attraction(getString(R.string.transport_1)));
        attractionsList.add(new Attraction(getString(R.string.transport_2)));
        attractionsList.add(new Attraction(getString(R.string.transport_3)));
        attractionsList.add(new Attraction(getString(R.string.transport_4)));
        attractionsList.add(new Attraction(getString(R.string.transport_5)));
        AttractionsAdapter attractionsAdapter = new AttractionsAdapter(getActivity(), attractionsList);
        listView.setAdapter(attractionsAdapter);
        return rootElement;
    }
}

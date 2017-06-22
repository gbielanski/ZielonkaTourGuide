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

        attractionsList.add(new Attraction("PKP Koleje Mazowieckie from Dworzec Wileński Station"));
        attractionsList.add(new Attraction("Local bus line LZ-1"));
        attractionsList.add(new Attraction("Local bus line LZ-2"));
        attractionsList.add(new Attraction("Stalko bus line W"));
        attractionsList.add(new Attraction("Stalko bus line J"));

        AttractionsAdapter attractionsAdapter = new AttractionsAdapter(getActivity(), attractionsList);

        listView.setAdapter(attractionsAdapter);
        return rootElement;
    }
}

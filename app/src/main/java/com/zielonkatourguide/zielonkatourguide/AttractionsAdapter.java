package com.zielonkatourguide.zielonkatourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AttractionsAdapter extends ArrayAdapter<Attraction> {

    public AttractionsAdapter(@NonNull Context context, @NonNull List<Attraction> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction attraction = getItem(position);

        int attractionResourceId = attraction.getResourceId();
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (attractionResourceId == 0){
            imageView.setVisibility(View.GONE);
        } else{
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(attractionResourceId);
        }

        TextView attractionDescription = (TextView) listItemView.findViewById(R.id.attraction_description);
        attractionDescription.setText(attraction.getDescription());

        return listItemView;
    }
}
package com.zielonkatourguide.zielonkatourguide;

import static android.R.attr.description;

class Attraction {
    private int mResourceId;
    private String mDescription;

    public Attraction(int resourceId, String description) {
        mResourceId = resourceId;
        mDescription = description;
    }

    public Attraction(String description) {
        mResourceId = 0;
        mDescription = description;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public String getDescription() {
        return mDescription;
    }
}

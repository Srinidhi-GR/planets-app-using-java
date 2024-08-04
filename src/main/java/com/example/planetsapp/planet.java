package com.example.planetsapp;

import android.widget.ImageView;
import android.widget.TextView;

public class planet {

    private String planetName;
    private String moons;

    private int planetID;

    public planet(int planetID, String planetName, String moons) {
        this.planetID = planetID;
        this.planetName = planetName;
        this.moons = moons;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getMoons() {
        return moons;
    }

    public int getPlanetID() {
        return planetID;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }

    public void setPlanetID(int planetID) {
        this.planetID = planetID;
    }
}

package com.example.android.velocimetroagriconnected;


import android.location.Location;

public class CLocation extends Location {

//    private boolean bUseMetricUnits = false;

//    public CLocation(Location location)
//    {
//        this(location, true);
//    }

    public CLocation(Location location) {
        // TODO Auto-generated constructor stub
        super(location);
//        this.bUseMetricUnits = bUseMetricUnits;
    }


//    public boolean getUseMetricUnits()
//    {
//        return this.bUseMetricUnits;
//    }
//
//    public void setUseMetricunits(boolean bUseMetricUntis)
//    {
//        this.bUseMetricUnits = bUseMetricUntis;
//    }

    @Override
    public float distanceTo(Location dest) {
        // TODO Auto-generated method stub
        float nDistance = super.distanceTo(dest);

        return nDistance;
    }

    @Override
    public float getAccuracy() {
        // TODO Auto-generated method stub
        float nAccuracy = super.getAccuracy();

        return nAccuracy;
    }

    @Override
    public double getAltitude() {
        // TODO Auto-generated method stub
        double nAltitude = super.getAltitude();

        return nAltitude;
    }

    @Override
    public float getSpeed() {
        // TODO Auto-generated method stub
        float nSpeed = super.getSpeed() * 1.852f;

        return nSpeed;
    }



}

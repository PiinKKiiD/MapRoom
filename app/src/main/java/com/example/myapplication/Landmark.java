package com.example.myapplication;

import com.mapbox.mapboxsdk.geometry.LatLng;

public class Landmark {
    private String _title;
    private String _description;
    private int _logoID;
    private LatLng _latlong;


    public Landmark(String title, String description, int logoID, LatLng latlong) {
        this._title = title;
        this._description = description;
        this._logoID = logoID;
        this._latlong = latlong;
    }

    public Landmark() {
        _title ="";
        _description = "";
        _logoID = 0;
    }


    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public int getLogoID() {
        return _logoID;
    }

    public void setLogoID(int logoID) {
        this._logoID = logoID;
    }

    public LatLng getLatlong() {
        return _latlong;
    }

    public void setLatlong(LatLng latlong) {
        this._latlong = latlong;
    }
}

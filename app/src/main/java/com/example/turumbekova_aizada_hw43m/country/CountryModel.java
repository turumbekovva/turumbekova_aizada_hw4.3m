package com.example.turumbekova_aizada_hw43m.country;

public class CountryModel {
    private  String imgCountry;
    private String tvCountry;

    public CountryModel(String imgCountry, String tvCountry) {
        this.imgCountry = imgCountry;
        this.tvCountry = tvCountry;
    }

    public String getImgCountry() {
        return imgCountry;
    }

    public String getTvCountry() {
        return tvCountry;
    }
}

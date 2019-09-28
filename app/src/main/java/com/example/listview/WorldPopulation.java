package com.example.listview;

public class WorldPopulation {
    private String rank;
    private String country;

    public WorldPopulation(String rank, String country) {
        this.rank = rank;
        this.country = country;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

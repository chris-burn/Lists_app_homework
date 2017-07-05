package com.example.user.app_lists_homework;

/**
 * Created by user on 05/07/2017.
 */

public class Whisky {

    private int rating;
    private String distillery;
    private String name;

    public Whisky(Integer rating, String distillery, String name){
        this.rating = rating;
        this.distillery = distillery;
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public String getDistillery() {
        return distillery;
    }

    public String getName() {
        return name;
    }
}

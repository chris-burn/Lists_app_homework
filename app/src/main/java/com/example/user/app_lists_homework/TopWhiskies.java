package com.example.user.app_lists_homework;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopWhiskies {


        private ArrayList<Whisky> list;

        public TopWhiskies() {
            list = new ArrayList<Whisky>();
            list.add(new Whisky(1, "Glenugie", "30 year old"));
            list.add(new Whisky(2, "Ardbeg", "Corryvreckan"));
            list.add(new Whisky(3, "Balvenie", "DoubleWood"));
            list.add(new Whisky(4, "Ardbeg", "10"));
            list.add(new Whisky(5, "Bowmore", "100 proof"));
            list.add(new Whisky(6, "Glenfiddich", "14 year old, Fine Oak"));
            list.add(new Whisky(7, "MacAllan", "10 year old"));
            list.add(new Whisky(8, "Glen Garioch", "12 year old"));
            list.add(new Whisky(9, "Glenfarclas", "15 year old"));
            list.add(new Whisky(10, "Johnny Walker", "Gold"));
        }

    public ArrayList<Whisky> getList() {
        return new ArrayList<Whisky>(list);
    }

}

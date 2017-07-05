package com.example.user.app_lists_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class WhiskyTest {

    Whisky whisky;

    @Before
    public void before(){
        whisky  = new Whisky(7, "Balvenie", "DoubleWood");
    }

    @Test
    public void canGetRating(){
        assertEquals((Integer)7, whisky.getRating());
    }

    @Test
    public void canGetDistillery(){
        assertEquals("Balvenie", whisky.getDistillery());
    }

    @Test
    public void canGetBottling(){
        assertEquals("DoubleWood", whisky.getName());
    }

}

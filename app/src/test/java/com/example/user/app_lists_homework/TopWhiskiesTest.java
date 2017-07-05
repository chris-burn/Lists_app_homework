package com.example.user.app_lists_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class TopWhiskiesTest {

    @Test
    public void canGetWhiskies(){
        TopWhiskies topWhiskies = new TopWhiskies();
        assertEquals(10, topWhiskies.getList().size());
    }


}

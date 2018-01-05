package com.example.codeclan.todolist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class ItemTest {

    private Item item1;
    private Item item2;
    private Item item3;

    @Before
    public void before(){
        item1 = new Item("Tidy Room", "kids Room especially!", 1);
        item2 = new Item("buy light bulbs", "for back door and bedside light", 0);
        item3 = new Item("Make dentist appointment", "Dylan and Alice", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Tidy Room", item1.getName());
    }

    @Test
    public void canGetDetails(){
        assertEquals("Dylan and Alice", item3.getDetails());
    }



}

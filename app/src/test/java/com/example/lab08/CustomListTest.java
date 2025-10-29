package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.getCount());
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.getCount());
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        list.deleteCity(edmonton);
        assertEquals(0, list.getCount());
        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(edmonton));
    }
}

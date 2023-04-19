package com.armanyazdi.esmfamilapi;

import java.util.ArrayList;

public class RandomSelector {
    public static String select(char letter, String file) {
        final ArrayList<String> allItems = new ArrayList<>();

        DataReader.read(file, allItems);
        String selectedItem = allItems.get((int) (Math.random() * allItems.size()));

        while (selectedItem.charAt(0) != letter)
            selectedItem = allItems.get((int) (Math.random() * allItems.size()));

        return selectedItem;
    }
}
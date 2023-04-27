package com.armanyazdi.esmfamilapi;

import java.util.ArrayList;

public class RandomSelector {
    private static final ArrayList<String> allItems = new ArrayList<>();
    private static final ArrayList<String> finalItems = new ArrayList<>();

    private static void checkEntity(char letter) {
        for (String s: allItems)
            if (s.charAt(0) == letter)
                finalItems.add(s);

        allItems.clear();
    }

    public static String selectItem(char letter, String file) {
        DataReader.readFile(file, allItems);
        String pickedItem;
        checkEntity(letter);

        if (finalItems.size() >= 1) {
            pickedItem = finalItems.get((int) (Math.random() * finalItems.size()));
            finalItems.clear();

            return pickedItem;
        }
        else
            return null;
    }
}
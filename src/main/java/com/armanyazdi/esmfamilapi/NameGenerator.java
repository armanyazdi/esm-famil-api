package com.armanyazdi.esmfamilapi;

import java.util.ArrayList;

public class NameGenerator {
    private static final ArrayList<String> firstNames = new ArrayList<>();
    private static final ArrayList<String> lastNames = new ArrayList<>();
    private static final ArrayList<String> arabicNames = new ArrayList<>();

    public static String firstName(char letter) {
        DataReader.readFile("names.txt", firstNames);
        String firstName = firstNames.get((int) (Math.random() * firstNames.size()));

        while (firstName.charAt(0) != letter)
            firstName = firstNames.get((int) (Math.random() * firstNames.size()));

        firstNames.clear();

        return firstName;
    }

    public static String lastName(char letter) {
        String[] somePrefixes = new String[]{
                "میر",
                "آقا",
                "ابو",
                "پور",
                "نور",
                "نصر",
                "زند",
                "سید",
                "امیر",
                "عزیز",
                "شاه ",
                "نیک ",
                "حاج ",
                "حاجی ",
                "صوفی ",
                "افضل ",
                "فاضل ",
                "شیخ ",
                "میرزا ",
                "استاد ",
                "ملک ",
                "خان ",
                "بیگ ",
                "عرب "
        };
        String[] someSuffixes = new String[]{
                " پور", "",
                " زاده", "",
                " فر", "",
                " فرد", "",
                "ان", "",
                " کیا", "",
                " راد", "",
                " زند", "",
                " خواه", "",
                " نیا", "",
                " مهر", "",
                " آذر", "",
                " صدر", "",
                " کهن", "",
                " نژاد", "",
                " بیات", "",
                " یکتا", "",
                " ثابت", "",
                " آزاد", "",
                " زارع", "",
                " مقدم", "",
                " روشن", "",
        };
        String[] moreSuffixes = new String[]{
                " پور", "ی",
                " زاده", "ی",
                " فر", "ی",
                " فرد", "ی",
                " خانی", "ی",
                " وند", "ی",
                " لو", "ی",
                " نیا", "ی",
                " زهی", "ی",
                " نژاد", "ی",
                " بیگی", "ی",
                " زارع", "ی",
        };

        DataReader.readFile("lastnames.txt", lastNames);
        for (byte i = 0; i < 26; i++) arabicNames.add(lastNames.get(i));
        String lastName = lastNames.get((int) (Math.random() * lastNames.size()));

        if (lastName.equals("مرتضی") || lastName.equals("مصطفی") || lastName.equals("موسی") || lastName.equals("کسری") || lastName.equals("مجتبی"))
            lastName = lastName.replace("ی", "وی");
        else if (lastName.equals("یحیی"))
            lastName = lastName.replace("یی", "یوی");
        else if (lastName.equals("علی") || lastName.equals("مهدی"))
            lastName = lastName.replace("ی", new String[]{"ی", "وی"}[(byte) (Math.round(Math.random()))]);
        else if (lastName.equals("خسرو"))
            assert true;
        else if (lastName.endsWith("ا") || lastName.endsWith("و"))
            lastName += "یی";
        else if (lastName.endsWith("ی"))
            assert true;
        else
            lastName += new String[]{"ی", ""}[(byte) (Math.round(Math.random()))];

        if (arabicNames.contains(lastName.substring(0, lastName.length() - 1)) || arabicNames.contains(lastName.substring(0, lastName.length() - 2))) {
            String prefix = somePrefixes[(byte) (Math.random() * somePrefixes.length)];
            String suffix = someSuffixes[(byte) (Math.random() * someSuffixes.length)];
            if (suffix.equals(""))
                lastName = prefix + lastName;
            else
                lastName += suffix;
        }
        else if ((lastName.length() <= 4 && lastName.endsWith("ی")) || (lastName.endsWith("علی") || lastName.endsWith("مهدی")))
            lastName += new String[]{" پور", " زاده", " فر", " فرد", "ان", " کیا", " خانی", " وند", " نیا", " نژاد", " بیگی"}[(byte) (Math.round(Math.random() * 10))];
        else if (lastName.endsWith("ی"))
            lastName += someSuffixes[(byte) (Math.random() * someSuffixes.length)];
        else
            lastName += moreSuffixes[(byte) (Math.random() * moreSuffixes.length)];

        while (lastName.charAt(0) != letter)
            lastName = lastName(letter);

        lastNames.clear();

        return lastName;
    }
}
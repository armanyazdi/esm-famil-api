package com.armanyazdi.esmfamilapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {
    public static void read(String file, ArrayList<String> list) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data/".concat(file)));
            String line;
            while ((line = reader.readLine()) != null) list.add(line);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
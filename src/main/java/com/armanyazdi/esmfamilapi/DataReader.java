package com.armanyazdi.esmfamilapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {
    public static void readFile(String file, ArrayList<String> list) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data/".concat(file)));
            String line;
            while ((line = br.readLine()) != null) list.add(line);
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
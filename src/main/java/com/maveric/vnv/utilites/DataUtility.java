package com.maveric.vnv.utilites;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataUtility {

    JsonParser parser =new JsonParser();           // Creating a json parser object

    JsonElement jsonObject;                       // Parsing the content of json file

    {
        try {
            jsonObject = parser.parse(new FileReader("resources\\devices.json"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // Reading the data from json file




}

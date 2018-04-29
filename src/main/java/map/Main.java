package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<String, String>();

        mp.put("1", "one");
        mp.put("2", "two");
        mp.put("3", "three");
        mp.put("4", "four");
        mp.put("5", "five");
        mp.put("6", "six");
        mp.put("7", "seven");
        mp.put("8", "eight");
        mp.put("9", "nine");
        mp.put("0", "zero");


        System.out.println("map: " + mp.toString());

        mp.clear();
        System.out.println("map: " + mp.toString());

        mp.put("1", "one");
        mp.put("2", "two");
        mp.put("3", "three");
        mp.put("4", "four");
        mp.put("5", "five");
        mp.put("6", "six");
        mp.put("7", "seven");
        mp.put("8", "eight");
        mp.put("9", "nine");
        mp.put("0", "zero");

        System.out.println("map: " + mp.toString());

        mp.remove("1");

        System.out.println("map: " + mp.toString());


        if (mp.containsKey("3")) {
            System.out.println(mp.get("3"));
        }


        if (mp.containsValue("three")) {
            System.out.println("Yes");
        }


        System.out.println(mp.keySet());
        System.out.println(mp.values());

        System.out.println(mp.size());

        for (String item : mp.keySet()) {
            System.out.println(mp.get(item));
        }

        Set<Map.Entry<String, String>> entries = mp.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }


    }
}

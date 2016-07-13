package com.zoo.amita.animal;

import java.util.*;

/**
 * Created by Amita on 7/12/2016.
 */
public class Herbivore extends Animal {

    public void hvType() {
        Map<String, Object> map = new TreeMap<>();

        map.put("Key1", "Giraffe");
        map.put("Key2", "Monkey");
        map.put("Key3", "Elephant");
        Type(map);
    }

    public void hvTagGastronomy() {
        System.out.println("I'm eating fruit and vegetable");
    }


    public static void hvGastronomyList() {

        System.out.println("Herbival gastonomy list");

        List<String> strlist2 = new ArrayList<>();

        strlist2.add("Apple");
        strlist2.add("Watermelon");
        strlist2.add("Lentils");
        strlist2.add("Cabbage");

        Collections.reverse(strlist2);
        eatList(strlist2);
    }
}

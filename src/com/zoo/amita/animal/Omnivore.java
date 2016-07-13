package com.zoo.amita.animal;

import java.util.*;

/**
 * Created by Amita on 7/12/2016.
 */
public class Omnivore extends Animal {

    public void ovType() {
        Map<String, Object> map = new TreeMap<>();

        map.put("Key1", "Bear");
        Type(map);

    }

    public void ovTagGastronomy () {
    System.out.println("I'm eating fruit, vegetable, and meat ");
}

    public static void ovGastronomyList() {

        System.out.println("Herbival gastonomy list");

        List<String> strlist2 = new ArrayList<>();

        strlist2.add("Apple");
        strlist2.add("Watermelon");
        strlist2.add("Lentils");
        strlist2.add("Cabbage");
        strlist2.add("Pork");
        strlist2.add("Beef");
        strlist2.add("Mutton");
        strlist2.add("Ribs");

        Collections.reverse(strlist2);
        eatList(strlist2);
    }
}

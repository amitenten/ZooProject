package com.zoo.amita.animal;

import java.util.*;

/**
 * Created by Amita on 7/12/2016.
 */
public class Carnivore extends Animal {

    public void cvType() {
        Map<String, Object> map = new TreeMap<>();

        map.put("Key1", "Wolf");
        map.put("Key2", "Lion");
        map.put("Key3", "Tiger");
        Type(map);

    }

    public void cvTagGastronomy () {
    System.out.println("I'm eating meat");
}


    public static void cvGastronomyList() {

        System.out.println("Herbival gastonomy list");

        List<String> strlist2 = new ArrayList<>();

        strlist2.add("Pork");
        strlist2.add("Beef");
        strlist2.add("Mutton");
        strlist2.add("Ribs");

        Collections.reverse(strlist2);
        eatList(strlist2);
    }
}

package com.zoo.amita.animal;

import java.util.List;
import java.util.Map;

/**
 * Created by Amita on 7/12/2016.
 */
public class Animal {

    public static void eatList(List<String> el) {
        el.forEach((str) -> System.out.println("  -" + str));
    }

    public static void Type(Map<String, Object> m){
        m.forEach((str, o2) -> System.out.println("  -" + o2));
    }

    public static void Status(){}


}

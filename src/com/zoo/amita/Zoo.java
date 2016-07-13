package com.zoo.amita;

import com.zoo.amita.animal.Carnivore;
import com.zoo.amita.animal.Herbivore;
import com.zoo.amita.animal.Omnivore;

/**
 * Created by Amita on 7/12/2016.
 */
public class Zoo {

    public static void main(String[] args){

        System.out.println("Herbivore");
        Herbivore HV = new Herbivore();
        HV.hvType();
        HV.hvTagGastronomy();
        HV.hvGastronomyList();
        System.out.println("-----------------------------------------------");

        System.out.println("Carnivore");
        Carnivore CV = new Carnivore();
        CV.cvType();
        CV.cvTagGastronomy();
        CV.cvGastronomyList();
        System.out.println("-----------------------------------------------");

        System.out.println("Herbivore");
        Omnivore OV = new Omnivore();
        OV.ovType();
        OV.ovTagGastronomy();
        OV.ovGastronomyList();
        System.out.println("-----------------------------------------------");
    }

}

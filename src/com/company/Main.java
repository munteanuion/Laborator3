package com.company;

import com.company.classAbstract.Iphone;
import com.company.classAbstract.Samsung;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Tayota car1 = new Tayota(2.5,2200,20);
        Mercedes car2 = new Mercedes(2.0,1900,19);
        Ford car3 = new Ford(5.0,2500,21);

        List<Masina> masini = new ArrayList<Masina>();
        masini.add(car1);
        masini.add(car2);
        masini.add(car3);

        System.out.println("");
        for (Masina i : masini) {
            System.out.println(i);
            System.out.println("");
        }

        System.out.println("Capacitate Motor " + car1.getMarca() + ": " + car1.capMotor() + "\n");
        System.out.println("Diametru Disc " + car2.getMarca() + ": " + car2.diametruDisc() + "\n");
        System.out.println("Greutate " + car3.getMarca() + ": " + car3.greutate() + "\n");

        System.out.println("-------------------------------------------------------------------");

        Samsung telefon1 = new Samsung(6999,2020);
        Iphone telefon2 = new Iphone(12999,2019);

        System.out.println(telefon1.toString() + "\n");
        System.out.println(telefon2.toString() + "\n");

        System.out.println("Starea " + telefon1.getMarca() + " " + telefon1.starea() + "\n");
        System.out.println("Starea " + telefon2.getMarca() + " " + telefon2.starea() + "\n");


    }
}

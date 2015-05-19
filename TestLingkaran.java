package com.company;

/**
 * Created by VAIO on 5/19/2015.
 */
public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran bangun = new Lingkaran();

        bangun.jari = 30;
        bangun.Diameter = 20;

        bangun.CetakLayar();
        System.out.println("jari = " + bangun.hitungjari());
        System.out.println("Diameter= " + bangun.hitungDiameter());

    }
}

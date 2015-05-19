package com.company;

/**
 * Created by VAIO on 5/19/2015.
 */
public class TestSegitiga {
    public static void main(String[] args) {

    Segitiga bangun = new Segitiga();

    bangun.alas = 5 ;
    bangun.tinggi =10  ;
    bangun.sisimiring =15 ;

    bangun.CetakdiLayar();
    System.out.println("alas = " + bangun.hitungluas());
    System.out.println("tinggi= " + bangun.tinggi());


    }
}

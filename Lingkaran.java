package com.company;

/**
 * Created by VAIO on 5/19/2015.
 */
public class Lingkaran {
    int jari;
    int Diameter;
    public void CetakLayar()
    {
        System.out.println("jari : " + jari);
        System.out.println("Diameter : " + Diameter);
    }
public void Ubahproperty (int jaribaru, int Diameterbaru) {
    {
        jari = jaribaru;
        Diameter = Diameterbaru;
    }
}
    public double hitungjari()
    {
        double luas;
        luas= 3.14 * jari * jari;
        return luas;
    }
        public double hitungDiameter()
        {
            double keliling;
            keliling = 3.14*Diameter;
            return keliling;
    }

}


package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(10, 5, 3);

        persegi.printInfo();
        segitiga.printInfo();

        System.out.println("Luas persegi panjang : " + persegi.hitungLuas());
        System.out.println("Luas segitiga : " + segitiga.hitungLuas());
    }
}
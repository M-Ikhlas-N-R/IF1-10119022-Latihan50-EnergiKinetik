package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program menghitung energi kinetik
 *
 */
public class Main {
    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(145, 25);
        System.out.println("Massa : " + energiKinetik.getMassa() + " g");
        System.out.println("Kecepatan : "+energiKinetik.getVolume() + " m/s");
        System.out.printf("Energi Kinetik : %.2f joule%n", energiKinetik.hitung());
        System.out.printf("Karena energi kinetik awalnya 0 maka usaha nya  %.2f joule%n", energiKinetik.hitung());
    }
}

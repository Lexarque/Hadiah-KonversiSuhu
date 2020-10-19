package Yee;

import java.util.*;

public class KonversiSuhu {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        char ks;
        int ke, c;
        float fa, re;

        System.out.print(" Masukkan Suhu Dalam Bentuk Celcius : ");
        c = S.nextInt();
        System.out.println(" Dalam Bentuk Apa Anda Ingin Mengkonversi Suhu Tersebut ? ");
        System.out.println(" F / R / K ");
        ks = S.next().charAt(0);

        fa = count_f(c);
        re = count_r(c);
        ke = count_k(c);

        switch(ks){
            case 'F' -> System.out.println("F = ("+ c +" * 9/5) + 32 = " + fa);
            case 'R' -> System.out.println("R = "+ c +" * 4/5 = " +re);
            case 'K' -> System.out.println("K = "+ c +" + 243 = " +ke);
        }
    }
    public static float count_f(float c){
        float hasil_f;
        hasil_f = (c * 9/5) + 32;
        return hasil_f;
    }
    public static float count_r(float c){
        float hasil_r;
        hasil_r = (c * 4/5);
        return  hasil_r;

    }
    public static int count_k(int c){
        int hasil_k;
        hasil_k = c + 273;
        return hasil_k;
    }
}

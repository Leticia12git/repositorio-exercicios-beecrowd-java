package org.example.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        a *= 3.5;
        b *= 7.5;

        double media = (a + b) / 11;

        System.out.printf("MEDIA =  %.5f%n", media);
        sc.close();
    }


}


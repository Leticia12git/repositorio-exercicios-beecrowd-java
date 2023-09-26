package org.example.iniciante;

import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();

        int quantidade = 0;

        if (notaA >= 10.0){
            double media = notaA + 2.0;
        }
        if ( notaB >= 10){
            double media = notaB + 3.0;
        }

        if ( notaC >= 10.0){
            double  media = notaC + 5.0;
        }

        double media = notaA + notaB + notaC / quantidade;

        sc.close();
    }
}

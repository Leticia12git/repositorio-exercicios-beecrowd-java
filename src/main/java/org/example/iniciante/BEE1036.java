package org.example.iniciante;

import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = 0;
        double r1;
        double r2;

        if (a != 0 && delta > 0) {
            System.out.println();
            System.out.println();
        } else {
            System.out.println("Impossivel calcular");
            sc.close();
        }
    }
}
package org.example.iniciante;

import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x;

        x = a + b;

        System.out.println("X = " + x);


        sc.close();
    }
}

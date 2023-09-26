package org.example.iniciante;

import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int um = sc.nextInt();
        int dois = sc.nextInt();

        int prod = um * dois;
        System.out.println("PROD = " + prod);
         sc.close();
    }
}

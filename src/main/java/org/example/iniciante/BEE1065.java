package org.example.iniciante;

import java.util.Scanner;

public class BEE1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            numero = sc.nextInt();
            if ( numero % 2 == 0){
                 cont += 1;
            }

        }
        System.out.printf("%d valores pares%n", cont);
        sc.close();
    }
}

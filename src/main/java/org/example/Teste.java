package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        float numero;
        int positivo = 0;
        float media;
        float soma = 0;

        while (i <= 6) {
            numero = input.nextFloat();

            if (numero > 0) {
                positivo += 1;
                soma += numero;

            }
            i++;
        }

        media = soma / positivo;

        System.out.printf("%d valores positivos%n", positivo);
        System.out.printf("%.1f%n", media);

    }
}

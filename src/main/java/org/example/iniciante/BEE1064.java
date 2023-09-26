package org.example.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1064 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double media = 0.0;
        double valor = 0;

        for (int i = 0; i < 6; i++) {
            valor = sc.nextDouble();
            if (valor > 0) {
                cont++;
            }
        }
        System.out.println(valor + " valores positivos");
        media = media / cont;
        System.out.printf("%.1f%n", media);
        sc.close();
    }


}

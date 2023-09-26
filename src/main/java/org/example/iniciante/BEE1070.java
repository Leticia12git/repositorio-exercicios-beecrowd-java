package org.example.iniciante;

import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int cont = 1;

        while (cont <= 12) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x = x + 1;
            cont++;

        }
        sc.close();
    }


}

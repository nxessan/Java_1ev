package org.politecnicoMalaga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;


        System.out.println("Introduce un número entero: ");
        num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        for (int i = num-1; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
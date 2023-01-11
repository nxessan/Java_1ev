package org.politecnicoMalaga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ATRIBUTOS
        int pos, vel, acel, tiempo;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Posición (mayor o igual a cero):");
            pos = teclado.nextInt();
        } while (pos < 0);

        do {
            System.out.println("Velocidad:(entre 0 y 100):");
            vel = teclado.nextInt();
        } while (vel < 0 || vel > 100);

        do {
            System.out.println("Aceleración (entre 5 y 15):");
            acel = teclado.nextInt();
        } while (acel < 5 || acel > 15);

        do {
            System.out.println("Tiempo (entre 10 y 100):");
            tiempo = teclado.nextInt();
        } while (tiempo < 10 || tiempo > 100);

        for (int i = 0; i < tiempo; i++) {
            pos = pos + vel;
            vel = vel + acel;
        }

        System.out.println("Velocidad: " + vel + " m/s");
        System.out.println("Aceleración: " + acel + " m/s2");
        System.out.println("Posición: " + pos + " m");
        System.out.println("Tiempo usado: " + tiempo + " segundos");
    }
}
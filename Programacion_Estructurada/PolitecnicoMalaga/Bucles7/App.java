/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.PolitecnicoMalaga.Bucles7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         *  Realiza el control de acceso a una caja fuerte. Las contraseñas serán combinaciones de 4 caracteres
         *  alfanuméricos. La contraseña inicial será “0000”. Se debe de mostrar un menú cómo el que se
         *  muestra a continuación:
         *  1. Asignar nueva combinación
         *  2. Abrir caja fuerte
         *  0. Salir
         *  Se debe de ejecutar el menú mientras no se pulse un 0. Si nos pulsan 1, pedimos la combinación
         *  anterior y si se acierta, se solicita una nueva que pasará a ser la activa. Si no se acierta se mostrará
         *  “combinación errónea”. En el caso de acertar: “Introduzca nueva combinación” y después
         *  pondremos “Nueva combinación almacenada” cuando nos den la nueva. En el caso de la opción 2,
         *  pedimos la combinación activa y si se acierta se muestra en pantalla “Caja fuerte abierta”.
         *
         * @Author: Noelia Segovia
         */

        Scanner teclado = new Scanner(System.in);
        int opcion;
        int passInicial = 0000;
        int password = 0;
        int passActiva;
        int pin;
        int intento;


        do {
            System.out.println("1. Asignar nueva combinación");
            System.out.println("2. Abrir caja fuerte");
            System.out.println("0. Salir");

            System.out.println("Elija la opción que desea: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Introduzca la password: ");
                pin = teclado.nextInt();
                if (password == passInicial) {
                    System.out.println("Introduzca nueva combinación: ");
                    passActiva = teclado.nextInt();
                    System.out.println("Nueva combinación almacenada.\n");
                } else {
                    System.out.println("Combinación errónea.\n");
                }
            } else if (opcion == 2) {
                System.out.println("Introduce la password: ");
                intento = teclado.nextInt();
                teclado.nextLine();
                if (intento == passInicial) {
                    System.out.println("Caja fuerte abierta.\n");

                }
            } else {
                System.out.println("El programa ha finalizado. ¡Hasta pronto!");
            }
        } while (opcion != 0);
        teclado.close();
    }
}

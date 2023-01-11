package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int limiteInferior, limiteSuperior, num, suma = 0, fuera = 0, igual = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el límite inferior: ");
        limiteInferior = sc.nextInt();
        System.out.println("Introduzca el límite superior: ");
        limiteSuperior = sc.nextInt();

        while (limiteInferior > limiteSuperior) {
            System.out.println("El límite inferior no puede ser mayor que el superior");
            System.out.println("Introduzca el límite inferior del intervalo: ");
            limiteInferior = sc.nextInt();
            System.out.println("Introduzca el límite superior del intervalo: ");
            limiteSuperior = sc.nextInt();
        }

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num != 0) {
            if (num > limiteInferior && num < limiteSuperior) {
                suma = suma + num;
            } else if (num == limiteInferior || num == limiteSuperior) {
                igual++;
            } else {
                fuera++;
            }
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }

        System.out.println("La suma dentro del intervalo es: " + suma);
        System.out.println("Números fuera del intervalo: " + fuera);
        System.out.println("Números iguales a los limites: " + igual);
    }
}
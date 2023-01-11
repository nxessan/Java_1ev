package org.example;

import java.util.Scanner;

public class Main {
    int contNegro, contRojo, contVerde,  contAmarillo;
    public Main() {
        contNegro = 0;
        contRojo = 0;
        contVerde = 0;
        contAmarillo = 0;
    }
    public static void main(String[] args) {

        boolean continuar = true;
        String opcion;

        Scanner scMenu = new Scanner(System.in);
        Main eleccion = new Main();

        //Menu
        while (continuar) {
            System.out.println("");
            System.out.println("Sistema de triaje urgencias hospitalarias:");
            System.out.println("---------------------------------------------");
            System.out.println("1. Realizar triaje");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("(o cualquier otra tecla) Salir");

            opcion = scMenu.nextLine();

            switch (opcion) {
                case "1":
                    eleccion.realizarTriaje();
                    break;
                case "2":
                    eleccion.mostrarEstadisticas();
                    break;
                default:
                    continuar = false;
            }
        }
    }
        //Realizar triaje
        public void realizarTriaje () {

            Scanner sc = new Scanner(System.in);
            String caminar, respira, pulso, orientado, posicionadoRespira;
            int fr;
            boolean continuar = true;

            while (continuar) {
                System.out.println("Inicio");

                System.out.println("¿Puede caminar? (s/n)");
                caminar = sc.next();

                if ("s".equals(caminar)) {
                    System.out.println("Prioridad 3 Verde");
                    contVerde++;
                    continuar = false;

                } else {
                    System.out.println("¿Respira? (s/n)");
                    respira = sc.next();
                    if ("s".equals(respira)) {
                        System.out.println("¿Cuál es su FR?");
                        fr = sc.nextInt();
                        if (fr > 30) {
                            System.out.println("Prioridad 1 Rojo");
                            contRojo++;
                            continuar = false;
                        } else {
                            System.out.println("¿Tiene pulso radial? (s/n)");
                            pulso = sc.next();
                            if ("s".equals(pulso)) {
                                System.out.println("¿Está orientado? (s/n)");
                                orientado = sc.next();
                                if ("s".equals(orientado)) {
                                    System.out.println("Prioridad 2 Amarillo");
                                    contAmarillo++;
                                    continuar = false;


                                } else {
                                    System.out.println("Prioridad 1 Rojo");
                                    contRojo++;

                                    continuar = false;

                                }
                            } else {
                                System.out.println("CONTROLE HEMORRAGIA");
                                System.out.println("Prioridad 1 Rojo");
                                contRojo++;

                                continuar = false;
                            }
                        }
                    } else {
                        System.out.println("¿Al posicionar respira? (s/n)");
                        posicionadoRespira = sc.next();
                        if ("s".equals(posicionadoRespira)) {
                            System.out.println("Prioridad 1 Rojo");
                            contRojo++;
                            continuar = false;

                        } else {
                            System.out.println("Prioridad 0 Negro");

                            contNegro++;
                            continuar = false;
                        }
                    }
                }
            }
        }
    private void mostrarEstadisticas() {

        int negro, rojo, amarillo, verde;
        System.out.println("Estadísticas:");
        System.out.println("Negro:" + contNegro);

        System.out.println("Rojo: " + contRojo);

        System.out.println("Amarillo: " + contAmarillo);

        System.out.println("Verde: " + contVerde);
    }
}
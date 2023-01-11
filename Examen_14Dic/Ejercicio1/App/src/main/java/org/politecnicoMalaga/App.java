package org.politecnicoMalaga;

import java.util.Scanner;

public class App {
    int cerrados, seguimiento, mitigacion;

    public App() {
        cerrados = 0;
        seguimiento = 0;
        mitigacion = 0;
    }

    public static void main(String[] args) {

        //ATRIBUTOS


        String opcion;
        int cerrados, seguimiento, mitigacion;
        boolean continuar = true;

        Scanner teclado = new Scanner(System.in);

        //CREAR OBJETO
        App eleccion = new App();

        while (continuar) {
            System.out.println("INCIBE");
            System.out.println("Sistema de clasificación de Tickets de detección temprana de Ciberdelincuencia: ");
            System.out.println("---------------> MENÚ <---------------");
            System.out.println("");
            System.out.println("1. Realizar clasificación");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("Cualquier otra entrada: SALIR");

            //Opciones
            System.out.println("Elige una opción: ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":  //realizar clasificacion
                    eleccion.clasificar();
                    break;
                case "2": //mostrar estadisticas
                    eleccion.mostrarEstadisticas();
                    break;
                default: //salir
                    continuar = false;
                    break;
            }
        }
    }

    //MÉTODOS
    //MEOTODO CLASIFICACION
    public void clasificar() {
        //ATRIBUTOS
        Scanner teclado = new Scanner(System.in);
        int respuesta, resuelto, emergencia, prioridad;
        boolean parar = false;

        //TENDRIA QUE HABER HECHO UN CASTING PARA QUE ME RECONOCIERA LAS OPCIONES COMO NUMEROS, O LETRAS, PERO NO ME HA DADO TIEMPO.

        while (parar) {
            System.out.println("CREAR TICKET");
            System.out.println("¿Es un ticket que genera emergencia? (Marca 1 para sí o 2 para no)");
            emergencia = teclado.nextInt();
            if (emergencia == 2) {
                System.out.println("LANZAR TICKET");
                System.out.println("¿Respuesta?(Marca 1 para sí o 2 para no)");
                respuesta = teclado.nextInt();
                if (respuesta == 1) {
                    System.out.println("¿Se ha resuelto?(Marca 1 para sí o 2 para no)");
                    resuelto = teclado.nextInt();
                    if (resuelto == 1) {
                        System.out.println("CIERRE TICKET");
                        cerrados++;
                        parar = true;
                    } else {
                        System.out.println("SEGUIMIENTO INCIDENTE");
                        seguimiento++;
                        parar = true;
                    }
                } else {
                    System.out.println("¿Prioridad alta?(Marca 1 para sí o 2 para no)");
                    prioridad = teclado.nextInt();
                    if (prioridad == 2 ) {
                        System.out.println("PROCEDIMIENTO DE MITIGACIÓN");
                        mitigacion++;
                        parar = true;
                    } else {
                        System.out.println("SEGUIMIENTO INCIDENTE");
                        seguimiento++;
                        parar = true;
                    }
                }
            }
        }
    }

        //METODO PARA MOSTRAR ESTADISTICAS
        public void mostrarEstadisticas () {
            System.out.println("ESTADÍSTICAS");
            System.out.println("Tickets cerrados: " + cerrados);
            System.out.println("Tickets en seguimiento: " + seguimiento);
            System.out.println("Tickets en mitigación: " + mitigacion);
        }
}
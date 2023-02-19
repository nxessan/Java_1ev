package com.politecnicomalaga.tienda_ex;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Tienda_ex {

    public static void main(String[] args) {

        Productos producto1 = new Productos();
        Productos producto2 = new Productos();

        Scanner sC = new Scanner(System.in);
        boolean continuar = true;
        String opcion;

        //Menu
        while (continuar) {
            System.out.println("");
            System.out.println("---------------> MENÚ <---------------");
            System.out.println("");
            System.out.println("Escoja la opcion a realizar:");
            System.out.println("1. Crear producto 1");
            System.out.println("2. Crear producto 2");
            System.out.println("3. Aumentar precio producto 1");
            System.out.println("4. Aumentar precio producto 2");
            System.out.println("5. Rebajar precio producto 1");
            System.out.println("6. Rebajar precio producto 2");
            System.out.println("7. Mostrar datos de los productos (de los dos)");
            System.out.println("8. Salir");
            System.out.println("Cualquier otra entrada: SALIR");

            opcion = sC.nextLine();

            switch (opcion) {
                case "1": // Crear producto 1
                    System.out.println("Introduce la descripción del producto a crear: ");
                    String desc1 = sC.nextLine();

                    System.out.println("Introduce el código del producto a crear: ");
                    int cod1 = sC.nextInt();

                    System.out.println("Introduce el precio del producto a crear: ");
                    float precio1 = sC.nextFloat();
                    sC.nextLine();

                    producto1 = new Productos(desc1, cod1, precio1);
                    break;

                case "2": // Crear producto 2
                    System.out.println("Introduce la descripción del producto a crear: ");
                    String desc2 = sC.nextLine();

                    System.out.println("Introduce el código del producto a crear: ");
                    int cod2 = sC.nextInt();

                    System.out.println("Introduce el precio del producto a crear: ");
                    float precio2 = sC.nextFloat();
                    sC.nextLine();

                    producto2 = new Productos(desc2, cod2, precio2);
                    break;

                case "3": // Aumentar precio producto 1
                    System.out.println("¿Cuánto desea incrementar el precio del producto 1?");
                    int porcentaje1 = sC.nextInt();
                    sC.nextLine();

                    producto1.aumPrecio(porcentaje1);
                    break;

                case "4": // Aumentar precio producto 2
                    System.out.println("¿Cuánto desea incrementar el precio del producto 2?");
                    int porcentaje2 = sC.nextInt();
                    sC.nextLine();

                    producto2.aumPrecio(porcentaje2);
                    break;

                case "5": // Rebajar precio producto 1
                    System.out.println("¿Cuánto desea rebajar el precio del producto 1?");
                    int descuento1 = sC.nextInt();
                    sC.nextLine();

                    producto1.setPorcentaje(descuento1);
                    System.out.println("Nuevo precio producto 1: " + producto1.rebPrecio(descuento1));
                    break;

                case "6": // Rebajar precio producto 2
                    System.out.println("¿Cuánto desea rebajar el precio del producto 2?");
                    int descuento2 = sC.nextInt();
                    sC.nextLine();

                    producto2.setPorcentaje(descuento2);
                    System.out.println("Nuevo precio producto 2: " + producto2.rebPrecio(descuento2));
                    break;

                case "7": //Mostrar datos de los productos (de los dos)
                    System.out.println(producto1.toString());
                    System.out.println(producto2.toString());
                    break;

                case "8": //Salir
                    continuar = false;

                    break;

                default:
                    continuar = false;
                    break;
            }
        }
    }
}

package com.politecnicomalaga.tienda;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Tienda {

    public static void main(String[] args) {

        String desc;
        int cod;
        float precio = 0;
        int porcentaje = 0;
        Productos producto1 = null;
        Productos producto2 = null;

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
                case "1": //Crear producto 1
                    System.out.println("Introduce la descripción del producto a crear: ");
                    desc = sC.nextLine();

                    System.out.println("Introduce el codigo del producto a crear: ");
                    cod = sC.nextInt();

                    System.out.println("Introduce la descripción del producto a crear: ");
                    precio = sC.nextFloat();

                    producto1 = new Productos(desc, cod, precio);
                    break;

                case "2": //Crear producto 2
                    System.out.println("Introduce la descripción del producto a crear: ");
                    desc = sC.nextLine();

                    System.out.println("Introduce el codigo del producto a crear: ");
                    cod = sC.nextInt();

                    System.out.println("Introduce la descripción del producto a crear: ");
                    precio = sC.nextFloat();

                    producto2 = new Productos(desc, cod, precio);
                    break;
                case "3": //Aumentar precio producto 1
                    System.out.println("¿Cuánto desea incrementar el precio?");
                    porcentaje = sC.nextInt();
                    producto1.aumPrecio(precio, porcentaje);
                    break;

                case "4": //Aumentar precio producto 2
                    System.out.println("¿Cuánto desea incrementar el precio?");
                    porcentaje = sC.nextInt();
                    producto2.aumPrecio(precio, porcentaje);
                    break;
                case "5": //Rebajar precio producto 1
                    System.out.println("¿Cuánto desea rebajar el precio?");
                    porcentaje = sC.nextInt();
                    producto1.rebPrecio(precio, porcentaje);
                    break;

                case "6": //Rebajar precio producto 2
                    System.out.println("¿Cuánto desea rebajar el precio?");
                    porcentaje = sC.nextInt();
                    producto2.rebPrecio(precio, porcentaje);
                    break;

                case "7": //Mostrar datos de los productos (de los dos)
                    producto1.toString();
                    producto2.toString();
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

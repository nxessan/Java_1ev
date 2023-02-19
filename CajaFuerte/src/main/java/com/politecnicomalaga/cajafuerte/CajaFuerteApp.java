/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.cajafuerte;

import java.util.Scanner;

public class CajaFuerteApp {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    CajaFuerte miCajaCaudales = new CajaFuerte("0000");
    int opcion; // opción seleccionada por teclado

    String clave;
    String antiguaClave; // contraseña antigua
    String nuevaClave; // contraseña nueva

    do {
      System.out.println("1. Asignar nueva combinación");
      System.out.println("2. Abrir caja fuerte");
      System.out.println("3. Ingresar");
      System.out.println("4. Retirar");
      System.out.println("5. Consultar saldo");
      System.out.println("6 o cualquier otra tecla para salir");
      System.out.println("Seleccione una opción: ");
      opcion = teclado.nextInt();
      teclado.nextLine(); // para consumir el salto de línea después de leer un número

      switch (opcion) {
        case 1:
          System.out.println("Introduzca la contraseña actual: ");
          antiguaClave = teclado.nextLine();
          System.out.println("Introduzca la nueva contraseña: ");
          nuevaClave = teclado.nextLine();

          if (miCajaCaudales.cambiarClave(antiguaClave, nuevaClave)) {
            System.out.println("Contraseña actualizada");
          } else {
            System.out.println("La contraseña antigua no es correcta");
          }
          break;
        case 2:
          System.out.println("Introduzca la contraseña: ");
          clave = teclado.nextLine();

          // CONTRASEÑA CORRECTA
          if (miCajaCaudales.abrir(clave)) {
            System.out.println("Caja fuerte abierta con éxito");
          }
          // CONTRASEÑA INCORRECTA
          else {
            System.out.println("La contraseña es incorrecta");
          }
          break;
        case 3:
          System.out.println("Introduzca la contraseña: ");
          clave = teclado.nextLine();

          if (miCajaCaudales.abrir(clave)) {
              int dineroaIngresar;
              System.out.println("¿Cuánto dinero desea ingresar?");
              dineroaIngresar = teclado.nextInt();
            miCajaCaudales.introducirDinero(dineroaIngresar); // añade el dinero a la caja fuerte
          } else {
            System.out.println("Primero debe abrir la caja fuerte");
          }
          break;
        case 4:
          System.out.println("Introduzca la contraseña: ");
          clave = teclado.nextLine();

          if (miCajaCaudales.abrir(clave)) {
              int dineroaSacar;
              System.out.println("¿Cuánto dinero desea ingresar?");
              dineroaSacar = teclado.nextInt();
            miCajaCaudales.introducirDinero(dineroaSacar); // saca el dinero de la caja fuerte
          } else {
            System.out.println("Primero debe abrir la caja fuerte");
          }
          break;  
        case 5:
            miCajaCaudales.consultarSaldo();
        default:
          System.out.println("Programa finalizado.");
          break;
      }
    } while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4  || opcion == 5);
  }
}
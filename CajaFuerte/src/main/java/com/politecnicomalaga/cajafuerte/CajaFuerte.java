/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.politecnicomalaga.cajafuerte;

/**
 *
 * @author USER
 */
public class CajaFuerte {
    // ESTADO, ATRIBUTOS
    // Mientras esté funcionando, tiene que recordar la key

    private String clave;
    private int dinero; // cantidad de dinero dentro de la caja fuerte

    // CONSTRUCTOR
    public CajaFuerte(String passInicial) {
        this.clave = passInicial;
        this.dinero = 0;
    }

    // COMPORTAMIENTOS
    public boolean cambiarClave(String claveActual, String nuevaClave) {
        if (claveActual.equals(clave)) {
            if (nuevaClave.length() != 4 || nuevaClave.equals(clave)) {
                System.out.println("ERROR! La clave debe tener 4 caracteres y no puede ser igual a la anterior");
                return false;
            } else {
                clave = nuevaClave;
                System.out.println("Clave cambiada correctamente");
                return true;
            }
        } else {
            System.out.println("Clave incorrecta");
            return false;
        }
    }

    // Método abrir
    public boolean abrir(String clave) {
        if (clave.equals(this.clave)) {
            System.out.println("La caja fuerte ha sido abierta");
            return true;
        } else {
            System.out.println("Clave incorrecta");
            return false;
        }
    }

    // Método introducirDinero
    public void introducirDinero(int cantidad) {
        dinero = dinero + cantidad;
        System.out.println(cantidad + "€ introducidos en la caja fuerte");
    }
    
    public void sacarDinero(int cantidad){
        dinero = dinero - cantidad;
        System.out.println(cantidad + "€ sacados de la caja fuerte");
    }
    
    public void consultarSaldo (){
        System.out.println("Su saldo es de: " + dinero + "€");
    }
}

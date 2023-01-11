/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.reloj;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Reloj {

    public static void main(String[] args) {
        Reloj miCrono, miCuentaAtras;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        String entrada;
        String dato;
        
        miCrono = new Reloj(0,0,0,0);
        miCuentaAtras = new Reloj(0,0,10,0);  //d, seg, min, hor
        
        do {
            //Opciones
            System.out.println("1. Resetear el reloj");
            System.out.println("2. Resetear la cuenta atrás");
            System.out.println("3. Avanzar un número de décimas de segundo en el reloj");
            System.out.println("4. Atrasar la cuenta atrás un número de décimas");
            System.out.println("5. Asignar un tiempo directamente al reloj");
            System.out.println("6. Asignar un tiempo directamente a la cuenta atrás");
            System.out.println("7. Salir");
            //leer del teclado
            sc.reset();
            entrada = sc.nextLine();
            //decidir
            switch (entrada) {
                case "1": //Resetear el reloj
                    miCrono.setTime(0, 0, 0, 0);
                    break;
                case "2": //Resetear la cuenta atrás
                    miCuentaAtras.setTime(0, 0, 0, 0);
                    break;
                case "3": //Avanzar un número de décimas de segundo en el reloj
                    System.out.println("Introduzca el tiempo a avanzar: ");
                    dato = sc.nextLine();

                    for (int i = 0; i < Integer.parseInt(dato); i++) {
                        miCrono.avanzarDecima();
                    }
                    System.out.println("El resultado es:");
                    System.out.println("Horas: " + miCrono.getHoras());
                    System.out.println("Minutos: " + miCrono.getMinutos());
                    System.out.println("Segundos: " + miCrono.getSegundos());
                    System.out.println("Decimas: " + miCrono.getDecimas());

                    break;
                case "4": //Atrasar la cuenta atrás un número de décimas
                    System.out.println("Introduzca el tiempo a atrasar: ");
                    dato = sc.nextLine();

                    for (int i = 0; i < Integer.parseInt(dato); i++) {
                        miCuentaAtras.atrasarDecima();
                    }
                    System.out.println("El resultado es:");
                    System.out.println("Horas: " + miCuentaAtras.getHoras());
                    System.out.println("Minutos: " + miCuentaAtras.getMinutos());
                    System.out.println("Segundos: " + miCuentaAtras.getSegundos());
                    System.out.println("Decimas: " + miCuentaAtras.getDecimas());
                    break;
                case "5": //Asignar un tiempo directamente al reloj
                    System.out.println("Asigna la hora: ");
                    dato = sc.nextLine();
                    miCrono.setHoras(Integer.parseInt(dato));
                    System.out.println("Asigna los minutos: ");
                    dato = sc.nextLine();
                    miCrono.setMinutos(Integer.parseInt(dato));
                    System.out.println("Asigna los segundos: ");
                    dato = sc.nextLine();
                    miCrono.setSegundos(Integer.parseInt(dato));
                    System.out.println("Asigna las decimas: ");
                    dato = sc.nextLine();
                    miCrono.setDecimas(Integer.parseInt(dato));

                    System.out.println("Horas: " + miCrono.getHoras());
                    System.out.println("Minutos: " + miCrono.getMinutos());
                    System.out.println("Segundos: " + miCrono.getSegundos());
                    System.out.println("Decimas: " + miCrono.getDecimas());

                    break;
                case "6": // Asignar un tiempo directamente a la cuenta atrás
                    System.out.println("Establezca la hora de la cuenta atrás: ");
                    dato = sc.nextLine();
                    miCuentaAtras.setHoras(Integer.parseInt(dato));
                    System.out.println("Establezca los minutos de la cuenta atrás: ");
                    dato = sc.nextLine();
                    miCuentaAtras.setMinutos(Integer.parseInt(dato));
                    System.out.println("Establezca los segundos de la cuenta atrás: ");
                    dato = sc.nextLine();
                    miCuentaAtras.setSegundos(Integer.parseInt(dato));
                    System.out.println("Establezca las décimas de la cuenta atrás: ");
                    dato = sc.nextLine();
                    miCuentaAtras.setDecimas(Integer.parseInt(dato));
                    System.out.println("Horas: " + miCuentaAtras.getHoras());
                    System.out.println("Minutos: " + miCuentaAtras.getMinutos());
                    System.out.println("Segundos: " + miCuentaAtras.getSegundos());
                    System.out.println("Decimas: " + miCuentaAtras.getDecimas());
                    break;
                case "7":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while(continuar);
    }
    
    
    //ESTADO - ATRIBUTOS
    private int decimas;
    private int segundos;
    private int minutos;
    private int horas;
    
    
    // COMPORTAMIENTO - MÉTODOS
    
    //Construtor
    public Reloj(int h, int m, int s, int d) {
        if (d<0 || d>9 || s < 0 || s>59 || m <0 || m>59 || h < 0 || h > 23) {
            decimas = 0;
            segundos = 0;
            minutos = 0;
            horas = 0;
        } else {
            decimas = d;
            segundos = s;
            minutos = m;
            horas = h;
        }
    }
    
    //Resto de métodos
    
    //Getters

    public int getDecimas() {
        return decimas;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }
    
    //asignar un momento determinado
    public boolean setTime(int d, int s, int m, int h) {
        if (!(d<0 || d>9 || s < 0 || s>59 || m <0 || m>59 || h < 0 || h > 23)) {
            decimas = d;
            segundos = s;
            minutos = m;
            horas = h;
            return true;
        }
        return false;
    }
    
    
    //Setters
    
    public void setDecimas(int decimas) {
        if (decimas>=0 && decimas <10)
           this.decimas = decimas;
    }

    public void setSegundos(int segundos) {
        if (segundos>=0 && segundos <60)
        this.segundos = segundos;
    }

    public void setMinutos(int minutos) {
        if (minutos>=0 && minutos <60)
        this.minutos = minutos;
    }

    public void setHoras(int horas) {
        if (horas>=0 && horas <24)
        this.horas = horas;
    }
    
    
    
    public void avanzarDecima() {
        decimas++;
        this.test();
    }

    public void atrasarDecima() {
        decimas--;
        this.test();
    }
    
    
    public void retrasarDecima() {
        decimas--;
        this.test();
        
    }
    
    private void test() {
        testDecimas();
        testSegundos();
        testMinutos();
        testHoras();
    }
    
    
    private void testDecimas() {
        if (decimas == -1) {
            decimas = 9;
            segundos--;
        } else if (decimas == 10) {
            decimas = 0;
            segundos++;
        }
    }
    
    private void testSegundos() {
        if (segundos == -1) {
            segundos = 59;
            minutos--;
        } else if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
    }
    
    private void testMinutos() {
        if (minutos == -1) {
            minutos = 59;
            horas--;
        } else if (minutos == 60) {
            minutos = 0;
            horas++;
        }
    }
    
    private void testHoras() {
        if (horas == -1) { //Estaba en el 00:00:00:0 y me han restado una decima
            decimas = 9;
            horas = 23;
            minutos = 59;
            segundos = 59;
        } else if (horas == 24) {  //Estaba en el 23:59:59:9 y me han sumado una decima
            decimas = 0;
            horas = 0;
            minutos = 0;
            segundos = 0;
        }
    }
}

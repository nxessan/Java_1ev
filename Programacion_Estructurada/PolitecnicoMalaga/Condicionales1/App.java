/* Realiza un programa que pida una hora por teclado y que muestre luego 
    buenos días, buenas tardes o buenas noches según la hora. 
    Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
    respectivamente. Sólo se tienen en cuenta las horas, 
    los minutos no se deben introducir por teclado.
 */
package Condicionales1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int hora;

        System.out.println("Introduce la hora: ");
        hora = teclado.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");

        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
        teclado.close();
    }
}

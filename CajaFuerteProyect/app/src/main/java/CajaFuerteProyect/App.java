package CajaFuerteProyect;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        CajaFuerte miCajaCaudales = new CajaFuerte("0000");
        int select; //opción seleccionada por teclado

        String clave;
        String oldPass; //contraseña antigua
        String newPass; //contraseña nueva

        do {

            System.out.println("1. Asignar nueva combinación");//Los paréntesis son comportamirntos.
            System.out.println("2. Abir caja fuerte");
            System.out.println("3. Salir");

            System.out.println("Seleccione una opción: ");
            select = teclado.nextInt();

            //CASO 1
            if (select == 1) {

                System.out.println("Introduzca la contraseña actual: ");
                oldPass = teclado.nextLine();
                teclado.next();
                System.out.println("Introduzca la nueva contraseña: ");
                newPass = teclado.nextLine();
                teclado.next();

                if (miCajaCaudales.changePass(oldPass, newPass)) {
                    System.out.println("Contraseña actualizada");
                } else {
                    System.out.println("La contraseña antigua no es correcta");
                }
            } //CASO 2
            else if (select == 2) {

                System.out.println("Introduzca la contraseña: ");
                clave = teclado.nextLine();

                //CONTRASEÑA CORRECTA
                if (miCajaCaudales.open(clave)) {
                    System.out.println("Caja fuerte abierta con éxito");
                } //CONTRASEÑA INCORRECTA
                else {
                    System.out.println("Combinación incorrecta");
                }
                
            } //CASO INEXISTENTE
            else if (select != 0) {
                System.out.println("Esa opción es incorrecta");
            }
        } while (select != 0);
        System.out.println("Programa finalizado. ¡Hasta pronto!");
    }
}

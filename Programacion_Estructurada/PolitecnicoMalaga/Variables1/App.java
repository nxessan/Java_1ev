package Variables1;

public class App {

    /*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 200 y
    111 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
    resta, la división y la multiplicación.*/
    public static void main(String[] args) {
        int x = 200, y = 111;
        int suma, resta, div, mult;

        suma = x + y;
        resta = x - y;
        div = x / y;
        mult = x * y;

        System.out.println("El resultado de sumar los números es: " + suma);
        System.out.println("El resultado de restar los números es: " + resta);
        System.out.println("El resultado de dividir los números es: " + div);
        System.out.println("El resultado de multiplicar los números es: " + mult);
    }
}

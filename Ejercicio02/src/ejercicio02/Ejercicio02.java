package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int contador;
        contador = 1;
        System.out.println("Ingrese un numero entero positivo y par");
        n = entrada.nextInt();
        if (n > 0 && n % 2 == 0) {
            do {
                System.out.println(contador);
                contador = contador + 1;
            } while (contador <= n);
        } else {
            System.out.println("El numero ingresado no cumple con la norma");
            }
    }
    
}

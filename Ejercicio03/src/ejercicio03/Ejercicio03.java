package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int m;
        int resultado;
        resultado = 0;
        System.out.println("Ingrese el multiplicando");
        n = entrada.nextInt();
        System.out.println("Ingrese el multiplicador");
        m = entrada.nextInt();
        while (m > 0){
            if (m % 2 != 0){
                resultado = resultado + n;
            }
            n = n * 2;
            m = m / 2;
        }
        System.out.println("El resultado es: " + resultado);
    }
}

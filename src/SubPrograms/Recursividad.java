package SubPrograms;

import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        n = teclado.nextInt();

        if(n > 0) {
            System.out.printf("%d! = %d", n, factorial(n));
        } else {
            System.out.printf("ERROR: El número debe ser mayor que cero.");
        }
    }

    private static int factorial(int numero) {
        int contador, resultado;
        resultado = numero;

        while(numero > 2) {
            numero -= 1;
            resultado *= numero;
        }

        return resultado;
    }
}

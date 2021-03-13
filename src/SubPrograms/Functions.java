package SubPrograms;
import java.util.Scanner;
/*
* https://www.abrirllave.com/java/funciones.php
* */
public class Functions {
    public static void main(String[] args) {
        int n1,n2,resultado;
        Scanner e1 = new Scanner(System.in);
        Scanner e2 = new Scanner(System.in);
        /*System.out.println("Vamos a multiplicar :D");
        System.out.print("Escriba un numero:");
        n1 = e1.nextInt();
        System.out.printf("Escriba otro numero:");
        n2 = e2.nextInt();
        resultado = n1 * n2;
        System.out.printf("Su resultado es: %d" , resultado);*/
        System.out.println("Vamos a multiplicar amigos!!!");
        System.out.print("Escribe un numero: ");
        n1 = e1.nextInt();
        System.out.print("Escribe otro numero: ");
        n2 = e2.nextInt();
        resultado = multiplicar(n1, n2);
        System.out.printf("Resultado: %d", resultado);
    }

    private static int multiplicar(int x1, int x2){
        int resultado;
        resultado = x1 * x2;
        return  resultado;
    }
}

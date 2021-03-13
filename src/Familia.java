import java.util.Scanner;
public class Familia {
    public static void main(String[] args) {
        /*String papa="Alexander", mama="Yovani", hermano="Juan", hermana="Alexa", esposa="Zonia";
        System.out.println("papa: "+ papa);
        System.out.println("mama: "+ mama);
        System.out.println("hermano: "+ hermano);
        System.out.println("hermana: "+ hermana);
        System.out.println("esposa: "+ esposa);
        String[] familia;*/

        float nota;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduzca su nota: ");
        nota = teclado.nextFloat();
        if(nota>=5){
            System.out.printf("Usted ha sido %s con la nota: %f", "Aprobado\n",nota);
        }else {
            System.out.printf("Suspendido");
        }

        System.out.println("\nHola mundo");
        System.out.println("Voy a programar en Java");

        System.out.print("Hola mundo");
        System.out.print("Voy a programar en Java");
        /*
        System.out es para mostrar algo en pantalla
        System.in es para ingresar algo por el teclado

        Ejemplo: creacion de objeto entrada:
        Scanner entrada = new Scanner(System.in);
        <tipo> <nombre_variable> = <valor>;
        */
    }
}

package StructureControl;

import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {
        boolean autorizado;
        int edad;
        Scanner entryYear = new Scanner(System.in);
        System.out.print("Por favor ingresa tu edad: ");
        edad = entryYear.nextInt();

        if(edad >= 18){
            autorizado = true;
        }else{
            autorizado = false;
        }

        if (autorizado){
            System.out.println("Bienvenido, siga hoy tenemos barra libre!!!");
        }else{
            System.out.println("Lo sentimos pero no eres mayor de edad");
        }
    }
}

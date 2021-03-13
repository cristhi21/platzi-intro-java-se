import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        String colorModeOptions;
        colorModeOptions = "Spring";
        Scanner ent1 = new Scanner(System.in);
        int day;

        switch(colorModeOptions){
            case "Nigth":
                System.out.println("Seleccionaste la opcion de Nigth");
                break;
            case "Spring":
                System.out.println("Seleccionaste la opcion Spring");
                System.out.println("Por favor ingresar un numero del uno al siete");
                day = ent1.nextInt();
                switch (day){
                    case 1:
                        System.out.println("Primavera un dia lunes");
                        break;
                    case 2:
                        System.out.println("Primavera un dia Martes");
                        break;
                    case 3:
                        System.out.println("Primavera un dia Miercoles");
                        break;
                    case 4:
                        System.out.println("Primavera un dia jueves");
                        break;
                    case 5:
                        System.out.println("Primavera un dia Viernes, wihi el cuerpo lo sabe!");
                        break;
                    case 6:
                        System.out.println("Primavera un dia Sabado, es el dia de bailar");
                        break;
                    case 7:
                        System.out.println("Primavera un dia Domingo a pasear!");
                        break;
                    default:
                        System.out.println("Ingresaste un dia errado! intentalo de nuevo");

                }
                break;
            case "BlueDark":
                System.out.println("Seleccionaste la opcion de BlueDark");
                break;
            default:
                System.out.println("Debes de seleccionar una opción valida!");
        }
    }
}

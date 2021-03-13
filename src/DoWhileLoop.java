import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int respuesta = 0;
        do{
            System.out.println("Welcome a netflix, please select the desired option:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta){
                case 0:
                    System.out.println("thanks come back soon");
                    break;
                case 1:
                    System.out.println("The movie");
                    break;
                case 2:
                    System.out.println("The Series");
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        } while (respuesta != 0);
    }
}

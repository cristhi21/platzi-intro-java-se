public class ForLoop {
    static  boolean isTurnOnLigth = false;

    public static void main(String[] args) {
        turnOnOffLigth();
        for (int j = 1; j <= 10 ; j++) {
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    /**
     * Es una funcion bandera que cambia a true si esta en false
     * */
    public static boolean turnOnOffLigth(){
        isTurnOnLigth = (isTurnOnLigth) ? false : true;
        return isTurnOnLigth;
    }
}

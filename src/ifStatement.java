public class ifStatement {
    public static void main(String[] args) {
        boolean blueActivated = true;
        int fileTransfer = 3;

        if(blueActivated){
            System.out.println("Archivo enviado exitosamente!");
            fileTransfer++;
            int i = 1;
            i++;
            System.out.printf("Entero: " + i + "\n");
        }
        System.out.println("blueActivated: " + blueActivated);
        System.out.printf("fileTransfer %d", fileTransfer);
        //System.out.printf("Entero: " + i);
    }
}

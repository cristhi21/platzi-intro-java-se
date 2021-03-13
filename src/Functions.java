public class Functions {
    public static void main(String[] args) {
        double y = 3;
        System.out.println("Vamos a realizar operacion para calcular radio:");
        double r = circleArea(y);
        System.out.printf("Nuestro resultado es: %f", r);

        System.out.println("\nArea de la esfera: " + sphereArea(y));
        System.out.println("Volumen de la esfera: " + sphereVolumen(y));
        System.out.println("Conversor de pesos a USD:" + convertToDolar(20, "COP"));
    }

    public static double circleArea(double y){
        double resul = Math.PI * Math.pow(y,2);
        return resul;
    }

    public static double sphereArea(double r){
        return  4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especifica la moneda y devuelve una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: MXN o COP
     * @return
     */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.049;
                break;
            case "COP":
                quantity = quantity * 0.00028;
                break;
            default:
                quantity = 0;
        }
        return  quantity;
    }
}

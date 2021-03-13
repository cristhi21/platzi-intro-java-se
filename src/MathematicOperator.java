public class MathematicOperator  {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //Math es una clase de Java que nos ayuda a ejecutar diferentes operaciones matemáticas:
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //Imprime entero redondeado hacia arriba
        System.out.println(Math.ceil(x));
        //Imprime entero redondeado hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Calcular area de un circulo
        //PI * r2 (en este caso el area es 3)
        System.out.println(Math.PI * Math.pow(y,2));

        //Calcular el area de una esfera
        // 4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de una esfera ( (4/3) * PI * r^3)
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}

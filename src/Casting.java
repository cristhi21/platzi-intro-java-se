public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        double y =3;
        System.out.println(Math.sqrt(y));
        System.out.println((int) Math.sqrt(y));


        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println(a/b);
        System.out.println((double) a/b);

        short d = (short)1921222;
        System.out.println(d);

        //Aqui se realiza un casteo implicito a Int y trunca los digitos decimales
        double c = a/b;
        System.out.println(c);
        //En este casteo a double respeta los decimales y se debe realiza cuando preferimos exactitud
        double e = (double) a/b;
        System.out.println(e);

        //Aqui nos imprime 49 por la tabla ascci
        char n = '1';
        int n1 = n;
        System.out.println(n1);
        //Aqui nos pide casteo implicito porque shot es mas pequeño que char
        short ns = (short) n;
        System.out.println(ns);
    }
}

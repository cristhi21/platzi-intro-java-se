public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        //lives = lives - 1;
        lives--;
        System.out.println(lives);
        lives++;
        System.out.println(lives);

        // Primero accede a la variable y luego la incrementa
        int gift = 100 + lives++;
        System.out.println(gift); // Accede a lives
        System.out.println(lives);
    }
}

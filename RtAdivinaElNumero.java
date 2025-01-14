import java.util.Scanner;

class RtAdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_NUMBER = 100;
        final int MIN_NUMBER = 1;
        int numberToGuess = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;
        boolean isGuessed = false;

        System.out.println("Juguemos a Adivinar el número!!");

        while (attempts < MAX_ATTEMPTS && !isGuessed) {
            System.out.println("Estás en el turno " + (attempts + 1));
            System.out.println("Adivina el número entre " + MIN_NUMBER + " y " + MAX_NUMBER);
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("¡Ganaste! El número era " + numberToGuess);
                isGuessed = true;
            } else {
                String message = (guess < numberToGuess) ? "El número es mayor" : "El número es menor";
                System.out.println(message);
                System.out.println("Sigue intentando");
            }

            attempts++;
        }
        if (!isGuessed) {
            System.out.println("¡Se te acabaron los intentos! El número era " + numberToGuess);
        }
        scanner.close();
    }
}
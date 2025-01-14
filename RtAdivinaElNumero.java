import java.util.Scanner;

class RtAdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_NUMBER = 100;
        final int MIN_NUMBER = 1;
        int numberToGuess = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
        
        System.out.println("Elige un numero del 1 al 100");
        
        String userInput = scanner.nextLine();
        int userElection = Integer.parseInt(userInput);

        System.out.println(userElection == numberToGuess 
            ? "Felecidades adivinaste el numero!!!!" 
            : userElection > numberToGuess 
                ? "Tu eleccion fue mayor que el numero que estaba pensando" 
                : "Tu eleccion fue menor a la que estaba pensando");
        
        System.out.println("La eleccion aleatoria de la computadora fue: " + numberToGuess); 
        System.out.println("La eleccion del usuario fue: " + userElection);
        scanner.close();
    }
}
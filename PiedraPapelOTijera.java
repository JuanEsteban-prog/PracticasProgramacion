import java.util.Random;
import java.util.Scanner;

public class PiedraPapelOTijera {
    public static void main(String[] args) {
        Scanner userElection = new Scanner(System.in);
        Random random = new Random();

        String [] options = {"Piedra", "Papel", "Tijera"};
        String [] [] results = {
            {"Empate", "Perdiste", "Ganaste"},
            {"Ganaste", "Empate", "Perdiste"},
            {"Perdiste", "Ganaste", "Empate"}
        };

        System.out.println("Juguemos Piedra, Papel o Tijeras !!!");
        System.out.println("Selecciona una opción: ");
        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");


        int userChoice = userElection.nextInt();
        int computerChoice = random.nextInt(3);

        if(userChoice>3 && userChoice<1){
            System.out.println("Opción no válida, por favor selecciona una opción válida.");
        }

        System.out.println("El usuario eligio: "+ options[userChoice]);
        System.out.println("La computadora eligio: " + options[computerChoice]);

        System.out.println(results[userChoice][computerChoice]);

        userElection.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelOTijera {
    public static void main(String[] args) {

        showMenu();

        int userChoice = getUserChoice();
        int computerChoice = getComputerChoice();

        showOptions(userChoice, computerChoice);
        showResults(userChoice, computerChoice);
    }

    static void showMenu() {
        System.out.println("Juguemos Piedra, Papel o Tijeras !!!");
        System.out.println("Selecciona una opción: ");
        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");
    }

    static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Ingresa tu elección: ");
            choice = scanner.nextInt();
        } while (choice < 0 && choice > 2);  
        return choice;
    }

    static int getComputerChoice() {
        Random random = new Random();
        return random.nextInt(3);
    }

    static void showOptions(int userChoice, int computerChoice) {
        String[] options = {"Piedra", "Papel", "Tijera"};
        System.out.println("El usuario eligió: " + options[userChoice]);
        System.out.println("La computadora eligió: " + options[computerChoice]);
    }

    static void showResults(int userChoice, int computerChoice) {
        String[][] results = {
            {"Empate", "Perdiste", "Ganaste"},
            {"Ganaste", "Empate", "Perdiste"},
            {"Perdiste", "Ganaste", "Empate"}
        };
        System.out.println("Resultado: " + results[userChoice][computerChoice]);
    }

}

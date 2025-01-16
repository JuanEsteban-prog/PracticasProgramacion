import java.util.Scanner;

public class EntradaYSalidaDeDatos {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();
        System.out.println(edad);

        entrada.close();
    }
}
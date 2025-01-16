import java.util.Scanner;
public class Práctica {
    public static void main(String[] args) {
        final int NUMERO_MINIMO = 1;
        final int NUMERO_MAXIMO = 100;
        int intentos = 0;
        final int MAX_INTENTOS = 10;

        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("¡Juguemos a adivinar el número!");
        System.out.println("Escoge un número entre 1 y 100");
        System.out.println("Solo tendrás 10 intentos, ¡úsalos bien!");

        int eleccionComputadora = (int)(Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO + 1) + NUMERO_MINIMO);

        System.out.print("Ingresa tu número: ");
        int eleccionUsuario = entradaUsuario.nextInt();

        if (eleccionUsuario == eleccionComputadora) {
            System.out.println("¡Lo has acertado!");
        } else {
            System.out.println("Fallaste jajajaja");
        }

        System.out.println("Número de la computadora: " + eleccionComputadora);
        System.out.println("Tu número: " + eleccionUsuario);

        entradaUsuario.close();
    }
}

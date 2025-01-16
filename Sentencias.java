import java.util.Scanner;

public class Sentencias {
    public static void main(String[] args) {
        final int MAYORIA_EDAD = 18;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = entrada.nextInt();

        if (numero >= MAYORIA_EDAD) {
            System.out.println("Felicidades, eres mayor de edad");
        } else if (numero < MAYORIA_EDAD) {
            System.out.println("JAJAJAJAJA, eres menor de edad");
        } else {
            System.out.println("Ingresa una edad válida");
        }

        entrada.close();
    }
}

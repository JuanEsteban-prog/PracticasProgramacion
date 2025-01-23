import java.util.Scanner;

public class NotaExamenFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PESO_EXAMEN_FINAL = 0.50;
        final double PESO_PARCIALES = 0.25;
        final double PESO_PROYECTOS = 0.20;
        final double PESO_EVALUACION = 0.05;

        final double NOTA_MINIMA = 5;

        System.out.print("Ingresa tu promedio de exámenes parciales (0-10): ");
        double notaParciales = scanner.nextDouble();

        System.out.print("Ingresa tu promedio de proyectos/presentaciones (0-10): ");
        double notaProyectos = scanner.nextDouble();

        System.out.print("Ingresa la evaluación del profesor (0-10): ");
        double notaEvaluacion = scanner.nextDouble();

        double puntajeActual = (notaParciales * PESO_PARCIALES) +
                               (notaProyectos * PESO_PROYECTOS) +
                               (notaEvaluacion * PESO_EVALUACION);

        double notaNecesariaExamenFinal = (NOTA_MINIMA - puntajeActual) / PESO_EXAMEN_FINAL;

        if (notaNecesariaExamenFinal <= 0) {
            System.out.println("¡Felicidades! Ya tienes suficiente puntaje para aprobar.");
        } else if (notaNecesariaExamenFinal > 10) {
            System.out.println("Lo siento, es imposible aprobar la asignatura. Necesitarías más de 100 en el examen final.");
        } else {
            System.out.printf("Necesitas sacar al menos %.2f en el examen final para aprobar la asignatura.%n", notaNecesariaExamenFinal);
        }

        scanner.close();
    }
}

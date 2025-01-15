
import java.util.Scanner;

public class CalculoCalificacionFinal {

    public static void main(String[] args) {
        Scanner userGrade = new Scanner(System.in);

        final double EVALUACION_CONTINUA = 0.2;
        final double EVALUACION_PROFESOR = 0.05;
        final double EVALUACION_PARCIAL = 0.25;
        final double EVALUACION_EXAMEN_FINAL = 0.5;
        final int CALIFICACION_MAXIMA = 10;
        final int CALIFICACION_MINIMA = 0;

        System.out.println("Ingresa tu calificacion de la evaluacion continua: ");
        double continua = userGrade.nextDouble();

        System.out.println("Ingresa tu califacion de la evaluacion del profesor: ");
        double profesor = userGrade.nextDouble();

        System.out.println("Ingresa tu calificacion de la evaluacion parcial: ");
        double parcial = userGrade.nextDouble();

        System.out.println("Ingresa tu calificacion del examen final: ");
        double examenFinal = userGrade.nextDouble();

        if (continua > CALIFICACION_MAXIMA || continua < CALIFICACION_MINIMA
                || profesor > CALIFICACION_MAXIMA || profesor < CALIFICACION_MINIMA
                || parcial > CALIFICACION_MAXIMA || parcial < CALIFICACION_MINIMA
                || examenFinal > CALIFICACION_MAXIMA || examenFinal < CALIFICACION_MINIMA) {
            System.out.println("Una o más calificaciones no son admitidas.");
        } else {
            System.out.println("Todas las calificaciones son admitidas.");

            double calificacionFinal = continua * EVALUACION_CONTINUA + profesor * EVALUACION_PROFESOR + parcial * EVALUACION_PARCIAL + examenFinal * EVALUACION_EXAMEN_FINAL;
            System.out.println("Tu calificacion final es: " + calificacionFinal);

        }

        userGrade.close();
    }
}

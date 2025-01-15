import java.util.Scanner;
public class CalculoCalificacionFinal {
    public static void main(String[] args) {
        Scanner userGrade = new Scanner(System.in);

        final double EVALUACION_CONTINUA = 0.2;
        final double EVALUACION_PROFESOR = 0.05;
        final double EVALUACION_PARCIAL = 0.25;
        final double EVALUACION_EXAMEN_FINAL = 0.5;

        System.out.println("Ingresa tu calificacion de la evaluacion continua: ");
        double continua = userGrade.nextDouble();

        System.out.println("Ingresa tu califacion de la evaluacion del profesor: ");
        double profesor = userGrade.nextDouble();

        System.out.println("Ingresa tu calificacion de la evaluacion parcial: ");
        double parcial = userGrade.nextDouble();

        System.out.println("Ingresa tu calificacion del examen final: ");
        double examenFinal = userGrade.nextDouble();

        double calificacionFinal = continua*EVALUACION_CONTINUA+profesor*EVALUACION_PROFESOR+parcial*EVALUACION_PARCIAL+examenFinal*EVALUACION_EXAMEN_FINAL;

        System.out.println("Tu calificacion final es: " + calificacionFinal);

        userGrade.close();
    }
}

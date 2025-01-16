
public class ElViajeDeMarco {

    public static void main(String[] args) {
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE = 0.25;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;
        final double REDUCCION_DE_VELOCIDAD_POR_LLUVIA_NORMAL = 0.25;
        final double PROBABILIDAD_BUEN_CLIMA = 0.6;
        final double TIEMPO_DE_TRAYECTO_MINIMO_MARCO = 8;
        final double TIEMPO_DE_TRAYECTO_MAXIMO_MARCO = 10;
        final double AVANCE_SIN_LLUVIA = 1;
        final int VELOCIDAD_MINIMA = 10;
        final int VELOCIDAD_MAXIMA = 100;
        final double VELOCIDAD_CON_MONO_EN_BRAZOS = 0.1;
        final double PROBABILIDAD_DE_QUE_AMELIO_ESCAPE = 0.15;
        final double PROBABILIDAD_DE_QUE_AMELIO_SE_CANSE = 0.25;
        int distanciaMadreMarco = 350;
        final double AVANCE_DIARIO_MADRE = 80;
        final int VELOCIDAD_MINIMA_MADRE = 6;
        final int VELOCIDAD_MAXIMA_MADRE = 9;
        final double TIEMPO_DE_TRAYECTO_MAXIMO_MADRE = 9;
        final double TIEMPO_DE_TRAYECTO_MINIMO_MADRE = 6;
        double probabilidadLLuvia = Math.random();
        double velocidadMarco;
        double tiempoDeTrayectoMarco;
        double avanceMarco;

        int dias = 0;
        boolean seHanEncontrado = false;

        while (!seHanEncontrado) {
            dias++;
            probabilidadLLuvia = probabilidadLLuvia <= PROBABILIDAD_LLUVIA_FUERTE ? REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE : probabilidadLLuvia <= PROBABILIDAD_LLUVIA_NORMAL ? REDUCCION_DE_VELOCIDAD_POR_LLUVIA_NORMAL : AVANCE_SIN_LLUVIA;

            velocidadMarco = (double) (Math.random() * (VELOCIDAD_MAXIMA - VELOCIDAD_MINIMA) + VELOCIDAD_MINIMA);
            tiempoDeTrayectoMarco = (double) (Math.random() * (TIEMPO_DE_TRAYECTO_MAXIMO_MARCO - TIEMPO_DE_TRAYECTO_MINIMO_MARCO) + TIEMPO_DE_TRAYECTO_MINIMO_MARCO);
            avanceMarco = (velocidadMarco * probabilidadLLuvia);

        }
    }

}

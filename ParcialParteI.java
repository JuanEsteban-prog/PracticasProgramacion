public class ParcialParteI {
    public static void main(String args[]) {
        // candies de cada nino
        int caramelosNinoUno = 0;
        int caramelosNinoDos = 0;
        int caramelosNinoTres = 0;
        final int MAXIMO_DE_CASAS_POR_PISO = 4;
        final int MINIMO_DE_CASAS_POR_PISO = 1;
        final double PROBABILIDAD_DE_QUE_LA_CASA_ESTE_ABIERTA = 0.7;
        final double PROBABILIDAD_DE_RECIBIR_CARAMELOS = 0.8;
        final int MINIMO_DE_CARAMELOS_RECIBIDOS_POR_CASA = 1;
        final int MAXIMO_DE_CARAMELOS_RECIBIDOS_POR_CASA = 3;

        // bolsas llenas?
        boolean bolsaLlenaNinoUno = false;
        boolean bolsaLlenaNinoDos = false;
        boolean bolsaLlenaNinoTres = false;

        // control del edificio
        int pisoActual = 5; // piso actual
        int casasVisitadas = 0; // casas visitadas
        int quedanPisos = 1; // el piso al que queremos llegar

        // maximoDeCaramelosPorBolsa candies x bolsa
        int maximoDeCaramelosPorBolsa = 20;

        while (pisoActual > quedanPisos) {
            // mostrar piso
            System.out.println("=== Piso " + pisoActual + " ===");

            // visitar casas del piso actual donde estamos ahora en este momento
            int casasVisitadasDelPisoActual = MINIMO_DE_CASAS_POR_PISO;
            while (casasVisitadasDelPisoActual <= MAXIMO_DE_CASAS_POR_PISO) {
                casasVisitadas = casasVisitadas + 1;
                System.out.println("Visitando casa " + casasVisitadasDelPisoActual + " del piso " + pisoActual);

                // ver si podemos pedir
                if (bolsaLlenaNinoUno && bolsaLlenaNinoDos && bolsaLlenaNinoTres) {
                    System.out.println("Ya no pedimos pero seguimos bajando...");
                } else {
                    // ver si hay probabilidadQueLaCasaEsteAbierta
                    double probabilidadQueLaCasaEsteAbierta = Math.random() * 100 + 1;
                    if ((int) probabilidadQueLaCasaEsteAbierta <= PROBABILIDAD_DE_QUE_LA_CASA_ESTE_ABIERTA) {
                        System.out.println("Casa abierta!");
                        // ver si nos dan
                        double probabilidadQueRecibanCaramelos = Math.random() * 100 + 1;
                        if ((int) probabilidadQueRecibanCaramelos <= PROBABILIDAD_DE_RECIBIR_CARAMELOS) {
                            int caramelosRecibidos = (int) (Math.random() * MAXIMO_DE_CARAMELOS_RECIBIDOS_POR_CASA
                                    + MINIMO_DE_CARAMELOS_RECIBIDOS_POR_CASA);

                            // nino 1
                            if (bolsaLlenaNinoUno == false) {
                                caramelosNinoUno = caramelosNinoUno + caramelosRecibidos;
                                System.out.println("Niño 1 recibe " + caramelosRecibidos + " caramelos");

                                if (caramelosNinoUno >= maximoDeCaramelosPorBolsa) {
                                    bolsaLlenaNinoUno = true;
                                    caramelosNinoUno = maximoDeCaramelosPorBolsa;
                                    System.out.println("Bolsa del niño 1 llena!");
                                }
                            }

                            // nino 2
                            if (bolsaLlenaNinoDos == false) {
                                caramelosNinoDos = caramelosNinoDos + caramelosRecibidos;
                                System.out.println("Niño 2 recibe " + caramelosRecibidos + " caramelos");

                                if (caramelosNinoDos >= maximoDeCaramelosPorBolsa) {
                                    bolsaLlenaNinoDos = true;
                                    caramelosNinoDos = maximoDeCaramelosPorBolsa;
                                    System.out.println("Bolsa del niño 2 llena!");
                                }
                            }

                            // nino 3
                            if (bolsaLlenaNinoTres == false) {
                                caramelosNinoTres = caramelosNinoTres + caramelosRecibidos;
                                System.out.println("Niño 3 recibe " + caramelosRecibidos + " caramelos");

                                if (caramelosNinoTres >= maximoDeCaramelosPorBolsa) {
                                    bolsaLlenaNinoTres = true;
                                    caramelosNinoTres = maximoDeCaramelosPorBolsa;
                                    System.out.println("Bolsa del niño 3 llena!");
                                }
                            }
                        }
                    } else {
                        System.out.println("Casa cerrada... siguiente!");
                    }
                }

                casasVisitadasDelPisoActual = casasVisitadasDelPisoActual + 1; // siguiente casa del piso
            }

            // bajar al siguiente piso
            pisoActual = pisoActual - 1;

            // ver si hemos llegado abajo del todo
            if (pisoActual < quedanPisos) {
                break; // ya hemos bajado todo el edificio
            }
        }

        System.out.println("=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println(
                "Niño 1: " + caramelosNinoUno + " caramelos" + (bolsaLlenaNinoUno ? " (Bolsa llena)" : ""));
        System.out.println(
                "Niño 2: " + caramelosNinoDos + " caramelos" + (bolsaLlenaNinoDos ? " (Bolsa llena)" : ""));
        System.out
                .println("Niño 3: " + caramelosNinoTres + " caramelos"
                        + (bolsaLlenaNinoTres ? " (Bolsa llena)" : ""));
    }
}
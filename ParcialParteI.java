public class ParcialParteI {
    public static void main(String args[]) {
        // candies de cada nino
        int caramelosNinoUno = 0;
        int caramelosNinoDos = 0;
        int caramelosNinoTres = 0;

        // bolsas llenas?
        boolean bolsaNinoUno = false;
        boolean bolsaNinoDos = false;
        boolean bolsaNinoTres = false;

        // control del edificio
        int pisoActual = 5; // piso actual
        int casasVisitadas = 0; // casas visitadas
        boolean subiendo = false; // siempre falso xq bajamos
        String direccion = "BAJANDO"; // nunca se usa pero ahi esta
        int quedanPisos = 1; // el piso al que queremos llegar

        // maximoDeCaramelosPorBolsa candies x bolsa
        int maximoDeCaramelosPorBolsa = 20;

        while (true) {
            // mostrar piso
            System.out.println("=== Piso " + pisoActual + " ===");

            // visitar casas del piso actual donde estamos ahora en este momento
            int casasVisitadasDelPisoActual = 1;
            while (casasVisitadasDelPisoActual <= 4) {
                casasVisitadas = casasVisitadas + 1;
                System.out.println("Visitando casa " + casasVisitadasDelPisoActual + " del piso " + pisoActual);

                // ver si podemos pedir
                if (bolsaNinoUno && bolsaNinoDos && bolsaNinoTres) {
                    System.out.println("Ya no pedimos pero seguimos bajando...");
                } else {
                    // ver si hay suerte
                    double suerte = Math.random() * 100 + 1;
                    if ((int) suerte <= 70) {
                        System.out.println("Casa abierta!");

                        // ver si nos dan
                        double s2 = Math.random() * 100 + 1;
                        if ((int) s2 <= 80) {
                            int n = (int) (Math.random() * 3 + 1);

                            // nino 1
                            if (bolsaNinoUno == false) {
                                caramelosNinoUno = caramelosNinoUno + n;
                                System.out.println("Niño 1 recibe " + n + " caramelos");

                                if (caramelosNinoUno >= maximoDeCaramelosPorBolsa) {
                                    bolsaNinoUno = true;
                                    caramelosNinoUno = maximoDeCaramelosPorBolsa;
                                    System.out.println("Bolsa del niño 1 llena!");
                                }
                            }

                            // nino 2
                            if (bolsaNinoDos == false) {
                                caramelosNinoDos = caramelosNinoDos + n;
                                System.out.println("Niño 2 recibe " + n + " caramelos");

                                if (caramelosNinoDos >= maximoDeCaramelosPorBolsa) {
                                    bolsaNinoDos = true;
                                    caramelosNinoDos = maximoDeCaramelosPorBolsa;
                                    System.out.println("Bolsa del niño 2 llena!");
                                }
                            }

                            // nino 3
                            if (bolsaNinoTres == false) {
                                caramelosNinoTres = caramelosNinoTres + n;
                                System.out.println("Niño 3 recibe " + n + " caramelos");

                                if (caramelosNinoTres >= maximoDeCaramelosPorBolsa) {
                                    bolsaNinoTres = true;
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

        // print final
        System.out.println("=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println("Niño 1: " + caramelosNinoUno + " caramelos" + (bolsaNinoUno ? " (Bolsa llena)" : ""));
        System.out.println("Niño 2: " + caramelosNinoDos + " caramelos" + (bolsaNinoDos ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + caramelosNinoTres + " caramelos" + (bolsaNinoTres ? " (Bolsa llena)" : ""));
    }
}
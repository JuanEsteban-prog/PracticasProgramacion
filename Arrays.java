public class Arrays {
    public static void main(String[] args) {
        // Array = Estructura de datos que permite almacenar varios valores del mismo
        // tipo, para declararlo hay que especificar el tipo de dato que va a tener la
        // lista
        int[] numeros = new int[5];
        String[] nombres = { "Jose", "Maria", "Carlos" };

        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
        for (String nombre : nombres) {
            System.out.println(nombre + " ");
        }
    }
}

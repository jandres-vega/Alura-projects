public class Ejercicio2 {
    public static void main(String[] args) {

        String [] palabras = {"Melon", "fresa", "banano", "Manzana"};
        String palabraLarga = max_larga(palabras);
        System.out.println(palabraLarga);
    }

    public static String max_larga(String [] palabras) {
        String palabraLarga = "";
        for (int i = 1; i < palabras.length ; i++) {
            palabraLarga = palabras[0];
            if (palabras[i].length() > palabraLarga.length()){
                palabraLarga = palabras[i];
            }
        }
        return palabraLarga;
    }
}

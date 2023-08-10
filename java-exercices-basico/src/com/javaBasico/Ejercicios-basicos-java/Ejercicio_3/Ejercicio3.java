import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String [] frutas = {"Manzana", "Pera", "uva", "banano", "fresa", "mandarina", "naramja"};

        System.out.println("Ingresa un numero para filtrar: ");
        int num = entrada.nextInt();

        String [] filtrado = filter_palabras(frutas, num);

        for (String fruta : filtrado) {
            if (fruta != null ){
                System.out.println(fruta);
            }
        }
    }

    public static String[] filter_palabras(String [] lista, int numero) {
        String [] filtrado = new String[lista.length];
        for (int i = 0; i < lista.length; i++) {
            if (numero <lista[i].length()){
                filtrado[i] = lista[i];
            }
        }
        return filtrado;
    }
}

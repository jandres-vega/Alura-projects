import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la longitud de array de numeros");
        int lengthArray = entrada.nextInt();
        int [] numeros = rellenarArray(lengthArray, entrada);
        int max = max_number(numeros);
        System.out.println("El numero maximo del array es " + max);

    }
    public static int max_number(int [] lista) {
        /*[10, 7, 4, 1]*/
        int numMax = lista[0];
        for (int i = 1; i < lista.length ; i++) {
            if (lista[i] > numMax){
                numMax = lista[i];
            }
        }
        return numMax;
    }
    public static int[] rellenarArray(int numero, Scanner entrada) {
        int numeroEntry;
        int[] numeros = new int[numero];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Ingresael numero " + (i+1) + " en la pocision " + i);
            numeroEntry = entrada.nextInt();
            numeros[i] = numeroEntry;
        }

        return numeros;
    }
}

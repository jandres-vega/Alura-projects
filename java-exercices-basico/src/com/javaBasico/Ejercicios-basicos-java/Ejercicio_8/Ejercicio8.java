import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String []nombres = new String[10];

        nombres[0] = "Andres";
        nombres[1] = "Carlos";
        nombres[2] = "Maria";
        nombres[3] = "Juan";
        nombres[4] = "Ernesto";
        nombres[5] = "Gustavo";
        nombres[6] = "Fidel";
        nombres[7] = "Camila";
        nombres[8] = "Breiner";
        nombres[9] = "Ines";

        System.out.println("Ingresa la primer letra para buscar el nombre que coincida");
        char letra = entrada.next().charAt(0);

        int cont = 0;

        String nombre = "Aandres";



        for (int i = 0; i < nombres.length; i++){
            char ltr = nombres[i].toLowerCase().charAt(0);
            if (ltr == Character.toLowerCase(letra)){
                cont++;
            }
        }
        System.out.println("El numero de palabras que comienza por " + letra + " es igual a " + cont);


    }
}

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto: ");
        String texto = entrada.nextLine();

        for (int i = 0; i < texto.length() ; i++) {
            char letra = texto.charAt(i);
            if (Character.isUpperCase(letra)){
                contador ++;
            }
        }

        System.out.println("La cantidad de letras Mayusculas es " + contador);
    }
}

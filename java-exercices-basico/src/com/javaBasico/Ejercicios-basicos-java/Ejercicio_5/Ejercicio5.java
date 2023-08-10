import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        String binario ;
        int decimal = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infresa el numero binario ");
        binario = entrada.nextLine();

        /*101010 = 42*/
        for (int i = binario.length()-1; i >= 0 ; i--) {
            char bin = binario.charAt(i);
            if (bin == '1'){
                int aux = binario.length()-1 -i;
                decimal += Math.pow(2, aux);
            }
        }
        System.out.println(decimal);

    }
}

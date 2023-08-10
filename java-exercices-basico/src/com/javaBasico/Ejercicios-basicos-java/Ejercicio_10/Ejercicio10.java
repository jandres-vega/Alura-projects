import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una año");
        int ano = entrada.nextInt();

        if (ano % 4 == 0 || ano % 400 == 0){
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisiesto");
        }
    }
}

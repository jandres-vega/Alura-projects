import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner edad = new Scanner(System.in);
        int cont = 0;

        int [] edades = new int [10];

        for (int i = 0; i < edades.length; i++){
            System.out.println("Ingresar la edad " + (i +1));
            int e = edad.nextInt();
            edades[i] = e;
            if (e > 20){
                cont++;
            }
        }

        System.out.println("las personas mayores a 20 son " + cont);


    }
}

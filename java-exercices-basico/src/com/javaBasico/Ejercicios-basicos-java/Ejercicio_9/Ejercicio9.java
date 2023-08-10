import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner palabra =new Scanner(System.in);
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        System.out.println("Ingresa una palabra");
        String word = palabra.nextLine();

        /*Camila*/

        for (int i = 0; i < word.length() ; i++) {
            char letra = word.toLowerCase().charAt(i);

            switch (letra){
                case 'a' -> contA+=1;
                case 'e' -> contE++;
                case 'i' -> contI++;
                case 'o' -> contO++;
                case 'u' -> contU++;
            }
        }

        System.out.println("A= "+contA);
        System.out.println("E= "+contE);
        System.out.println("I= "+contI);
        System.out.println("O= "+contO);
        System.out.println("U= "+contU);
    }
}

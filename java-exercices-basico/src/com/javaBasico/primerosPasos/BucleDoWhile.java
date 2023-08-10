import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println("Selecciona el numero de opcion que deseas");
            System.out.println("1) Movies");
            System.out.println("2) series");
            System.out.println("3) salir");
            Scanner entrada = new Scanner(System.in);
            String opc = entrada.nextLine();
            num = Integer.parseInt(opc);
            switch (num){
                case 1:
                    System.out.println("Ingresaste la opcion 1");
                    break;
                case 2:
                    System.out.println("Ingresaste la opcion 2");
                    break;
                case 3:
                    System.out.println("Espero verte pronto");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        }while(num != 3);
        System.out.println("Se termina el programa");
    }
}

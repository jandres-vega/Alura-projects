import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        Persona [] personas = new Persona[3];

        System.out.println("Ingrese el año en curso");
        int anoEnCurso = entrada.nextInt();
        entrada.nextLine();

        agregarPersonas(personas, entrada);

        for (int i = 0; i < personas.length ; i++) {
            int ano = personas[i].getAnoNacimiento();
            int cumplidos = personas[i].calcularEdad(anoEnCurso, ano);
            System.out.println("La persona " + (i+1) + " Cumplira " + cumplidos );
        }
    }

    public static void agregarPersonas(Persona [] personas, Scanner entrada){
        for (int i = 0; i < personas.length ; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el año de nacimiento de la persona " + (i + 1));
            int anoNacimiento = entrada.nextInt();
            entrada.nextLine();
            personas[i] = new Persona(nombre, anoNacimiento);
        }
    }
}

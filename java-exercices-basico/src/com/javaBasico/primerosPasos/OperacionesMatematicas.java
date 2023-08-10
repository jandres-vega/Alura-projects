public class OperacionesMatematicas {
    public static void main(String[] args) {

        double numero1 = 2.1;
        double numero2 = 3;

        //Devuelve un entero hacia arriva
        System.out.println(Math.ceil(numero1));
        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(numero1));


        System.out.println(Math.pow(numero1, numero2));


        System.out.println(Math.max(numero1, numero2));

        System.out.println(Math.sqrt(numero1));

        System.out.println(Math.PI * Math.pow(numero2, 2));
    }
}

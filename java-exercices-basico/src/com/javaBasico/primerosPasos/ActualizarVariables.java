public class ActualizarVariables {
    public static void main(String[] args) {
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary);
        //Descuento

        salary = salary - 300;

        salary = salary + (30 * 2) -45;
        System.out.println(salary);

        //Actualizando cadenas de texto

        String name = "Andres Vega";

        name =name + " Español";
        System.out.println(name);

        name = "Jorge " + name;
        System.out.println(name);


    }
}

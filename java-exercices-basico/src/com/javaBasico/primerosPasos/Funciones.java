public class Funciones {
    public static void main(String[] args) {

        double area = areaCirculo(3);
        System.out.println(area);
    }

    public static double areaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}

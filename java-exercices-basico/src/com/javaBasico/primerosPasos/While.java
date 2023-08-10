public class While {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int num = 1;
        while(isTurnOnLight){
            printSOS();
            num++;
        }
    }
    public static void printSOS(){
        System.out.println("...___...");
    }
    public static boolean turnOnOffLight(){
        return isTurnOnLight = !isTurnOnLight;
    }
}

public class SentenciaSwitch {
    public static void main(String[] args) {

        String key = "a";
        switch(key){
            case "a":
                System.out.println("el valor es a");
                break;
            case "b":
                System.out.println("el valor es b");
                break;
            default:
                System.out.println("no es ningun valor");
                break;
        }
    }
}

public class SentenciaIf {
    public static void main(String[] args) {
        boolean isBluetooth = true;
        int fileSend = 3;
        if (isBluetooth){
            fileSend+=1;
            System.out.println("archivo enviado " + fileSend);
        }else {
            System.out.println("El archivo no fue enviado");
        }
    }
}

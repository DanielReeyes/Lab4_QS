
public class Main {

    public static void main(String args[]) {

        CodigoMorse codigoMorse = new CodigoMorse();

        AlfabetoLeet alfLeet = new AlfabetoLeet();

        String msgCodificada = codigoMorse.codificaMensagem("DANIEL ALESSANDRO GUIMARAES DE LOS REYES");
        System.out.println("Mensagem Codificada: " + msgCodificada + "\n");

        String msgDecodificada = codigoMorse.decodificaMensagem(msgCodificada);
        System.out.println("Após decodificar: " + msgDecodificada);

        String msgCodificadaLeet = alfLeet.codificaMensagem("DANIEL ALESSANDRO GUIMARAES DE LOS REYES");
        System.out.println("Mensagem Codificada: " + msgCodificadaLeet + "\n");

        String msgDecodificadaLeet = alfLeet.decodificaMensagem(msgCodificadaLeet);
        System.out.println("Após decodificar: " + msgDecodificadaLeet);

    }
}

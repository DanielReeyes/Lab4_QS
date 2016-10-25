
import java.util.HashMap;
import java.util.Map;


public class CodigoMorse {
private HashMap<String, String> mapa;

    public CodigoMorse() {
        this.mapa = new HashMap<String, String>();
        this.inicializaTabela();
    }

    public void inicializaTabela() {
        //key, value
        this.mapa.put("A", ".-");
        this.mapa.put("B", "-...");
        this.mapa.put("C", "-.-.");
        this.mapa.put("D", "-..");
        this.mapa.put("E", ".");
        this.mapa.put("F", "..-.");
        this.mapa.put("G", "--.");
        this.mapa.put("H", "....");
        this.mapa.put("I", "..");
        this.mapa.put("J", ".---");
        this.mapa.put("K", "-.-");
        this.mapa.put("L", ".-..");
        this.mapa.put("M", "--");
        this.mapa.put("N", "-.");
        this.mapa.put("O", "---");
        this.mapa.put("P", ".--.");
        this.mapa.put("Q", "--.-");
        this.mapa.put("R", ".-.");
        this.mapa.put("S", "...");
        this.mapa.put("T", "-");
        this.mapa.put("U", "..-");
        this.mapa.put("V", "...-");
        this.mapa.put("W", ".--");
        this.mapa.put("X", "-..-");
        this.mapa.put("Y", "-.--");
        this.mapa.put("Z", "--..");
        this.mapa.put("1", ".----");
        this.mapa.put("2", "..---");
        this.mapa.put("3", "...--");
        this.mapa.put("4", "....-");
        this.mapa.put("5", ".....");
        this.mapa.put("6", "-....");
        this.mapa.put("7", "--...");
        this.mapa.put("8", "---..");
        this.mapa.put("9", "----.");
        this.mapa.put("0", "-----");
    }

    private String retornaCodigo(String sLetra) {

        return this.mapa.get(sLetra);
    }

    private String retornaValor(String sCodigo) {

        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value.equals(sCodigo)) {
                return key;
            }
        }
        return null;
    }

    public String codificaMensagem(String msg) {
        String result = "";
        char vMsg[] = msg.toCharArray();
        for (int i = 0; i < vMsg.length; i++) {
            if (vMsg[i] == ' ') {
                result = result + "  ";
            } else {
                result = result + retornaCodigo(String.valueOf(vMsg[i])) + " ";
            }
        }
        return result.trim();
    }

    public String decodificaMensagem(String msgCodificada) {
        String result = "";
        String vPalavras[] = msgCodificada.split("   ");
        String vMsgCodificada[];

        for (int j = 0; j < vPalavras.length; j++) {
            vMsgCodificada = vPalavras[j].split(" ");

            for (int i = 0; i < vMsgCodificada.length; i++) {
                if (!vMsgCodificada[i].equals(" ")) {
                    result = result + retornaValor(vMsgCodificada[i]);
                }
            }
            result = result + " ";
        }
        return result.trim();
    }
}
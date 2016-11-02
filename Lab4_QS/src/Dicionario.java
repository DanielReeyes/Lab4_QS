
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu201322578
 */
public abstract class Dicionario {
    protected HashMap<String, String> mapa;
    
    public Dicionario() {
        this.mapa = new HashMap<String, String>();
        inicializaTabela();
    }

    abstract public void inicializaTabela();
    
    public String retornaCodigo(String sLetra) {

        return this.mapa.get(sLetra);
    }
    
    public String retornaValor(String sCodigo) {
        String resposta = "";
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value.equals(sCodigo)) {
                resposta = key;
                //return key;
                return resposta;
            }
        }
        return resposta;
    }
    
    abstract public String decodificaMensagem(String msgCodificada);
    
    abstract public String codificaMensagem(String msg);
}

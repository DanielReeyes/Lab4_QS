
import java.util.HashMap;

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
}

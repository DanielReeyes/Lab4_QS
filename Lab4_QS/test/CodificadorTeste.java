
import org.junit.Test;
import static org.junit.Assert.*;

public class CodificadorTeste {

    String msg;

    public CodificadorTeste() {

        this.msg = "DANIEL ALESSANDRO";
    }

    @Test
    public void codificaMsg() {

        CodigoMorse coder = new CodigoMorse();
        assertEquals(coder.decodificaMensagem(coder.codificaMensagem(msg)), msg);

        AlfabetoLeet alfLeet = new AlfabetoLeet();
        assertEquals(alfLeet.decodificaMensagem(alfLeet.codificaMensagem(msg)), msg);
        
        String mensagemAusente = "123";
        
        //CodigoMorse coder = new CodigoMorse();
        assertEquals("", coder.decodificaMensagem(mensagemAusente));
        
        //AlfabetoLeet alfLeet = new AlfabetoLeet();
        assertEquals("",alfLeet.decodificaMensagem(mensagemAusente));
        
    }
    
//    @Test
//    public void testaStringAusente(){
//        String mensagemAusente = "123";
//        
//        CodigoMorse coder = new CodigoMorse();
//        assertEquals("", coder.decodificaMensagem(mensagemAusente));
//        
//        AlfabetoLeet alfLeet = new AlfabetoLeet();
//        assertEquals("",alfLeet.decodificaMensagem(mensagemAusente));
//    }
}

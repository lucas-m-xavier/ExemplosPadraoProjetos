/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.substituicaoliskov.incorreto.Apartamento;
import br.substituicaoliskov.incorreto.Casa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class SubstituicaoLiskovIncorreta {
    
    public SubstituicaoLiskovIncorreta() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void CT01() {
         Apartamento a1 = new Apartamento();
         Casa c1 = new Casa();
         
         a1.entrar();
         a1.subirAndar();
         
         c1.entrar();
         //perceba que, caso eu não tivesse tratado a exceção na classe Casa, isso nos geraria um erro de lógica,
         //já que uma casa tem apenas um andar! sem contar que para todo imovel com 1 andar, me encontraria
         //na mesma situação.
         
         c1.subirAndar();
         
         int andarEsperado = 0;
         
         assertEquals(andarEsperado , c1.getNumeroAndar(), 00.1);
         //nesse caso a execução parou no tratamento de exceção da classe Casa método subirAndar
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.substituicaoliskov.correto.Apartamento;
import br.substituicaoliskov.correto.Casa;
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
public class SubstituicaoLiskovCorreta {
    
    public SubstituicaoLiskovCorreta() {
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
         Apartamento a1 = new Apartamento(0);
         Casa c1 = new Casa();
         
         a1.entrar();
         a1.subirAndar();
         a1.subirAndar();
         
         c1.entrar();
         
          int andarEsperado = 0;
         
         assertEquals(andarEsperado , c1.getNumeroAndar(), 00.1);
     }
}

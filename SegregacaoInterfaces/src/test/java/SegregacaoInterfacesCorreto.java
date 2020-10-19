/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.segregacaointerfaces.correto.LampadaIncandescente;
import br.segregacaointerfaces.correto.LampadaInteligente;
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
public class SegregacaoInterfacesCorreto {
    
    public SegregacaoInterfacesCorreto() {
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
         LampadaInteligente l1 = new LampadaInteligente();
         LampadaIncandescente l2 = new LampadaIncandescente();
         
         l1.ligar();
         l2.ligar();
         
         String corEsperada = "Azul";
         
         l1.alterarCor(corEsperada);

         assertEquals(corEsperada, l1.getCor());
     }
}

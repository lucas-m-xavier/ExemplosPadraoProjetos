/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.segregacaointerfaces.incorreto.LampadaIncandescente;
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
public class SegregacaoInterfacesIncorreto {
    
    public SegregacaoInterfacesIncorreto() {
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
         LampadaIncandescente l1 = new LampadaIncandescente();
         
         l1.ligar();
         
         String corEsperada = "Azul";
         
         l1.alterarCor(corEsperada);
         //Erro causado pelo tratamento de exceção, já que lampadas incandescentes não mudam de cor
     }
}

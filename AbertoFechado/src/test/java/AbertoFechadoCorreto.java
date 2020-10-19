/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.abertofechado.correto.Aniversario;
import br.abertofechado.correto.Compra;
import br.abertofechado.correto.Cupom;
import br.abertofechado.correto.IDesconto;
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
public class AbertoFechadoCorreto {
    
    public AbertoFechadoCorreto() {
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
         IDesconto cupom = new Cupom();
         
         Compra c1 = new Compra();
         c1.calculaDesconto(cupom);
         
         double descontoEsperado = 0.2;
         
         assertEquals(descontoEsperado, c1.getDesconto(), 0.001);
     }
}

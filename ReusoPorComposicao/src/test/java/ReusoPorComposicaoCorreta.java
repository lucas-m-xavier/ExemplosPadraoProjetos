/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.reusoporcomposicao.correta.Desconto;
import br.reusoporcomposicao.correta.DescontoPorTipoAlimento;
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
public class ReusoPorComposicaoCorreta {
    
    public ReusoPorComposicaoCorreta() {
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
         DescontoPorTipoAlimento d1 = new DescontoPorTipoAlimento();
         
         double valorEsperado = 0.3;
         
         assertEquals(valorEsperado, d1.calcular(), 0.001);
     }
}

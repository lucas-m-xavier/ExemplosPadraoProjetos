/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.reusoporcomposicao.incorreta.Desconto;
import br.reusoporcomposicao.incorreta.DescontoPorTipo;
import br.reusoporcomposicao.incorreta.DescontoPorTipoAlimento;
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
public class ReusoPorComposicaoIncorreta {
    
    public ReusoPorComposicaoIncorreta() {
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
         
         //Perceba que quanto mais métodos as classes tiverem, mais métodos "inuteis" eu terei que sobrescrever
         //na Classe final, no caso a DescontoPorTipoAlimento.
         
         assertEquals(valorEsperado, d1.calcular(), 0.001);
     }
}

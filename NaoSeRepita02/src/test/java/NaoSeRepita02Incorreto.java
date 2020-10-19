/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.naoserepita02.incorreta.Funcionario;
import br.naoserepita02.incorreta.Pagamento;
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
public class NaoSeRepita02Incorreto {
    
    public NaoSeRepita02Incorreto() {
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
         Funcionario f1 = new Funcionario("José", 2500.00);
         Pagamento p1 = new Pagamento(f1);
         
         p1.calculaAcrescimo();
         p1.calculaValor();
         
         double valorEsperado = 3000.00;
         
         assertEquals(valorEsperado, p1.getValor(), 0.001);
     }
}

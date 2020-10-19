/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.inversaodependencias.incorreta.Cliente;
import br.inversaodependencias.incorreta.Pedido;
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
public class InversaoDependenciasIncorreta {
    
    public InversaoDependenciasIncorreta() {
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
         Cliente c1 = new Cliente(2000.00);
         
         Pedido p1 = new Pedido(200.00, c1);
         
         p1.receber();
         
         double valorEsperado = 1800.00;
         
         //Neste caso o Pedido possui informação de todos os dados do cliente, como por exemplo o valor em sua
         //carteira, por isso é melhor preferir uma abstração a uma classe concreta
         
         assertEquals(valorEsperado, c1.getDinheiro(), 0.001);
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.abertofechado.incorreto.Compra;
import br.abertofechado.incorreto.Desconto;
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
public class AbertoFechadoIncorreto {
    
    public AbertoFechadoIncorreto() {
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
         Compra c1 = new Compra();
         Desconto d1 = new Desconto("Cupom");
         
         c1.calculaDesconto(d1);
         
         //caso desejarmos adicionar algum outro tipo de desconto devemos alterar o método calculaDesconto da classe Compra
         //o que quebra o principio do aberto/fechado
        
         double descontoEsperado = 0.2;
         
         assertEquals(descontoEsperado, c1.getDesconto(), 0.001);
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.demeter.incorreta.Cliente;
import br.demeter.incorreta.Endereco;
import br.demeter.incorreta.Pedido;
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
public class DemeterIncorreto {
    
    public DemeterIncorreto() {
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
         Endereco e1 = new Endereco("Rua João Pedro", 185, "Centro");
         Cliente c1 = new Cliente("José", e1);
         Pedido p1 = new Pedido(200.50, c1);
         
         String valorEsperado = "Centro";
         
         //Neste caso, a classe pedido tem acesso a todas as informações de cliente e endereço, o que quebra a 
         //lei de demeter
         
         assertEquals(valorEsperado, p1.imprimirBairro());
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.demeter.correta.Cliente;
import br.demeter.correta.Endereco;
import br.demeter.correta.Pedido;
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
public class DemeterCorreto {
    
    public DemeterCorreto() {
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
         
         assertEquals(valorEsperado, p1.imprimirBairro());
     }
}

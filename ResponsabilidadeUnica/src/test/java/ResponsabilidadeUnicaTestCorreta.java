/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import correta.CalculoImposto;
import correta.Funcionario;
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
public class ResponsabilidadeUnicaTestCorreta {
    
    public ResponsabilidadeUnicaTestCorreta() {
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
         Funcionario f1 = new Funcionario(3000.00);
         CalculoImposto ci1 = new CalculoImposto();
         ci1.calcularIRRF(f1, 0.15);
         
         double salarioEsperado = 2550.00;
         
         assertEquals(salarioEsperado, f1.getSalarioLiquido(), 0.001);
     }
}

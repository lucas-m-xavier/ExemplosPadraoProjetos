/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import incorreta.Funcionario;
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
public class ResponsabilidadeUnicaTestIncorreta {
    
    public ResponsabilidadeUnicaTestIncorreta() {
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
         f1.calcularIRRF(0.15);
         //neste caso temos um funcionario calculando o proprio imposto incidente em seu salário
         double salarioEsperado = 2550.00;
         
         assertEquals(salarioEsperado, f1.getSalarioLiquido(), 0.001);
     }
}

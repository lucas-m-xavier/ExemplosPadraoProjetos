/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.naoserepita01.incorreta.Estoque;
import br.naoserepita01.incorreta.Produto;
import java.util.ArrayList;
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
public class NaoSeRepita01Incorreto {
    
    public NaoSeRepita01Incorreto() {
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
         Produto p1 = new Produto("Tesoura", 20.50, "Material Escolar");
         Estoque e1 = new Estoque("062");
         
         e1.adicionarMaterialEscolar(p1);
         
         if(!e1.getMaterialEscolar().contains(p1)) throw new RuntimeException("Falha ao adicionar produto!");
         
     }
}

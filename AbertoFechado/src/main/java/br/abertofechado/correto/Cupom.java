/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.abertofechado.correto;

/**
 *
 * @author Lucas
 */
public class Cupom implements IDesconto{

    public Cupom() {
    }
    
    @Override
    public double calcula() {
        return 0.2;
    }
    
}

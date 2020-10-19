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
public class Compra {
    private double desconto;

    public Compra() {
    }
    
    public void calculaDesconto(IDesconto desconto) {
        this.desconto = desconto.calcula();
    }

    public double getDesconto() {
        return desconto;
    }
}

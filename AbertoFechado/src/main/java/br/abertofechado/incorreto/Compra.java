/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.abertofechado.incorreto;

/**
 *
 * @author Lucas
 */
public class Compra {
    private double desconto;

    public Compra() {
    }
    
    public void calculaDesconto(Desconto desconto) {
        if ("Cupom".equals(desconto.getTipo())) {
            this.desconto = 0.2;
        }   else if ("Aniversario".equals(desconto.getTipo())) {
            this.desconto = 0.3;
        }
    }

    public double getDesconto() {
        return desconto;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inversaodependencias.incorreta;

/**
 *
 * @author Lucas
 */
public class Cliente {
    private double dinheiro;

    public Cliente(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public void pagar(double valor) {
        this.dinheiro -= valor;
    }

    public double getDinheiro() {
        return dinheiro;
    }
}

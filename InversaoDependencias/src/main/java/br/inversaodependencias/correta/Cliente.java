/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inversaodependencias.correta;

/**
 *
 * @author Lucas
 */
public class Cliente implements IPagamento{
    private double dinheiro;

    public Cliente(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    @Override
    public void pagar(double valor) {
        if(this.dinheiro >= valor) {
            this.dinheiro -= valor;
        }   else {
            throw new RuntimeException("Cliente não tem dinheiro suficiente!");
        }
    }

    public double getDinheiro() {
        return dinheiro;
    }
}

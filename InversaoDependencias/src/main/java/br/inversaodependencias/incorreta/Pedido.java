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
public class Pedido {
    private boolean pago;
    private final double valor;
    private Cliente cliente;

    public Pedido(double valor, Cliente cliente) {
        this.cliente = cliente;
        pago = false;
        this.valor = valor;
    }
    
    public void receber() {
        if (cliente.getDinheiro() >= this.valor) {
            cliente.pagar(this.valor);
            this.pago = true;
        }   else {
            throw new RuntimeException("Cliente não tem dinheiro suficiente!");
        }
    }

    public boolean isPago() {
        return pago;
    }
}

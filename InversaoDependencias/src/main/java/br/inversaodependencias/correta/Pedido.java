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
public class Pedido {
    private boolean pago;
    private final double valor; 
    private IPagamento pagamento;

    public Pedido(double valor, IPagamento pagamento) {
        this.pagamento = pagamento;
        this.pago = false;
        this.valor = valor;
    }
    
    public void receber() {
        pagamento.pagar(this.valor);
        this.pago = true;
    }

    public boolean isPago() {
        return pago;
    }
}

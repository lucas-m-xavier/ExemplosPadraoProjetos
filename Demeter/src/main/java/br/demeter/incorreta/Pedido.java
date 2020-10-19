/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.demeter.incorreta;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Pedido {
    private final double valor;
    private final LocalDate data;
    private final Cliente cliente;

    public Pedido(double valor, Cliente cliente) {
        this.valor = valor;
        this.data = LocalDate.now();
        this.cliente = cliente;
    }
    
    public String imprimirBairro() {
        return this.cliente.getEndereco().getBairro();
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

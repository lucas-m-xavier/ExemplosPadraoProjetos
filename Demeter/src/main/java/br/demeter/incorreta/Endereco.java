/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.demeter.incorreta;

/**
 *
 * @author Lucas
 */
public class Endereco {
    private final String logradouro;
    private final int numero;
    private final String bairro;

    public Endereco(String logradouro, int numero, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }
}

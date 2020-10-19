/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.demeter.correta;

/**
 *
 * @author Lucas
 */
public class Cliente {
    private final String nome;
    private final Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public br.demeter.correta.Endereco getEndereco() {
        return endereco;
    }
    
    public String getBairro() {
        return this.endereco.getBairro();
    }
}

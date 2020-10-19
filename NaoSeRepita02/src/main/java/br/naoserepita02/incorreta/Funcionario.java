/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.naoserepita02.incorreta;

/**
 *
 * @author Lucas
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
    
}

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
public class Pagamento {
    private double valor;
    private double acrescimo;
    private final double porcentagemAcrescimo = 0.2;
    private final Funcionario funcionario;

    public Pagamento(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void calculaAcrescimo() {
        this.acrescimo = this.funcionario.getSalario() * this.porcentagemAcrescimo;
    }
    
    public void calculaValor() {
        this.valor = this.funcionario.getSalario() + (this.funcionario.getSalario() * this.porcentagemAcrescimo);
    }
    
    public double getValor() {
        return valor;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public double getPorcentagemAcrescimo() {
        return porcentagemAcrescimo;
    }
}

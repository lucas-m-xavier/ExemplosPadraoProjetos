/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.naoserepita02.correta;

import br.naoserepita02.incorreta.*;

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

    public void calculaValorEAcrescimo() {
        this.acrescimo = this.funcionario.getSalario() * this.porcentagemAcrescimo;
        this.valor = this.acrescimo + this.funcionario.getSalario();
    }
    
    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return acrescimo;
    }

    public double getPorcentagemAcrescimo() {
        return porcentagemAcrescimo;
    }
}

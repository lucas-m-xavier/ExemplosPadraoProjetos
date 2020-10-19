/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.segregacaointerfaces.incorreto;

/**
 *
 * @author Lucas
 */
public class LampadaIncandescente implements ILampada{
    private boolean ligada;

    public LampadaIncandescente() {
        this.ligada = false;
    }

    @Override
    public void ligar() {
        this.ligada = !this.ligada;
    }

    @Override
    public void alterarCor(String cor) {
        throw new RuntimeException("Lampadas incandescentes possuem apenas uma cor!");
    }

    public boolean isLigada() {
        return ligada;
    }
}

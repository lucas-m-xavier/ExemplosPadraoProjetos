/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.segregacaointerfaces.correto;

/**
 *
 * @author Lucas
 */
public class LampadaInteligente implements ILampadaColorida{
    private String cor;
    private boolean ligada;

    public LampadaInteligente() {
        this.ligada = false;
    }
    
    @Override
    public void alterarCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void ligar() {
        if (this.ligada = true) {
            this.ligada = false;
        }   else {
            this.ligada = true;
        }
    }

    public String getCor() {
        return cor;
    }

    public boolean isLigada() {
        return ligada;
    }
}

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
public class LampadaIncandescente implements ILampada{
    private boolean ligada;

    public LampadaIncandescente() {
        this.ligada = false;
    }

    @Override
    public void ligar() {
        if (this.ligada = true) {
            this.ligada = false;
        }   else {
            this.ligada = true;
        }
    }

    public boolean isLigada() {
        return ligada;
    }
}

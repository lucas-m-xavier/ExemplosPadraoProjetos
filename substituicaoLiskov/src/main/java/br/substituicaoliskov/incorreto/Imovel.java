/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.substituicaoliskov.incorreto;

/**
 *
 * @author Lucas
 */
public class Imovel {
    private int numeroAndar = 0;
    
    public void subirAndar() {
        numeroAndar++;
    }
    
    public void entrar() {
        System.out.println("Voce entrou!");
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }
}

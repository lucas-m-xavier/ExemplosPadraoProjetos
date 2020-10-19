/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.substituicaoliskov.correto;

import br.substituicaoliskov.incorreto.*;

/**
 *
 * @author Lucas
 */
public class Apartamento extends Imovel{

    public Apartamento(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }
    
    public void subirAndar() {
        numeroAndar++;
    }
}

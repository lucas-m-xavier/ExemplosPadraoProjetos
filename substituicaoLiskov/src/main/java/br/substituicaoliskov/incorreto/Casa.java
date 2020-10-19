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
public class Casa extends Imovel{
    
    @Override
    public void subirAndar() {
        throw new RuntimeException("Uma casa tem apenas um andar!");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.reusoporcomposicao.incorreta;

/**
 *
 * @author Lucas
 */
public class DescontoPorTipo extends Desconto {
    
    @Override
    public double calcular() {
        return 0.2;
    }
}

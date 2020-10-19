/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.naoserepita01.correta;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Estoque {
    private final String codigo;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Estoque(String codigo) {
        this.codigo = codigo;
    }
    
    public void adicionarProduto(Produto produto, String tipo) {
        this.produtos.add(produto);
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Produto> getMaterialEscolar() {
        return produtos;
    }
}

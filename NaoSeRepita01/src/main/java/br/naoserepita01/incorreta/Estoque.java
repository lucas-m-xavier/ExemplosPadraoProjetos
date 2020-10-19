/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.naoserepita01.incorreta;

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
    
    public void adicionarMaterialEscolar(Produto produto) {
        Produto p1 = new Produto(produto.getNome(), produto.getValor(), "Material Escolar");
        this.produtos.add(p1);
    }
    
    public void adicionarEletronico(Produto produto) {
        Produto p1 = new Produto(produto.getNome(), produto.getValor(), "Eletronico");
        this.produtos.add(p1);
    }
    
    public void adicionarComida(Produto produto) {
        Produto p1 = new Produto(produto.getNome(), produto.getValor(), "Comida");
        this.produtos.add(p1);
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Produto> getMaterialEscolar() {
        return produtos;
    }
}

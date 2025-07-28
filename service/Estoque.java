package service;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        System.out.println("\n===== Lista de Produtos =====");
        for (Produto p : produtos) {
            System.out.println(p);
            System.out.println("----------------------------");
        }
    }

    public boolean removerProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }
}
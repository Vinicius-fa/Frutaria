package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Produto;

public class Estoque {
    private final List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado.\n");
            return;
        }
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println("--------------------------------------------------------\n");
    }

    public boolean removerProduto(String nome) {
        Iterator<Produto> it = produtos.iterator();
        while (it.hasNext()) {
            Produto p = it.next();
            if (p.getNome().equalsIgnoreCase(nome)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
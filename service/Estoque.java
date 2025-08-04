package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Fruta;
import model.Produto;
import model.Verdura;

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

    System.out.println("================ LISTA DE PRODUTOS ================\n");

    for (Produto p : produtos) {
        System.out.println(p); // já chama o toString da Fruta ou Verdura

        // Verificação com instanceof
        if (p instanceof Fruta) {
            System.out.println("Produto perecível! Armazene em local fresco.");
        } else if (p instanceof Verdura) {
            System.out.println("Ideal para consumo no mesmo dia.");
        }

        System.out.println(); // quebra de linha entre produtos
    }

    System.out.println("====================================================\n");
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
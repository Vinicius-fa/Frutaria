package main;

import model.Fruta;
import model.Verdura;
import service.Estoque;
import view.Atendente;

public class Main {

    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();

        int opcao;

        do {
            opcao = atendente.menuPrincipal();

            switch (opcao) {
                case 1 -> {
                    Fruta fruta = atendente.cadastrarFruta();
                    estoque.adicionarProduto(fruta);
                    System.out.println("Fruta cadastrada com sucesso!");
                }
                case 2 -> {
                    Verdura verdura = atendente.cadastrarVerdura();
                    estoque.adicionarProduto(verdura);
                    System.out.println("Verdura cadastrada com sucesso!");
                }
                case 3 -> estoque.listarProdutos();
                case 4 -> {
                    String nome = atendente.solicitarNomeParaRemover();
                    if (estoque.removerProduto(nome)) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                }
                case 5 -> System.out.println("Obrigado por usar o sistema! Até logo.");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        atendente.fecharScanner();
    }
}
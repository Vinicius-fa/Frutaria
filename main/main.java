package main;

import model.Produto;
import service.Estoque;
import view.Atendente;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Atendente atendente = new Atendente();
        int opcao;

        do {
            opcao = atendente.menuPrincipal();
            switch (opcao) {
                case 1: {
                    Produto p = atendente.cadastrarProduto();
                    estoque.adicionarProduto(p);
                    break;
                }
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3: {
                    String nome = atendente.removerProduto();
                    boolean removido = estoque.removerProduto(nome);
                    atendente.exibirRemocao(removido, nome);
                    break;
                }
                case 4:
                    System.out.println("Até a Próxima!\n");
                    break;
                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }
        } while (opcao != 4);
    }
}

package view;

import java.util.Scanner;
import model.Fruta;
import model.Produto;
import model.Verdura;

public class Atendente {
    private final Scanner sc = new Scanner(System.in);

    public int menuPrincipal() {
        System.out.println("=================== Quitanda Bananal ===================\n");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Remover Produto");
        System.out.println("4 - Sair\n");
        System.out.print("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine(); // limpa buffer aqui
        System.out.println("\n========================================================\n");
        return op;
    }
    
    public String removerProduto() {
        System.out.print("Digite o nome do produto para remover: ");
        String nome = sc.nextLine();
        while (nome.isEmpty()) { // evita entrada vazia
            System.out.print("Entrada inválida. Digite o nome do produto para remover: ");
            nome = sc.nextLine();
        }
        return nome;
    }
    
    public Produto cadastrarProduto() {
        System.out.print("Cadastrar Fruta ou Verdura? (F/V): ");
        String tipo = sc.nextLine().toUpperCase();
    
        System.out.print("Nome: ");
        String nome = sc.nextLine();
    
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();
    
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
    
        if (tipo.equals("F")) {
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            sc.nextLine();
            return new Fruta(nome, preco, quantidade, peso);
        } else {
            System.out.print("Tipo da verdura: ");
            String tipoVerdura = sc.nextLine();
            return new Verdura(nome, preco, quantidade, tipoVerdura);
        }
    }

    public void exibirRemocao(boolean sucesso, String nome) {
        if (sucesso) {
            System.out.println("\nProduto removido com sucesso!\n");
        } else {
            System.out.println("\nProduto não encontrado.\n");
        }
    }
}

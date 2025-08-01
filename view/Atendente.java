package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Fruta;
import model.Verdura;

public class Atendente {

    private Scanner sc;

    public Atendente() {
        sc = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("=================== Quitanda Bananal ===================\n");
        System.out.println("-------------------------------------------------------- \n");

        System.out.println("1 - Cadastrar Fruta");
        System.out.println("2 - Cadastrar Verdura");
        System.out.println("3 - Listar Produtos");
        System.out.println("4 - Remover Produto");
        System.out.println("5 - Sair");
        System.out.println("-------------------------------------------------------- \n");

        return lerInt("Escolha uma opção: ");
    }

    public Fruta cadastrarFruta() {
        String nome = lerTexto("\nDigite o nome da fruta: ");
        double preco = lerDouble("Digite o preço da fruta: ");
        int quantidade = lerInt("Digite a quantidade da fruta: ");
        double peso = lerDouble("Digite o peso da fruta (kg): ");
        return new Fruta(nome, preco, quantidade, peso);
    }

    public Verdura cadastrarVerdura() {
        String nome = lerTexto("\nDigite o nome da verdura: ");
        double preco = lerDouble("Digite o preço da verdura: ");
        int quantidade = lerInt("Digite a quantidade da verdura: ");
        String tipo = lerTexto("Digite o tipo da verdura: ");
        return new Verdura(nome, preco, quantidade, tipo);
    }

    public String solicitarNomeParaRemover() {
        return lerTexto("\nDigite o nome do produto para remover: ");
    }

    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    private int lerInt(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    private double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número decimal válido.");
                sc.nextLine();
            }
        }
    }

    public void fecharScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}
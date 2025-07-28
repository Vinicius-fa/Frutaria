package com.frutariaapp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;

public class Atendente {

    private Scanner sc;

    public Atendente() {
        sc = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("=================== Quitanda Bananal ===================\n");
        System.out.println("-------------------------------------------------------- \n");

        System.out.println("1 - Cadastrar Fruta \n2 - Listar Frutas \n3 - Remover Fruta \n");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n4 - Cadastrar Verdura \n5 - Listar Verduras \n6 - Remover Verdura \n");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n7 - Sair da Quitanda \n");
        System.out.println("-------------------------------------------------------- \n");

        return lerInt("Digite sua opção: ");
    }

    // ============ FRUTA ============

    public String cadastrarNomeFruta() {
        return lerTexto("\nDigite o nome da fruta: ");
    }

    public double cadastrarPrecoFruta() {
        return lerDouble("\nDigite o preço da fruta: ");
    }

    public int cadastrarQuantidadeFruta() {
        return lerInt("\nDigite a quantidade da fruta: ");
    }

    public double cadastrarPesoFruta() {
        return lerDouble("\nDigite o peso da fruta: ");
    }

    public void visualizarFruta(Fruta fruta) {
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: R$" + fruta.getPreco());
        System.out.println("Quantidade: " + fruta.getQuantidade());
        System.out.println("Peso: " + fruta.getPeso() + "kg");
        System.out.println("--------------------------------------------------------\n");
    }

    public String removerFruta() {
        return lerTexto("\nDigite o nome da fruta a ser removida: ");
    }

    public void visualizarFrutaRemovida(String nome) {
        System.out.println("\nA fruta '" + nome + "' foi removida.\n");
    }

    public void mensagemFrutaNaoEncontrada() {
        System.out.println("\nFruta não encontrada.\n");
    }

    // ============ VERDURA ============

    public String cadastrarNomeVerdura() {
        return lerTexto("\nDigite o nome da verdura: ");
    }

    public double cadastrarPrecoVerdura() {
        return lerDouble("\nDigite o preço da verdura: ");
    }

    public int cadastrarQuantidadeVerdura() {
        return lerInt("\nDigite a quantidade da verdura: ");
    }

    public String cadastrarTipoVerdura() {
        return lerTexto("\nDigite o tipo da verdura: ");
    }

    public void visualizarVerdura(Verdura verdura) {
        System.out.println("Nome: " + verdura.getNome());
        System.out.println("Preço: R$" + verdura.getPreco());
        System.out.println("Quantidade: " + verdura.getQuantidade());
        System.out.println("Tipo: " + verdura.getTipo());
        System.out.println("--------------------------------------------------------\n");
    }

    public String removerVerdura() {
        return lerTexto("\nDigite o nome da verdura a ser removida: ");
    }

    public void visualizarVerduraRemovida(String nome) {
        System.out.println("\nA verdura '" + nome + "' foi removida.\n");
    }

    public void mensagemVerduraNaoEncontrada() {
        System.out.println("\nVerdura não encontrada.\n");
    }

    // ============ MÉTODOS AUXILIARES ============

    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    private double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número (use vírgula se necessário).");
                sc.nextLine(); // limpar buffer
            }
        }
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
                sc.nextLine(); // limpar buffer
            }
        }
    }

    // GET/SET
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}

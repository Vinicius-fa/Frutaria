package com.frutariaapp.view;

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
		int menu = sc.nextInt();
		System.out.println("\n========================================================");
		sc.nextLine();
		return menu;	
	}
	
	//CADASTRAR FRUTA ---------------------------------------------------------------
	
	public String cadastrarNomeFruta() {
		System.out.print("\nDigite o nome da fruta: ");
		String nome = sc.nextLine();
		return nome;
	}
	
	public double cadastrarPrecoFruta() {
		System.out.print("\nDigite o preço da fruta: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		return preco;
	}
	
	public int cadastrarQuantidadeFruta() {
		System.out.print("\nDigite a quantidade da fruta: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		return quantidade;
	}
	
	public double cadastrarPesoFruta() {
		System.out.print("\nDigite o peso da fruta: ");
		double peso = sc.nextDouble();
		sc.nextLine();
		return peso;
	}
	
	//LISTAR FRUTAS ---------------------------------------------------------------
	
	public void visualizarFruta(Fruta fruta) {
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Peso: " + fruta.getPeso());
		System.out.println("--------------------------------------------------------\n");
	}
	
	//REMOVER FRUTA ---------------------------------------------------------------
	
	public String removerFruta() {
		System.out.print("\nDigite o nome da fruta a ser removida: ");
		String remover = sc.nextLine();
		return remover;
	}
	
	public void visualizarFrutaRemovida(String nome) {
		System.out.println("\nA fruta '" + nome + "' foi removida.\n");
	}
	
	public void mensagemFrutaNaoEncontrada() {
		System.out.println("\nFruta não encontrada.\n");
	}
	
	//CADASTRAR VERDURA ---------------------------------------------------------------

	public String cadastrarNomeVerdura() {
		System.out.print("\nDigite o nome da verdura: ");
		String nome = sc.nextLine();
		return nome;
	}
	
	public double cadastrarPrecoVerdura() {
		System.out.print("\nDigite o preço da verdura: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		return preco;
	}
	
	public int cadastrarQuantidadeVerdura() {
		System.out.print("\nDigite a quantidade da verdura: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		return quantidade;
	}
	
	public String cadastrarTipoVerdura() {
		System.out.print("\nDigite o tipo da verdura: ");
		String tipo = sc.nextLine();
		return tipo;
	}
	
	//LISTAR VERDURAS ---------------------------------------------------------------
	
	public void visualizarVerdura(Verdura verdura) {
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preço: R$" + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
		System.out.println("--------------------------------------------------------\n");
	}
	
	//REMOVER VERDURA ---------------------------------------------------------------
	
	public String removerVerdura() {
		System.out.print("\nDigite o nome da verdura a ser removida: ");
		String remover = sc.nextLine();
		return remover;
	}
	
	public void visualizarVerduraRemovida(String nome) {
		System.out.println("\nA verdura '" + nome + "' foi removida.\n");
	}
	
	public void mensagemVerduraNaoEncontrada() {
		System.out.println("\nVerdura não encontrada.\n");
	}
	
	//GET E SET ---------------------------------------------------------------
	
	public Scanner getSc() {
		return sc;
	}
	
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}
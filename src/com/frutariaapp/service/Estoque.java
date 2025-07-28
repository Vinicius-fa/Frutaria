package com.frutariaapp.service;

import java.util.List;
import java.util.ArrayList;

import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;
import com.frutariaapp.view.Atendente;

public class Estoque {
	
	private List<Fruta> estoqueFruta;
	private List<Verdura> estoqueVerdura;
	
	public Estoque() {
		estoqueFruta = new ArrayList<>();
		estoqueVerdura = new ArrayList<>();
	}
	
	public void gerenciarEstoque(int opcaoMenu, Atendente atendente) {
		
		switch(opcaoMenu) {
		
			case 1 -> {
				String nome = atendente.cadastrarNomeFruta();
				double preco = atendente.cadastrarPrecoFruta();
				int quantidade = atendente.cadastrarQuantidadeFruta();
				double peso = atendente.cadastrarPesoFruta();
				Fruta fruta = new Fruta(nome, preco, quantidade, peso);
				estoqueFruta.add(fruta);
				System.out.println("\n========================================================");
			}
				
			case 2 -> {
				System.out.println("\n==================== Lista de Frutas ===================\n");
				System.out.println("--------------------------------------------------------");
				for (Fruta fruta : estoqueFruta) {
					atendente.visualizarFruta(fruta);
				}
					
				if(estoqueFruta.isEmpty()) {
					System.out.println("\nNenhuma fruta cadastrada.\n");
				}
			}
			
			case 3 -> {
				String nome = atendente.removerFruta();
				boolean removido = false;

				for (int indice = 0; indice < estoqueFruta.size(); indice++) {
					if (estoqueFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
						estoqueFruta.remove(indice);
						removido = true;
						break;
					}
				}

				if (removido) {
					atendente.visualizarFrutaRemovida(nome);
				} else {
					atendente.mensagemFrutaNaoEncontrada();
				}			
			}
			
			case 4 -> {
				String nome = atendente.cadastrarNomeVerdura();
				double preco = atendente.cadastrarPrecoVerdura();
				int quantidade = atendente.cadastrarQuantidadeVerdura();
				String tipo = atendente.cadastrarTipoVerdura();
				Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
				estoqueVerdura.add(verdura);
				System.out.println("\n========================================================");
			}
				
			case 5 -> {
				System.out.println("\n=================== Lista de Verduras ==================\n");
				System.out.println("--------------------------------------------------------");
				for (Verdura verdura : estoqueVerdura) {
					atendente.visualizarVerdura(verdura);
				}
					
				if(estoqueVerdura.isEmpty()) {
					System.out.println("\nNenhuma verdura cadastrada.\n");
				}
			}
			
			case 6 -> {
				String nome = atendente.removerVerdura();
				boolean removido = false;

				for (int indice = 0; indice < estoqueVerdura.size(); indice++) {
					if (estoqueVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
						estoqueVerdura.remove(indice);
						removido = true;
						break;
					}
				}

				if (removido) {
					atendente.visualizarVerduraRemovida(nome);
				} else {
					atendente.mensagemVerduraNaoEncontrada();
				}			
			}
			
			case 7 -> {
				System.out.println("\nObrigado por confiar na Quitanda Bananal. Volte sempre.");
			}
			
			default -> {
				System.out.println("\nNúmero inválido. Tente novamente.");
			}
		
		}
		
	}
	
	public List<Fruta> getEstoqueFruta(){
		return estoqueFruta;
	}
	
	public void setEstoqueFruta(List<Fruta> estoqueFruta){
		this.estoqueFruta = estoqueFruta;
	}
	
	public List<Verdura> getEstoqueVerdura(){
		return estoqueVerdura;
	}
	
	public void setEstoqueVerdura(List<Verdura> estoqueVerdura){
		this.estoqueVerdura = estoqueVerdura;
	}

}
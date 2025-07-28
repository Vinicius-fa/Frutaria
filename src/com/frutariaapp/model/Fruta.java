package com.frutariaapp.model;

public class Fruta extends Produto {

    private double peso;

    public Fruta(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Fruta: " + getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade() + ", Peso: " + peso + "kg";
    }
}

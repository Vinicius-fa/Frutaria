package model;

public class Fruta extends Produto {
    private double peso;

    public Fruta(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    @Override
    public String toString() {
        return "[FRUTA] " + nome + " - Preço: R$" + preco + ", Quantidade: " + quantidade + ", Peso: " + peso + "kg";
    }
}
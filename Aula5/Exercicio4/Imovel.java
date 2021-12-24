package Exercicio4;

public class Imovel {

	private String endereco;
	private double preco;
	
	public Imovel(String endereco, double preco) {
		
		this.endereco = endereco;
		this.preco = preco;
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String end) {
		this.endereco = end;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calculaPreco() {
		return this.getPreco();
	}
	
	public void imprime() {
		System.out.println("Imóvel: " + " Endereco: " + this.getEndereco() + "Preco: R$" + calculaPreco());  
	}
	
	
	
}

package Exercicio4;

public class Novo extends Imovel{

	public Novo(String end, double preco) {
		
		super(end, preco);
		
	}
	
	public double calculaPreco() {
		return this.getPreco() * 1.1;
	}
	
	public void imprime() {
		System.out.println(" Imóvel Novo --> " + " Endereco: " + this.getEndereco() + "\n Preço com adicional: R$" +calculaPreco());  
	}

	
}

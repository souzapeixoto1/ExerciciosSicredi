package Exercicio4;

public class Velho extends Imovel{

	public Velho(String end, double preco) {
		super(end, preco);
		
	}

	public double calculaPreco() {
		return this.getPreco() * 0.9;
	}
	
	public void imprime() {
		System.out.println(" Im�vel Velho --> " + " Endereco: " + this.getEndereco() + " \n Pre�o com desconto R$" + calculaPreco());  
	}
	
	
	
}

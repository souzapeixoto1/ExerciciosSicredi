package Exercicio3;

public class VIP extends Ingresso {
	
	private double x = 25;
	
	public double imprimeValor() {
		x+= super.imprimeValor();
		return x;
	}
	

}

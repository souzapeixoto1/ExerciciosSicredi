package Aula2;

public class ContaCorrente {
	
	private double saldo;
	public int nroConta;
	
	
		
	public void exibe () {
		
		System.out.println(" Conta: " + this.getNroConta());
		System.out.println(" Saldo: " + this.getSaldo());

	}
	
	//metodos
	
	public void deposito (double valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println(" Deposito no valor R$ " + valor + " realizado! ");
	}
	
	public void retirada(double valor) {
		if( this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor );
			System.out.println(" Retirada no valor R$ " + valor);
		} else {
			System.out.println("Saldo Insuficiente! ");
		}
	}
	
	//metodos especiais
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	
	public ContaCorrente ( int nroConta) {
		this.saldo = 0;
		this.nroConta = nroConta;
	}

	
	
}

	

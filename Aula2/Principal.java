package Aula2;

public class Principal {

	public static void main(String[] args) {
		
		double saldototal = 0;
		ContaCorrente p[] = new ContaCorrente[2];
		
		p[0] = new ContaCorrente(600);
		p[1] = new ContaCorrente(500);
		//p0.exibe();
		//p1.exibe();
		p[0].deposito(150.50);
		p[1].deposito(0.88);
		
		for (int i=0; i < p.length; i++) {
			p[i].exibe();
			saldototal += p[i].getSaldo();
		}
			System.out.println(" Saldo de todas as contas R$: " + saldototal);
		}
		
	

	}


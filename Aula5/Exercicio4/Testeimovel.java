package Exercicio4;

import java.util.Scanner;

public class Testeimovel {

	public static void main(String[] args) {

		Imovel y;
		double valor;
		int a;

		Scanner ler = new Scanner(System.in); // Starta Scanner

		System.out.println(" Digite o endereço do imóvel: ");
		String endereco = ler.nextLine(); // armazena na vari�vel o valor

		System.out.println(" Digite o valor do im�vel: ");
		valor = ler.nextDouble(); // armazena na vari�vel o valor

		System.out.println("");

		System.out.println(" ===== Digite a op��o desejada:  ==== ");
		System.out.println(" Digite 1 para casa nova ");
		System.out.println(" Digite 2 para casa velha ");

		a = ler.nextInt();

		if (a != 1 && a != 2) {
			System.out.println(" Op��o Inv�lida! ");
		} else if (a == 1) {
			y = new Novo(endereco, valor);
			y.imprime();
		} else {
			y = new Velho(endereco, valor);
			y.imprime();
		}
		ler.close();

	}
}

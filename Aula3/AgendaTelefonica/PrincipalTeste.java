import java.util.HashMap;

public class PrincipalTeste {

	public static void main(String[] args) {
		
	AgendaTelefonica agenda = new AgendaTelefonica();
	
	agenda.inserir("Leo", "1234");
	//agenda.inserir("Mariana", "1234");
	//agenda.inserir("Eduardo", "1234");
	//agenda.inserir("Monica", "1234");
	//agenda.inserir("Bruna", "1234");
	
	System.out.println();
	

	//System.out.println(agenda.buscarNumero("Leo"));
	//agenda.buscarNumero("Leo");
	
	//busca
	
	//System.out.println(" Busca encontrada: " + agenda.buscarNumero(""));
	agenda.remover("Leo");
	agenda.buscarNumero("Leo");
	
	
	//agenda.tamanho();
		
	}

}

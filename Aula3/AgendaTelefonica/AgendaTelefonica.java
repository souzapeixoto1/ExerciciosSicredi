
import java.util.HashMap;

public class AgendaTelefonica {

	HashMap<String, String> contatos = new HashMap<String, String>();

	public void inserir(String nome, String numero) {

		contatos.put(nome, numero);
		
		if (nome == "" || nome == null) {
			System.out.println("Nome Inv�lido, tente novamente! ");
		}
		if (numero == "" || numero == null) {
			System.out.println("N�mero Inv�lido, tente novamente");
		} else {
		
		System.out.println(" Usuario com o nome: " + nome);
		System.out.println(" N�mero: " + numero);
		System.out.println(" Inserido com sucesso ");
		System.out.println("");
		
		}
	}

	public String buscarNumero(String nome) {
		
		String x = contatos.get(nome);
		
		if (nome != null) {
			System.out.println(" Telefone " + x + " do contato " + nome);
		}
			
		return " Telefone n�o encontrado ";
		}

	public void remover(String nome) {
		if (contatos.remove(nome) != null)
			System.out.println( " Contato de " + nome + " Removido! ");
		else
			System.out.println(" N�o  encontrado ");
	}

	// Retorna n�mero dos cadastros
	public int tamanho() {
		return contatos.size();
	}

}

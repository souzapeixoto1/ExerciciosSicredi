
import java.util.HashMap;

public class AgendaTelefonica {

	HashMap<String, String> contatos = new HashMap<String, String>();

	public void inserir(String nome, String numero) {

		contatos.put(nome, numero);
		
		if (nome == "" || nome == null) {
			System.out.println("Nome Inválido, tente novamente! ");
		}
		if (numero == "" || numero == null) {
			System.out.println("Número Inválido, tente novamente");
		} else {
		
		System.out.println(" Usuario com o nome: " + nome);
		System.out.println(" Número: " + numero);
		System.out.println(" Inserido com sucesso ");
		System.out.println("");
		
		}
	}

	public String buscarNumero(String nome) {
		
		String x = contatos.get(nome);
		
		if (nome != null) {
			System.out.println(" Telefone " + x + " do contato " + nome);
		}
			
		return " Telefone não encontrado ";
		}

	public void remover(String nome) {
		if (contatos.remove(nome) != null)
			System.out.println( " Contato de " + nome + " Removido! ");
		else
			System.out.println(" Não  encontrado ");
	}

	// Retorna número dos cadastros
	public int tamanho() {
		return contatos.size();
	}

}

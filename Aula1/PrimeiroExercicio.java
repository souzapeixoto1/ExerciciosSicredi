package Aula1;

public class PrimeiroExercicio {

	public static void main(String[] args) {

		int[] nums = new int[20];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			nums[i] *= 10;
			// System.out.println(nums[i]);
		}
		
		for (int j = nums.length - 1; j >= 0; j--) {

			// System.out.println(nums[j]);
		}

		System.out.println("Numero de ocorrencias: " + nOcorrencias(nums, 100));
		System.out.println("Repetiu? " + hasRepeat(nums));
		System.out.println("Elementos repetido: " + nroRepeat(nums));
		

	}

	// fim metodo principal main()
	// exercicio 2 questao A.
	public static int nOcorrencias(int[] l, Integer el) {
		int cont = 0;
		for (int i = 0; i < l.length; i++) {
			if (l[i] == el) {
				cont++;
			}

		}
		return cont;

	}// EXERCICIO 2 questao B

	public static boolean hasRepeat(int[] l) {
		for (int i = 0; i < l.length; i++) {
			if (l[i] == l.length)
				return true;

		}
		return false;
	}

	// EXERCICIO 2 questao C
	public static int nroRepeat(int[] l) {
		int cont = 0;
		for (int i = 0; i < l.length; i++) {
			if (l[i] == l.length) {
				cont++;
			}

		}
		return cont;
	}

	public static void listRepeat(int[] l) {
		int v[];
		for (int i = 0; i < l.length; i++) {
			if (l[i] == l.length) {
				v[i] = l.length;
			}
		}
	}
}

import java.util.ArrayList;

public class ExemploListas {

	public void demo1() {
		ArrayList<String> lStr = new ArrayList<>();
		
		lStr.add("Michael");
		lStr.add("Carol");
		lStr.add("Leonardo");
			
		for ( int i = 0; i < lStr.size(); i++) {
			System.out.println("Nome: " + lStr.get(i) + " " + "Posição:" + i);
		}
		
		lStr.add("Dine");
		for ( int i = 0; i < lStr.size(); i++) {
			System.out.println("Nome: " + lStr.get(i) + " " + "Posição:" + i);
	}
		if (lStr.contains ("Leonardo"))
			System.out.println("Leonardo Presente");
		else
			System.out.println("Leonardo Saiu");
	

	}
}
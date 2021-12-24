import java.util.LinkedList;

public class ExemploLinkdLists {

	public void demo1() {
		LinkedList<String> lStr = new LinkedList<>();
		
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
	
	public void demo2() {
		LinkedList<String> lStr = new LinkedList<>();
	}
}
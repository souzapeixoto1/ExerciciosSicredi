import java.util.HashMap;

public class ExemploMaps {
	public void demo01() {
		
		HashMap<String, ContaCorrente> tab new HashMap<>();
		
		tab.put("Felipe", new ContaCorrente(123456));
		tab.put("Leonardo", new ContaCorrente(123456));
		tab.put("Eduardo", new ContaCorrente(123456));
		
		System.out.println("Dados do Felipe: " + tab.get(Felipe).getNroConta());
		System.out.println("Dados do Leonardo: " + tab.get(Leonardo).getNroConta());
		System.out.println("Dados do Eduardo: " + tab.get(Eduardo).getNroConta());
		
		System.out.println("Dados do Edi: " + tab.get(Edi).getNroConta());
	}
}

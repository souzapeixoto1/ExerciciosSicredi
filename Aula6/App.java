
public class App {
	public static void main(String[] args) {
		StringFunction test = (s) -> s + "aaaaa";
		printFormatted("Hello", test);
	}
	
	interface StringFunction{
		String run (String str);
	}
	
	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}
}

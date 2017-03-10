package dzien2;

public class zadanie5 {
	public static void main(String[] args) {
		
		String tablica[] = { "a", "b", "c" };
		
		System.out.println("for");
		for (int i = 0; i < tablica.length; i++) {
			System.out.println(tablica[i]);
		}
		
		System.out.println();
		
		System.out.println("foreach");
		for (String string : tablica) {
			System.out.println(string);
		}
		
		System.out.println();
		
		System.out.println("while");
		int i = 0;
		while (tablica.length>i) {
			System.out.println(tablica[i++]);
		}
	}
}

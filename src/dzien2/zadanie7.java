package dzien2;

public class zadanie7 {
	public static void main(String[] args) {

		int[] tablica = {1,2,4,543,663,432};
		podzielne(tablica, 4);
		
		
	}
	
	public static void podzielne(int[] table, int number){
		
		for (int i = 0;i < table.length; i++) {
			if(table[i] % number == 0){
				System.out.println("Liczba:" +table[i]);
				System.out.println("Pozycja:" +i);
				break;
			}
		}
	}
}

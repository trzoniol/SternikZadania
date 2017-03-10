package dzien2;

public class zadanie11 {
	public static void main(String[] args) {
		getZamowienie(Zamowienie.NOWE);
		
		for (Zamowienie zamowienie : Zamowienie.values()) {
			System.out.println(zamowienie);
		}
	}
	
	public static void getZamowienie(Zamowienie zamowienie){
		switch (zamowienie) {
		case NOWE:
			System.out.println("nowe zamowienie");
			break;

		default:
			System.out.println("inne");
		}
	}
}

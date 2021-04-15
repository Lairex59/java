
public class Fibonacci {

	public static void main(String[] args) {
		//�berschrift wird ausgegeben
		System.out.println("Fibonacci-Zahlen");
		System.out.println("================");
		//Zahlen werden initialisert
		int n = TestScanner.readInt("Die wie vielte Zahl? ");
		int fzahl1 = 1;
		int fzahl2 = 0;
		/**Wird �berpr�ft, ob die Zahl negativ ist, falls sie negativ ist wird eine Fehlermeldung
		 *  asugegeben und man muss die erw�nschte Zahl nochmals initialiseren
		 */
		while (n < 0) {
			System.out.println("Die Zahl muss größer oder gelich Null sein");
			n = TestScanner.readInt("Die wie vielte Zahl? ");
		}
		//Fibonacci Zahl wird berechnet
		for (int i = 1; i < n; i++) {
			fzahl1 += fzahl2;
			fzahl2 = fzahl1 - fzahl2;
		}
		/**Falls die Zahl nicht Null wird die Anweisung ausgegeben. falls nicht wird die andere
		 * Anweisung ausgegeben
		 */
		if (n!=0) {
			System.out.println("Die "+n+". Fibonacci-Zahl lautet "+fzahl1);
		}
		else {
			System.out.println("Die "+n+". Fibonacci-Zahl lautet " + 0);
		}
	}

}

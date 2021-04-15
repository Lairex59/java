
public class Median {

	public static void main(String[] args) {
		//�berschrift wird ausgegeben
		System.out.println("Median");
		System.out.println("======");
		//Varaiblen werden in der Konsole impliziert
		int zahl1 = TestScanner.readInt("1. Zahl ");
		int zahl2 = TestScanner.readInt("2. Zahl ");
		int zahl3 = TestScanner.readInt("3. Zahl ");
		System.out.println();
		/**Falls die zahl1 gr��er gleich zahl2 ist und die zahl1 kleiner gelecih als die zahl3 ist
		 * werden die Anweisungen dieser Schleife gelesen
		 */
		if (zahl1>=zahl2&&zahl1<=zahl3) {
			//"Der Median lautet: " und die zahl1 wird daneben ausgegeben
			System.out.println("Der Median lautet: "+zahl1);
		}
		//Falls die obere Bedinung nicht simmen sollte, dann wird diese Schleife gelesen
		else {
			/**Falls zahl2 gr��er gleich zahl1 ist und zahl2 kleiner gleich zahl3 ist, wird in
			 * dieser Schleife eingelesen und die Anweisungen dieser Schleife werden eingelesen bzw
			 * ausgegeben
			 */
			if (zahl2<=zahl1&&zahl2>=zahl3) {
				System.out.println("Der Median lautet: "+zahl2);
			}
			/**Falls die Bedinung der letzten if-Schleife nicht stimmen sollte, wird einfach diese
			 * Anweisung ausgegeben
			 */
			else {
				System.out.println("Der Median lautet: "+zahl3);
			}
		}
	}
}

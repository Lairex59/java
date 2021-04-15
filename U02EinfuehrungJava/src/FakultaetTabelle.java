
public class FakultaetTabelle
{

	public static void main(String[] args) {
		//Die Variable n wird den Wert 1 zugewiesen und i den Wert 0
		int n = 1;
		int i = 0;
		//Überschrift wird ausgegeben
		System.out.print("       n");
		System.out.println("      n!");
		System.out.println("================");
		//Neue Variabel vom Datentyp integer mit den Namen produkt und wird den Wert 1 zugewiesen
		int produkt = 1;
		//Solange diese Bedinung stimmt wird in der Schleife reingelesen
		while (n <= 10) {
			//Falls diese Bedinung zustimmt wird die Anweisung ausgegeben
			if (n < 10) {
				//Wird in der Console ausgegeben
				System.out.print("       " + n);
			}
			//Falls die obere Bedinung nicht stimmen sollte wird diese Anweisung ausgegeben
			else {
				System.out.print("      " + n);
			}
			while (i < n) {
				//i wird um 1 erhöht
				i++;
				//Variale produkt soll sein produkt * i
				produkt *= i;
				//Methode printZahl wird ausgegeben
				printlnZahl(produkt);
			}
			//n wird um 1 erhöht
			n++;
		}
	}
	/*Neue Methode printZahl die dazu dient alle Zahlen rechtsbündig und unetreinander in der Console
	 * ausgegeben werden
	 */
	public static void printlnZahl (int produkt) {
		if (produkt < 10) {
				System.out.println("       " + produkt);
		}
		else {
			if (produkt < 100) {
				System.out.println("      " + produkt);
			}
			else {
				if (produkt < 1000) {
					System.out.println("     " + produkt);
				}
				else {
					if (produkt < 10000) {
						System.out.println("    " + produkt);
					}
					else {
						if (produkt < 100000) {
							System.out.println("   " + produkt);
						}
						else {
							if (produkt < 1000000) {
								System.out.println("  " + produkt);
							}
							else {
								if (produkt < 10000000) {
									System.out.println(" " + produkt);
								}
							}
						}
					}
				}
			}
		}
	}
}

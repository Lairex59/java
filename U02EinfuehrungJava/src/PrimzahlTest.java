
/**
 * 
 * @author Laraib
 *
 */
public class PrimzahlTest
{
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		//Variabel z wird in der Kommandozeile geholt und eingegeben
		int z = Integer.parseInt(args[0]);
		//Variabel vom Datentyp integer wird 0 zugewiesen
		int primz = 0;
		//Falls die Bedinung der if-Schleife stimmt wird die untere Anweisung ausgegeben
		if (z <= 1) {
			System.out.println("Die Zahl ist keine Primzahl");
		}
		//Variable t wrid den Wert zugewiesen
		int t = 2;
		//Solange z kleiner gleich t ist wird die Schleife wiederholt bzw ausgeführt
		while (z >= t) {
			/*Falls diese Bedinung sitmmt werden alle Anweisungsblöcke durchegelesen und diejenigen die
			 * auszugeben sind werden ausgegeben 
			 */
			if (z >= 1) {
				if (z == 2 || z == 3 || z == 7 || z == 5 ) {
					//primz wird jetzt den Wert 1 zugewiesen
					primz = 1;
					System.out.println("Die Zahl ist eine Primzahl");
					//t wird um 2 grö0er als z
					t = z + 2;
				}
				/*Falls die obere Bedinung nicht gelten soll wird in die Bedinung dieser Schleife 
				 * eingegangen und alle Anweisungsblöcke werden gelesen die in dieser Schleife vorhanden sind,
				 * wenn die Bedinung stimmen sollte 
				 */
				if (t < z - 1 && primz == 0) {
					//Bedinung wird überprüft
					if (z % 2 != 0) {
						//primz wird 1
						primz = 1;
					}
					//Bedinung wird überprüft und wird eingegangen falls die Bedinung stimmt
					if (z % 9 == 0 || z % 7 == 0 || z % 5 == 0 || z % 3 == 0) {
						//primz wird 0
						primz = 0;
						//Die Zahl ist keine Primzahl wird ausgegeben
						System.out.println("Die Zahl ist keine Primzahl");
						//t wird um 2 größer als z
						t = z + 2;
					}
					//Bedinung wird gelesen und wird überprüft
					if (primz == 1) {
					//Die Zahl ist eine Primzahl wird ausgegeben
					System.out.println("Die Zahl ist eine Primzahl");
					t = z + 2;
					}
				}
			}
		}	
	}
}

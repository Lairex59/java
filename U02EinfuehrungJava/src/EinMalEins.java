/**
 * 
 * @author Laraib
 *
 */
public class EinMalEins
{
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		//Alle 3 Variablen vom Datentyp integer werden den Wert 1 zugewiesen
		int i = 1;
		int j = 1;
		int k = 1;
		//Überschrfit wird ausgegeben
		System.out.println("Einmaleins-Tabelle");
		System.out.println("==================");
		//Solange diese Bedinung übereinstimmt werden die Anweisungsblöcke bzw Schleifen ausgegeben
		while (i <= 10) {
			while (j < i * 10) {
				//Varible j soll sein die Variable i * k
				j = i * k ;
				//Methode printZahl wird ausgegeben
				printZahl(j);
				//k wird um 1 erhöht
				k = k + 1;
			}
			//Nach der inneren Schleife soll k sein 1
			k = 1;
			System.out.println();
			//i wird um 1 erhöht
			i++;
		}
		
		
		
	}
	//Methode printZahl gilt damit, dass alle Zahlen rechtsbündig und untereinander ausgegeben werden
	public static void printZahl (int zahl) {
		if (zahl < 10) {
			System.out.print("   " + zahl);
		}
		else {
			if (zahl < 100) {
				System.out.print("  " + zahl);
			}
			else {
				System.out.print(" " + zahl);
			}
		}
	}

}

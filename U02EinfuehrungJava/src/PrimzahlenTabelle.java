
public class PrimzahlenTabelle
{

	public static void main(String[] args) {
		//Die Überschrift wird ausgegeben
		System.out.println("Primzahlentabelle");
		System.out.println("=================");
		//Variablen zahl und n werden eingegeben
		int zahl = 90;
		int n = 120;
		//Solange die Bedinung die in der Schleife stimmt wird der Anweisungsblock ausgegeben
		while (zahl <= n) {
			//Die Methode printZahl und istPrimzahl wird aufgerufen
			printZahl(zahl);
			istPrimzahl(zahl);
			//zahl wird jedesmal um 1 erhöht
			zahl = zahl + 1;
		}
	}
	
	/*
	 * Die Methode istPrimzahl dient zur bestimmung der Variable zahl in dieser Methode ob sie eine 
	 * Primzahl ist oder nicht
	 */
	public static void istPrimzahl(int zahl) {
		//Die Variable primz vom Datentyp integer ist 0
		int primz = 0;
		//Falls die Bedinung übereinstimmt wird die Variable primz zu 1, Falls nicht bleibt sie 0
		if (zahl == 2 || zahl % 2 != 0) {
			primz = 1;
		}
		//Falls die Bedinung in dieser if-Schleife stimmt wird die Varible primz 0
		if (zahl % 9 == 0 || zahl % 7 == 0 || zahl % 5 == 0 || zahl % 3 == 0) {
			primz = 0;
		}
		/*Falls die Variale primz 0 ist wird die Variable zahl, die in der Methode gekennzeichnet ist,
		 *  als "ist keine Primzahl ausgegeben"
		 */
		if (primz == 0) {
			System.out.println(" ist nicht Primzahl");
		}
		//Falls die obere Bedinung nicht stimmt wird diese Anweisung ausgegeben
		else {
			System.out.println(" ist Primzahl");
		}
}
	/*Hier startet eine neue Methode mit den Namen printZahl, die dazu dient die Zahlen 
	 * rechtsbündig auszugeben
	 */
	public static void printZahl(int zahl) {
		//Falls die Bedinung stimmt werden die Anweisungen ausgegeben
		if (zahl < 100) {
			System.out.print("  " + zahl);
		}
		else {
			System.out.print(" " + zahl);
		}
	}
}
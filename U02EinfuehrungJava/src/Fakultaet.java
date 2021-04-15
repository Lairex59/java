/**
 * 
 * @author Laraib
 *
 */

public class Fakultaet
{
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n wird als eine beliebige Zahl eingegeben
		int n = 5;
		//i und produkt werden als 1 eingegeben
		int i = 1;
		int produkt = 1;
		//Falls n größer gleich 1 ist und i >= 1 ist wird die Schleife eingelesen
		if (n >= 1 && i >= 1) {
			//Solange i größer als n ist wird die Schleife eingelesen
			while (i < n) {
				//i wird um 1 erhöht
				i++;
				//Der produkt wird durch produkt * i ersetzt
				produkt *= i; 
			}
		}
		//produkt wird ausgegeben
		System.out.println(produkt);
	}
}

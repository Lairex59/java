
public class Doppelfaktorielle
{


	public static void main(String[] args) {
		//Variablen werden bestimmt eingegeben, n wird beliebig eingegeben von der Kommandozeile
		int n = Integer.parseInt(args[0]);
		int i = 1;
		int produkt = 1;
		//Falls der Rest von n/2 0 ergibt werden die Anweisungen gelesen
		if (n % 2 == 0) {
			//i wird zu 2
			i = 2;
			//Solange i kleiner ist als n lest das Programm die Anweisungen
			while (i < n) {
				//i wird um 2 erhöht
				i = i + 2 ;
				//Variable wird mit i multiplizert
				produkt *= i;
			}
			//Variable wird mit 2 multipliziert
			produkt *= 2;
		}
		//Falls die obere if-Bedinung nicht sitmmen sollte wird diese ausgeführt
		else {
			while (i < n) {
				i = i + 2;
				produkt *= i;
			}
		}
		//Variable prdoukt wird in der Console ausgegeben
		System.out.println(produkt);
	}
}

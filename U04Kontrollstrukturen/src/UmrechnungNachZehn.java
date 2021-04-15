
public class UmrechnungNachZehn {

	public static void main(String[] args) {
		//Übeschrift wird ausgegeben
		System.out.println("Umrechnung ins Zehnersystem");
		System.out.println("===========================");
		//Variablen werden initialisiert
		int zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		int zahl1 = 0;
		int laenge = 0;
		int i = 1;
		int sum = 0;
		int basis = TestScanner.readInt("Geben Sie die Basis ein: ");
		//Fehlermeldung falls basis größer 9 oder kleiner 2 sein wird
		while (basis < 2 || basis > 9) {
			System.out.println("Basis muss zwischen 2 und 9 liegen");
			basis = TestScanner.readInt("Geben Sie die Basis ein: ");
		}
		//Länge der Zahl wird berechnet
		while (zahl / i > 1) {
			i *= 10;
			laenge++;
		}
		//Zahl im 5-System wird berechnet
		while (zahl >= 1) {
			zahl1 = zahl / i;
			zahl = zahl % i;
			i = i / 10;
			
			sum += zahl1 * Math.pow(basis, laenge);
			laenge--;
		}
		//Ausgabe der Summe
		System.out.println();
		System.out.println("Die Zahl im Zehnersystem lautet "+ sum);
	}

}

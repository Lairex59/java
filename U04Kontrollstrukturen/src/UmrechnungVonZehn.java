
public class UmrechnungVonZehn {

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Umrechnung vom Zehnersystem");
		System.out.println("===========================");
		//Variablen werden initialisert
		int zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		int basis = TestScanner.readInt("Geben Sie die Basis ein: ");
		//Wird überprüft ob die basis in den Wertebereich passt, falls nicht, dann muss man wieder initialisieren
		while (basis < 2 || basis > 9) {
			System.out.println("Basis muss zwischen 2 und 9 liegen");
			basis = TestScanner.readInt("Geben Sie die Basis ein: ");
		}
		//Weiter Variablen werden initialisiert
		int rest = 0;
		int laenge = 1;
		int sum = 0;
		//Die Zahl vom Zehnersystem wird in ein fremdes umgewandelt
		while (zahl >= 1) {
			rest = zahl % basis;
			zahl /= basis;
			sum = (int)(sum+rest*laenge);
			laenge *= 10;
		}
		//Das Ergebnis wird ausgegeben
		System.out.println();
		System.out.println("Die Zahl im " + basis + "-er System lautet: "+sum);
	}

}

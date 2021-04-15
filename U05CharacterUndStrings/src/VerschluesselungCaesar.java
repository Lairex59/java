
public class VerschluesselungCaesar {

	public static void main(String[] args) {
		// Überschrift wird ausgegeben
		System.out.println("Verschlüsselung nach Cäsar");
		System.out.println("==========================");
		/*
		 * Eine Variable wird definiert, welche dafür sorgt, dass das Programm immer wieder 
		 * widerholt wird bis es explizit abgebrochen wird
		 */
		int nochmal = 0;
		while (nochmal == 0) {
			/*
			 * Der Benutzer kann mittels einem Buchstaben den entscheidung auswählen. Sollte ein Großbuchstaben
			 * eingegeben werden, so wird dieser zu einem Kleinbuchstaben konvertiert
			 */
			char entscheidung = Character.toLowerCase((TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, "
	                + "A>bbruch: ")));
			//Strings mit dem Alphabet in Großbuchstaben/Kleinbuchstaben, welche zur Verschlüsselung benutzt werden.
			String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			//Sollte der entscheidung v gewählt werden
			if (entscheidung == 'v') {
				//Benutzereingabe des Textes, welcher verschlüsselt werden soll
				String text2 = TestScannerErweitert.readString("Text: ");
				text2.trim();
				//Benutzereingabe der Verschiebung im Alphabet
				int verschiebung = TestScannerErweitert.readInt("Verschiebung: ");
				//Der eingegebene Text wird in Großbuchstaben konvertiert
				String text = text2.toUpperCase();
				//Ausgabe (Benutzerschnittstelle)
				System.out.print("Verschlüsselt: ");
				/*
				 * Jedes einzelne Zeichen des eingegebenen Strings werden angesteuert und geschaut ob sie
				 * ein Buchstabe sind. Wenn dem so ist, wird dieses Zeichen mit dem Alphabet 
				 * verglichen. So wird die Stelle des Zeichens im Alphabet ermittelt. Zu der Integerzahl, 
				 * welche die Stelle angibt, wird die Verschiebung addiert und der Großbuchstabe der neuen
				 * Stelle wird schließlich ausgegeben.
				 */
				for (int i = 0; i < text.length(); i++) {
					//Zeichen ist Buchstabe
					if (Character.isLetter(text.charAt(i))) {
						//variablendeklaration
						int stelle = 0;
						int stop = 0;
						//Suche nach dem Zeichen im Alphabet
						while (stop == 0) {
							if (text.charAt(i) == abc.charAt(stelle)) {
								stop++;
							}
							else {
								stelle++;
							}
						}
						//Zur Stelle wird die Verschiebung addiert
						int stelle2 = stelle + verschiebung;
						//Ist die neue Stelle größer als 25, so wird die Stelle modulo 26 berechnet
						if (stelle2 > 25) {
							stelle2 = stelle2 % 26;
						}
						//Ausgabe des verschlüssselten Großbuchstabens
						System.out.print(abc.charAt(stelle2));
					}
				}
				//Ausgabe Absatz
				System.out.println();
			}
			//Wenn der entscheidung e = entschlüsseln gewählt wird
			if (entscheidung == 'e') {
				//Benutzereingabe des zu übersetzenden Textes
				String text2 = TestScannerErweitert.readString("Text: ");
				text2.trim();
				//Benutzereingabe der Verschiebung
				int verschiebung = TestScannerErweitert.readInt("Verschiebung: ");
				//Der eingegebene Text wird zu Großbuchstaben konvertiert
				String text = text2.toUpperCase();
				//Ausgabe
				System.out.print("Entschlüsselt: ");
				/*
				 * Jedes einzelne Zeichen des eingegebenen Strings werden angesteuert und geschaut ob sie
				 * ein Buchstabe sind. Wenn dem so ist, wird dieses Zeichen mit dem Alphabet in Großbuchstaben
				 * verglichen. So wird die Stelle des Zeichens im Alphabet ermittelt. Zu der Integerzahl, 
				 * welche die Stelle angibt, wird die Verschiebung addiert und der Großbuchstabe der neuen
				 * Stelle wird schließlich ausgegeben.
				 */
				for (int i = 0; i < text.length(); i++) {
					//Ist Buchstabe
					if (Character.isLetter(text.charAt(i))) {
						//Variablendeklarationen
						int stelle = 0;
						int stop = 0;
						//Suche nach der Stelle im Alphabet
						while (stop == 0) {
							if (text.charAt(i) == abc.charAt(stelle)) {
								stop++;
							}
							else {
								stelle++;
							}
						}
						//Von der Stelle wird die Verschiebung abgezogen
						int stelle2 = stelle - verschiebung;
						/*
						 * Wenn die Stelle kleiner 0 ist, so wird aus der negativen Zahl die positive 
						 * Zahl ermittelt und die Differenz auf 26 ist die neue Stelle
						 */
						if (stelle2 < 0) {
							stelle2 = stelle2 * -1;
							stelle2 = 26-stelle2;
						}
						//Ausgabe des entschlüsselten Großbuchstabens
						System.out.print(abc.charAt(stelle2));
					}
				}
				//Ausgabe Absatz
				System.out.println();
				
			}
			/*
			 * Wenn der entscheidung a = abbrechen gewählt wird, so wird die Variable nochmal auf 1
			 * gesetzt und so die Haupt-While-Schleife abgebrochen
			 */
			if (entscheidung == 'a') {
				nochmal = 1;
			}
		}
	}

}

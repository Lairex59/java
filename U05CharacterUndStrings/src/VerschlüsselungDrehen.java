
public class VerschlüsselungDrehen
{

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Verschlüsselung durch Drehen");
		System.out.println("============================");
		/**Erster wird die Schleife normal ausgegeben, dann wird gefragt ob man es nochmal machen will, dann wird
		 * diese Schleife falls man j eingegeben hat wiederholt, bis man n eintippt
		 */
		do {
			//String wird initialisert
			String text = TestScannerErweitert.readString("Text: ");
			//Vom text werden alle Leerzeichen die hinten und vorne sind eliminiert
			text = text.trim();
			//Error, falls der text kein Zeichen entählt und es wird aufgerufen nochmals den Text einzugeben
			while (text.length() <= 0) {
				System.out.println("Text muss mindestens ein Zeichen enthalten");
				text = TestScannerErweitert.readString("Text:");
				text = text.trim();
			}
			//Variablen werden initialisert
			int n = text.length();
			//Text wird verschlüsselt und ausgegeben
			System.out.print("Verschlüsselt: ");
			if (n%2==0) {
				n--;
				for (int i = 0; i < Math.floor(text.length() / 2.0); i++) {
					System.out.print(text.charAt(i));
					System.out.print(text.charAt(n));
					n--;
				}
			}
			else {
				n--;
				for (int i = 0; i < Math.floor(text.length() / 2.0); i++) {
					System.out.print(text.charAt(i));
					System.out.print(text.charAt(n));
					n--;
				}
				
			}
			System.out.println(text.charAt(n));
		//Wird dem user aufgerufen, ob er es nochmal machen will
		}	while (TestScannerErweitert.readChar("Nochmal (j/n)? ") == 'j');
	}
}

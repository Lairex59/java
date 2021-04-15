
public class TextStatistik
{

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Textstatistik");
		System.out.println("=============");
		//Werte werden initialisert
		String text = TestScannerErweitert.readString("Text: ");
		int selbstlaute = 0;
		int buchstaben = 0;
		int leerzeichen = 0;
		char c = 'a';
		//Leerzeichen werden von vorne und hinten entfernt
		text = text.trim();
		//Error falls, die Variable text leer ist
		while (text.length() == 0) {
			System.out.println("Text muss mindestens ein Zeichen enthalten");
			text = TestScannerErweitert.readString("Text: ");
			text = text.trim();
		}
		text = text.toLowerCase();
		System.out.println();
		//Zählt die selbstlaute
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				c = text.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					selbstlaute++;
				}
			}
		}
		//Zählt alle Buchstaben
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				buchstaben++;
			}
		}
		//Zählt alle Leerzeichen
		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				leerzeichen++;
			}
		}
		//Ausgabe von selbstlaute, buchstaben, leerzeichen und Zeichen
		System.out.println("Anzahl Selbstlaute: " + selbstlaute);
		System.out.println("Anzahl Buchstaben: " + buchstaben);
		System.out.println("Anzahl Leerzeichen: " + leerzeichen);
		System.out.println("Anzahl Zeichen: " + text.length());
	}
}

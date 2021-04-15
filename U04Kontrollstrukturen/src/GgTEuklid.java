
public class GgTEuklid {

	public static void main(String[] args) {
		//�berschrift wird ausgegeben
		System.out.println("GgT von Euklid");
		System.out.println("==============");
		//Alle Zahlen werden initialisiert
		int zahl1 = TestScanner.readInt("Erste Zahl: ");
		int zahl2 = TestScanner.readInt("Zweite Zahl: ");
		int ggt = 0;
		int rest = 1;
		int rest2 = 0;
		int groß = 0;
		int klein = 0;
		//Bestimmt welche Zahl größer ist
		if (zahl1 >= zahl2) {
			groß = zahl1;
			klein = zahl2;
		}
		else {
			groß = zahl2;
			klein = zahl1;
		}
		//Bestimmt den Größten gemeinsamen Teiler
		if (groß % klein == 0) {
			ggt = klein;
		}
		else {
			rest = groß % klein;
			ggt = klein;
			while (rest != 0) {
				rest2 = rest;
				rest = ggt % rest;
				ggt = rest2;
			}
		}
		//Ausgabe vom Text und den ggt
		System.out.println();
		System.out.println("Der größte gemiensame Teiler lautet " + ggt);
	}
}

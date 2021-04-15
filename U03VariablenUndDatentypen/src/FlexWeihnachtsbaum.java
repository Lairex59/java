
public class FlexWeihnachtsbaum
{

	public static void main(String[] args) {
		//Höhe des Baumes (exklusiv Stamm), wird in der Console impliziert
		int hoehe1 = TestScanner.readInt("Geben Sie die Höhe des Baumes ein: ");
		//Höhe des Stammes, wird in der Console impliziert
		int hoehe2 = TestScanner.readInt("Geben Sie die Höhe des Stammes ein: ");
		//Leerzeichne
		int breite1 = hoehe1-1;
		//Sterne
		int breite2 = 1;
		for (int i = 1; i<=hoehe1; i++) {
			//Class Weihnachtsbaum, der Methode printLeerzeichen bzw. der Methode Sterne wird aufgerufen
			Weihnachtsbaum.printLeerzeichen(breite1);
			Weihnachtsbaum.printSterne(breite2);
			Weihnachtsbaum.printLeerzeichen(breite1);
			System.out.println();
			breite1--;
			breite2 += 2;
		}
		breite1 = hoehe1-2;
		breite2 = 3;
		for (int i = 1; i<=hoehe2; i++) {
			Weihnachtsbaum.printLeerzeichen(breite1);
			Weihnachtsbaum.printSterne(breite2);
			Weihnachtsbaum.printLeerzeichen(breite1);
			System.out.println();
		}
	}

}

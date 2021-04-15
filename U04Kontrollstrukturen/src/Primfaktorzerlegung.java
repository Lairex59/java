
public class Primfaktorzerlegung {

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Primfaktorzerlegung");
		System.out.println("===================");
		//Variablen werden initialisiert
		int n = TestScanner.readInt("Geben Sie die Zahl ein: ");
		int n2 = n;
		int teiler = 2;
		//Fehlermeldung falls Zahl kleiner als 2
		while (n < 2) {
			System.out.println("Zahl muss größer als 1 sein");
			n = TestScanner.readInt("Geben Sie die Zahl ein ");
		}
		/**Berechnet die einzelnen Zahlen und wenn sie multipliziert werden kommt das gleiche wie die eingegebene
		 * Zahl
		 */
		while (n > 1) {
			if (n%teiler==0) {
				n = n / teiler;
				System.out.print(teiler);
				if (n > 1) {					
					System.out.print(" * ");
				}
			}
			else {
				teiler++;
			}
		}
		//Ausgabe der eingegeben Zahl
		System.out.print(" = " + n2);
	}

}

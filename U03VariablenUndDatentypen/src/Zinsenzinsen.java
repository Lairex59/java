
public class Zinsenzinsen
{

	public static void main(String[] args) {
		//Überschrift wird ausgegben
		System.out.println("Zinsenzinsen");
		System.out.println("===========");
		/*Von der Klasse TestScanner wird die Methode readInt bzw readDouble
		 * aufgerufen, damit man den Wert direkt in der Console implizieren
		 * kann
		 */
		int anfangskapital = TestScanner.readInt("Geben sie das Anfangskapital ein: ");
		double zinssatz = TestScanner.readDouble("Geben sie den Zinssatz ein: ");
		int jahre = TestScanner.readInt("Geben sie die Jahre ein: ");
		//Endkapital wird durch der Formel berechnet
		double endkapital = anfangskapital*Math.pow((1+(zinssatz/100)), jahre);
		System.out.println();
		//endapital wird mit jahre ausgegeben
		System.out.println("Das Endkapital nach " + jahre + " Jahren beträgt " + (int)Math.floor(endkapital));
		
	}
}

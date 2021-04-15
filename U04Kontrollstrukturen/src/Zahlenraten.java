
public class Zahlenraten {

	public static void main(String[] args) {
		//�berschrift wird ausgegeben
		System.out.println("Zahlenraten");
		System.out.println("===========");
		System.out.print("Ich habe mir eine Zahl im Intervall [0, 1000]");
		System.out.println(" ausgedacht. Versuchen Sie diese zu erraten");
		//Variable wird in der Console initialsiert
		int tipp = TestScanner.readInt("Ihr Tipp: ");
		//Computer w�hlt zuf�llig eine Zahl zwischen 0 und 1000
		int zahl = (int)(Math.random()*(0 + 1000));
		int zahl2 = zahl/2; 
		boolean erraten = false;
		/**Wird ausgegeben ob der Mensch die Zahl erraten hat oder sie zu groß/klein ist. Es wird
		 * so oft wiederholt bis der Mensch die Zahl erraten hat
		 */
		while (erraten != true) {
			if (tipp < zahl2) {
				System.out.println("Ihre Zahl ist zu klein");
				tipp = TestScanner.readInt("Ihr Tipp: ");
			}
			else if (tipp > zahl2) {
				System.out.println("Ihre Zahl ist zu groß");
				tipp = TestScanner.readInt("Ihr Tipp: ");
			}
			else {
				System.out.println("Mein Kompliment! Sie haben die Zahl gefunden");
				erraten = true;
			}
		}
	}

}

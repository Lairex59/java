
public class Weihnachtsbaum
{

	public static void main(String[] args) {
		//Varaible a sind die Anzahl der Leerzeichen und b die Anzahl der Sterne
		int a = 14;
		int b = 1;
		/**Für i, was als 1 initialisiert wurde kleiner gleich 15 ist und um 1 größer wird, werden die
		 * Anweisungen eingelesen. Diese for-Schleife dient dazu, dass der Baum ohne den Stamm 
		 * ausgegeben wird
		 */
		for (int i = 1; i<=15; i++) {
			//Methode von Leerzeichen der Variable a werden ausgegeben
			printLeerzeichen(a);
			//Methode von Sterne der Varaibale b werden ausgegeben
			printSterne(b);
			printLeerzeichen(a);
			System.out.println();
			//Variable a wird um 1 subtrahiert und b um 2 addiert
			a--;
			b += 2;
		}
		int c = 13;
		int d = 3;
		//Diese for-Schleife dient, dass man den Stamm des Baumes ausgibt
		for (int n = 1; n<=3; n++) {
			//Methode Leerzeichen der Variable c wird ausgegeben
			printLeerzeichen(c);
			//Methode Sterne der Vaiable d werden ausgegeben
			printSterne(d);
			System.out.println();
		}
	}
	//Methode dient, dass man die Leerzeichen ausgeben kann
	public static void printLeerzeichen(int anzahl) {
		for (int i = 1; i<=anzahl; i++) {
			System.out.print(" ");
		}
	}
	//Methode dient, dass man die Sterne ausgeben kann
	public static void printSterne (int anzahl) {
		for (int i = 1; i<=anzahl; i++) {
			System.out.print("*");
		}
		
	}

}

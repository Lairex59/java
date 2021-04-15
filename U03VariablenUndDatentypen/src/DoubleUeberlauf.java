
public class DoubleUeberlauf
{

	public static void main(String[] args) {
		/*Variable n mit dem Datentyp double wird implizirt. Math.pow(10, 308) nimmt den Wert 10 und  
		 * multipliziert sie 308 mal, also heißt das 10^308. Die Zahl mit der Kommastelle wird mit
		 * 10^308 multiplizert und ergibt die Variable n
		 */
		double n = 1.79769313486231570 * Math.pow(10, 308);
		int i = 1;
		/*Variable i vom Datentyp integer wird in einer Bedinung überprüft, ob sie: kleiner gleich
		 * 100000 und größer gleich 1 ist
		 */
		while(i <= 100000 && i >= 1) {
			//n wird mit n * 10^100 multipliziert und i wird um 1 erhöht
			n *= Math.pow(10, 100);
			i++;
		}
		//Ausgabe von der Variable n
		System.out.println(n);
	}

}

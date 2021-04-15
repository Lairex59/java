
public class HundertMalDouble
{

	public static void main(String[] args) {
		//Den Variablen vom Datentyp double und integer werden Werte impliziert
		double n = 0.0;
		int i = 1;
		//Solange i kleiner glech 100 ist stimmt die Bedinung und der Compiler lest die Anweisungsblöcke
		while (i <= 100) {
			//n wird um 0.1 erhöht und i um 1
			n += 0.1;
			i++;
		}
		System.out.print(n);
	}

}

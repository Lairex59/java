
public class KleinstesDouble
{

	public static void main(String[] args) {
		//Allen Variablen werden einen bestimmten Wert impliziert
		double n = 1.0;
		double o = 1.0;
		while(n <= 1.0 && n > 0.0) {
			//Man halbiert die Variabel n
			n /= 2;
			//Falls n nicht 0 ist wird die Variable o gleich n gesetzt
			if (n != 0) {
				o = n;
			}
		}
		System.out.println(o);
	}

}

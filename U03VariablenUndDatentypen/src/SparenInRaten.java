
public class SparenInRaten
{

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Sparen in Raten");
		System.out.println("===============");
		//int-,bzw double-Wert wird direkt in der Console impliziert
		int guthabenJahresanfang = TestScanner.readInt("Geben Sie das Guthaben am Jahresanfang ein: ");
		int monatsrate = TestScanner.readInt("Geben Sie die Monatsrate ein: ");
		double jahreszinssatz = TestScanner.readDouble("Geben Sie den Jahreszinssatz ein: ");
		//Neue int Variable, damit man Jahreszinsen verzinsen kann
		int i = 12;
		double gesamtzinsen = 0.0;
		while (i >= 1) {
			gesamtzinsen = gesamtzinsen + jahreszinssatz*i/12;
			//i wird um 1 subtrahiert
			i--;
		}
		//Varaiable gesamtzinsen wird halbiert
		gesamtzinsen = gesamtzinsen / 2;
		//Variable, damit man das Guthaben am Jahresende berechnen kann
		double guthabenJahresende = guthabenJahresanfang + (guthabenJahresanfang * jahreszinssatz)/100 
				+ 12*monatsrate + gesamtzinsen;
		//Guthaben am Jahresende wird in 2 dezimalstellen ausgegeben
		System.out.println("Das Guthaben am Ende des Jahre beträgt " + Math.floor(guthabenJahresende*100)/100.0);
	}

}

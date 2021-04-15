/**
 * 
 * @author Laraib
 *
 */
public class Mastermind {
	
	/**
	 * Main-Methode
	 * @param args
	 */
	public static void main(String[] args) {
		//Ausgabe Überschrift
		System.out.println("Mastermind");
		System.out.println("==========");
		//Benutzereingabe anzahl farben
		int anzahlfarben = TestScannerErweitert.readInt("Anzahl Farben: ");
		//Variablen-initialisierung
		int stop = 0;
		int anzahlstellen = 4;
		//Solange das Stop nicht ausgelöst wird, wird dieser Block immer wieder wiederholt
		while (stop == 0) {
			System.out.print("=======================> ");
			//Ermittlung eines Codes
			String code = erzeugeCode(anzahlstellen, anzahlfarben);
			//Counter für die benötigten Versuche
			int counter = 0;
			String tipp = "";
			//Solange code und tipp nicht gleich sind, werden folgende Anweisungen immer wieder wiederholt
			while(!code.equals(tipp)) {
				//Benutzereingabe des Tipps
				tipp = eingabeTipp(anzahlstellen);
				//Erhöhung des Versuchs-Counters
				counter++;
				//Ermittlung weiss
				int weiss = ermittleWeiss(code, tipp);
				//Ermittlung schwarz
				int schwarz = ermittleSchwarz(code, tipp);
				//Ausgabe an den Benutzer mit Angabe von weiss und schwarz
				System.out.print(counter+"): "+tipp+" = (w: "+weiss+", s: "+schwarz+"): ");
				/*
				 * Sollte der Benutzer "ende" eingeben, so wird "Ende" ausgegeben und das
				 * Programm wird anschließend abgebrochen.
				 */
				if (tipp.equals("ENDE")) {
					System.out.print("Ende");
					stop = 1;
					break;
				}
			}
			/*
			 * Wurde die innere while schleife abgebrochen und es wurde nicht ende eingegeben, so hat der
			 * Benutzer den Code gefunden, was dann auch ausgegeben wird
			 */
			if(!tipp.equals("ENDE")) {
				System.out.println("Code gefunden");
			}
		}
	}
	/**
	 * Liefert den zufällig ermittelten Code zurück, wobei  anstelle von Farben, Großbuchstaben 
	 * von A beginnend zurückgeliefert werden. Die Methode sorgt dafür, dass im Code keine 
	 * doppelten Buchstaben vorhanden sind. Die Methode liefert nur dann ein Ergebnis ungleich null zurück, 
	 * falls die Farbenanzahl größer oder gleich der Stellenanzahl ist.
	 * Beispiel: erzeugeCode(4,6) ergibt "ACFD"
	 * @param anzahlstelle, als Integer
	 * @param anzahlfarbe, als Integer
	 * @return den zufällig ermittelten Code als String
	 */
	public static String erzeugeCode(int anzahlstelle, int anzahlfarbe) {
		String ret = "null";
		if(anzahlfarbe >= anzahlstelle && anzahlstelle > 0 && anzahlfarbe > 0 && 
			anzahlstelle <= 26 && anzahlfarbe <= 26) {
			ret = "";
			String buchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int i = 0;
			while(i < anzahlstelle) {
				int random = (int)(Math.random()*anzahlfarbe);
				if (ret.indexOf(buchstaben.charAt(random)) == -1) {
					ret = ret + buchstaben.charAt(random);
					i++;
				}
			}
		}
		return ret;
	}
	/**
	 * Kontrolliert, ob im String Buchstaben doppelt vorkommen. Ist das der Fall, so wird true zurück geliefert. 
	 * Die Methode liefert immer dann false zurück, falls der übergebene String null oder die Länge des
	 *  Strings gleich 0 ist. Groß-/Kleinschreibung wird dabei nicht beachtet.
	 *  Beispiel: enthaeltDoppelte("ACFD") ergibt false
	 *  enthaeltDoppelte("ACAD") ergibt true
	 * @param doppelte, der zu überprüfende String
	 * @return ob doppelte enthalten sind, als boolean
	 */
	public static boolean enthaeltDoppelte (String doppelte) {
		boolean ret = false;
		if (doppelte != null && doppelte.length() > 0) {
			doppelte = doppelte.toUpperCase();
			int stelle = 0;
			while (stelle < doppelte.length()) {
				int i = 0;
				while (i < doppelte.length()) {
					if (i == stelle) {
						i++;
					}
					else {
						if (doppelte.charAt(stelle) == doppelte.charAt(i)) {
							ret = true;
							i = doppelte.length();
							stelle = doppelte.length();
						}
						i++;
					}
				}
				stelle++;
			}
		}
		return ret;
	}
	/**
	 *  Ermöglicht eine Benutzereingabe in der vorgesehenen Länge und gibt die Eingabe als String
	 *  zurück. Innerhalb der Methode wird der Text "Ihr Tipp:" ausgegeben. Die Eingabe muss wiederholt 
	 *  werden, falls der Benutzer keinen Tipp eingibt, der Tipp nicht die geforderte Länge hat und falls 
	 *  doppelte Buchstaben im Tipp vorhanden sind. Wird "ende" eingegeben, so wird die Eingabe abgebrochen 
	 *  und "Ende" wird zurückgeliefert. Außerdem wird der eingegebene Text in Großbuchstaben konvertiert 
	 *  und zurückgegeben.
	 * @param laenge, länge des einzugebenden Strings als Integer übergeben
	 * @return den eingegebenen Text als String
	 */
	public static String eingabeTipp (int laenge) {
		String ret = "";
		int stop = 0;
		while (stop == 0) {
			String eingabe = TestScannerErweitert.readString("Ihr Tipp: ");
			eingabe = eingabe.toUpperCase();
			if (eingabe.equals("ENDE")) {
				ret = eingabe;
				stop = 1;
			}
			if (eingabe != null && eingabe.length() == laenge && enthaeltDoppelte(eingabe) == false) {
				stop = 1;
				ret = eingabe;
				
			}
		}
		return ret;
	}
	/**
	 *  Ermittelt wie viele Buchstaben sich am richtigen Platz befinden, aus dem zu erratenden Code 
	 *  und der Tipp des Benutzers. Die Anzahl der richtigen Buchstaben wird zurückgelifert. 
	 *  Der übergebene Code und der Tipp müssen gefüllt sein und dieselbe Länge haben, ansonsten 
	 *  wird -1 zurück geliefert. 
	 *  Beispiel: ermittleSchwarz("ABCD","BACF") ergibt 1;
	 *  ermittleSchwarz("ABCD","EFGH") ergibt 0;
	 *  ermittleSchwarz("ABCDE","BASD") ergibt -1;
	 * @param code, welcher von erzeugeCode zufällig ermittelt wurde, als String
	 * @param tipp, welcher durch eingabeTipp vom Benutzer eingegeben wurde, als String
	 * @return anzahl der Buchstaben am richtigen Platz, als Integer
	 */
	public static int ermittleSchwarz(String code, String tipp) {
		int ret = -1;
		if(!code.isEmpty() && !tipp.isEmpty() && code.length() == tipp.length()) {
			ret = 0;
			for (int i = 0; i < code.length(); i++) {
				if (code.charAt(i) == tipp.charAt(i)) {
					ret++;
				}
			}
		}
		return ret;
	}
	/**
	 * Ermittelt die Anzahl der richtigen Buchstaben, die sich noch am falschen Platz befinden, 
	 * aus dem zu erratende Code und dem Tipp des Benutzers. Die Anzahl der Richtigen Buchstaben 
	 * wird zurückgeliefert. Der übergebene Code und der Tipp müssen gefüllt sein und dieselbe Länge haben, 
	 * ansonsten wird -1 zurück geliefert. 
	 * Beispiel: ermittleWeiss("ABCD","BACF") ergibt 2
	 * ermittleWeiss("ABCDE","BACF") ergibt -1
	 * ermittleWeiss("ABCD","EFGH") ergibt 0
	 * @param code, welcher von erzeugeCode zufällig ermittelt wurde, als String
	 * @param tipp, welcher durch eingabeTipp vom Benutzer eingegeben wurde, als String
	 * @return anzahl der richtigen Buchstaben am falschen Platz, als Integer
	 */
	public static int ermittleWeiss(String code, String tipp) {
		int ret = -1;
		if(!code.isEmpty() && !tipp.isEmpty() && code.length() == tipp.length()) {
			ret = 0;
			for (int i = 0; i < tipp.length(); i++) {
				if (code.charAt(i) != tipp.charAt(i)) {
					for (int j = 0; j < code.length(); j++) {
						if (tipp.charAt(i) == code.charAt(j)) {
							ret++;
						}
					}
				}
			}
		}
		return ret;
	}

}

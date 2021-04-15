
public class WortRatespiel {

	public static void main(String[] args) {
		// Ausgabe der Überschrift
		System.out.println("Wortratespiel");
		System.out.println("=============");
		//Variablen werden initialisiert
		boolean wiederholen = true;
		String tipp = "";
		String tippbuchstaben = "";
		String ihrwort = "";
		int counter = 0;
		//Diese Schleife so oft ausgeführt, bis der Benutzer nicht mehr will
		while (wiederholen == true) {
			//Gesuchtes Wort wird initialisiert
			String wortgesucht = TestScannerErweitert.readString("Gesuchtes Wort: ");
			wortgesucht = wortgesucht.toUpperCase();
			System.out.print("Ihr Wort:       ");
			//Für jedes Zeichen des gesuchten Worts wird ein Punkt ausgegeben 
			for (int i = 0; i < wortgesucht.length(); i++) {
				System.out.print(".");
			}
			System.out.println();
			boolean stop = false;
			//Schleife wird so oft wiederholt, bis das Wort gefunden ist
			while (stop == false) {
				//Eingabe des Tipps vom Benuter. Einzelner Buchstabe oder auch ein ganzes Wort sind möglich
				tipp = "";
				tipp = tipp + TestScannerErweitert.readString("Buchstabe/Wort: ");
				//Konvertierung zu Großbuchstaben
				tipp = tipp.toUpperCase();
				//Punkte werden ausgegeben, falls das Wort nicht gefunden wurde
				if (!tipp.equals(wortgesucht)) {
					System.out.print("Ihr Wort:       ");
					/*
					 * Wenn der eingegeben Tipp nur aus einem Buchstaben besteht, so wird dieser in der
					 * Variable tippbuchstaben gespeichert, wo auch die anderen Tipps gespeichert werden
					 */
					if (tipp.length() <= 1) {
						tippbuchstaben = tippbuchstaben + tipp;
					}
					//Initialisierung für die Punkt-Ausgabe
					boolean punkt = true;
					//Die Strings werden mithilfe des Index untersucht und jedes einzelne Zeichen einzeln angesprochen
					for (int i = 0; i < wortgesucht.length(); i++) {
						for (int j = 0; j < tippbuchstaben.length(); j++) {
							//Falls das Buchstabe gefunden ist, wird es durch ein Punkt ersetzt
							if (wortgesucht.charAt(i) == tippbuchstaben.charAt(j)) {
								ihrwort = ihrwort + tippbuchstaben.charAt(j);
								punkt = false;
							}
						}
						//Wenn die Buchstaben nicht übereinstimmen, so wird an dieser Stelle ein Punkt eingesetzt
						if (punkt == true) {
							ihrwort = ihrwort + ".";
						}
						punkt = true;
						//Ausgabe
						System.out.print(ihrwort);
						//ihrwort wird für den erneuten Durchlauf geleert
						ihrwort = "";
					}
					//Ausgabe Absatz
					System.out.println(ihrwort);
				}
				//counter zählt die benötigten Schritte
				counter++;
				if(tipp.equals(wortgesucht)) {
					//Ausgabe der Schritten
					System.out.println("Sie haben in "+counter+" Schritten das Wort erraten!");
					//Benutzereingabe ob das Programm abgebrochen werden soll oder nicht
					stop = true;
					char abbrechen = 0;
					boolean falsch = true;
					while (falsch == true) {
						abbrechen = TestScannerErweitert.readChar("Nochmal (j/n) ? ");
						//Schutz vor Falscheingaben
						if (abbrechen != 'j' && abbrechen != 'n') {
							System.out.println("Geben Sie bitte j oder n ein!");
						}
						else {
							falsch = false;
						}
					}
					System.out.println();
					/*Wenn 'n' gewählt wurde so wird wiederholen auf false gestetzt und so die 
					 * Haupt-While-Schleife abgebrochen 
					 */
					if (abbrechen == 'n') {
						wiederholen = false;
					}
					else {
						counter = 0;
						ihrwort = "";
						tipp = "";
						tippbuchstaben = "";
					}
				}
				
			}
		}

	}

}
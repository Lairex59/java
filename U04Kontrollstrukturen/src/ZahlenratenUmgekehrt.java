
public class ZahlenratenUmgekehrt {

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Zahlenraten");
		System.out.println("===========");
		System.out.print("Sucehn Sie sich eine Zahl im Intervall [0, 1000]");
		System.out.println(" aus. Ich werde sie finden");
		//Verschieden Datenypen werden initialisiert
		int zahl = 500;
		boolean erraten = false;
		//Der PC schaut ob die Zahl erraten wurde und führt das Programm weiter durch bis er die Zahl erraten hat
		while (erraten != true) {
			System.out.println("Mein Tipp: " + zahl);
			int loesung = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2)");
			//PC sucht die Zahl
			switch (loesung) {
				case 0: {
					zahl -= zahl/4;
					break;
				}
				case 1: {
					zahl += zahl/4;
					break;
				}
				case 2: {
					//Ausgabe, dass er die Zahl gefunden hat
					System.out.println("Ich habe die Zahl gefunden!");
					erraten = true;
				}
			}
		}
	}

}

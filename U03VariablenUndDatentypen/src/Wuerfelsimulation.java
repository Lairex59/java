
public class Wuerfelsimulation
{

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Würfelsimulation");
		System.out.println("================");
		System.out.println("Bitte warten");
		//Anzahl1 bis Anzahl6 ewrden mit 0 als einen integer initialisiert
		int Anzahl1 = 0;
		int Anzahl2 = 0;
		int Anzahl3 = 0;
		int Anzahl4 = 0;
		int Anzahl5 = 0;
		int Anzahl6 = 0;
		//Zählergesteurte Schleife. Diese Schleife wird genau 1000000000 durchgeführt
		for (int i = 1; i <= 1000000000; i++) {
			//Es wird durch Zufall eine Zahl zwischen 6 und 1 generiert
			int zufall = (int)((Math.random()) * 6+ 1);
			//Das ist der Ladebildschirm, der die Punkte als ein Ladebar dient
			if (i % 50000000 == 0) {
				System.out.print(".");
			}
			if (i == 1000000000) {
				System.out.println();
			}
			//Bedinung wird überprüft und die Anweisung wird jeweils um 1 erhöht, falls die Bedinung stimmt
			if (zufall == 1) {
				Anzahl1++;
			}
			if (zufall == 2) {
				Anzahl2++;
			}
			if (zufall == 3) {
				Anzahl3++;
			}
			if (zufall == 4) {
				Anzahl4++;
			}
			if (zufall == 5) {
				Anzahl5++;
			}
			if (zufall == 6) {
				Anzahl6++;
			}
						
		}
		//Ausgabe von den einzelnen zufälligen Zahlen bzw. von den gesamtwürfen
		System.out.println();
		System.out.println("Anzahl 1: "+Anzahl1);
		System.out.println("Anzahl 2: "+Anzahl2);
		System.out.println("Anzahl 3: "+Anzahl3);
		System.out.println("Anzahl 4: "+Anzahl4);
		System.out.println("Anzahl 5: "+Anzahl5);
		System.out.println("Anzahl 6: "+Anzahl6);
		System.out.println();
		System.out.println("Anzahl Würfe: " + (Anzahl1+Anzahl2+Anzahl3+Anzahl4+Anzahl5+Anzahl6));
	}

}

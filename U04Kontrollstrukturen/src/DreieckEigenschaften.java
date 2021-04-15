
public class DreieckEigenschaften
{

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Eigenschaften eines Dreiecks");
		System.out.println("============================");
		//Datentypen werden initialisert
		double hypotenuse = 0d;
		boolean nochmal = true;
		//Solagne der boolean mit dem Namen nochmal true ist wird diese Schleife so oft wiederholt bis er false ist
		while (nochmal == true) {	
			int a = TestScanner.readInt("Seite a: ");
			int b = TestScanner.readInt("Seite b: ");
			int c = TestScanner.readInt("Seite c: ");
			//Man sucht ob die eingegeben Zahlen ein unmögliches Dreieck ist
			if (c > a + b || b > a + c || a > b + c) {
				System.out.println("Unmögliches Dreieck");
			}
			else {
				double umfang = a + b + c;
				double flaeche = (1 / 4d) * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
				//Hypotenuse wird bestimmt
				if (a >= b && a >= c) {
					hypotenuse = a;
				}
				else if (c >= a && c >= b) {
					hypotenuse = c;
				}
				else {
					hypotenuse = b;
				}
				//Umfang und Fläche werden ausgegeben
				System.out.println("Umfang: " + umfang);
				System.out.println("Fläche: " + flaeche);
				//Ein Dreiecktyp wird ausgegeben
				if (a == b && b == c) {
					System.out.println("Gleichseitiges Dreieck");
				}
				else if (a == b || a == c || b == c) {
					System.out.println("Gleichschenkliges Dreieck");
				}
				else if ((boolean)(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || 
					(boolean)(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || 
					(boolean)(Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))) {
					if (Math.round(a) == a && Math.round(b) == b && Math.round(c) == c) {
						System.out.println("Pythagoreisches Dreieck");
					}
					//Hypotenuse wird ausgegeben
					System.out.println("Hypothenus: " + hypotenuse);
				}
			}
			//Falls man die gleiche Rechnung wieder holen will aber nur mit anderen oder gleichen Zahlen
			int nochmal1 = TestScanner.readInt("Nochmal (0), Beenden (1): ");
			//Wird überprüft ob der Kunde die Operation nochmal durchführen will oder nicht
			if (nochmal1 == 0) {
				nochmal = true;
			}
			else if (nochmal1 == 1) {
				nochmal = false;
			}
		}
		
	}

}

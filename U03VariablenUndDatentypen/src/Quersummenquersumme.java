
public class Quersummenquersumme
{

	public static void main(String[] args) {
		System.out.println("Quersummenquersumme");
		System.out.println("===================");
		System.out.println();
		int zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		System.out.println();
		System.out.println("Die Quersummenquersumme lautet:");
		
		//Variablen werden deklariert und initialisiert
		int i = 1;
		int zahl1 = 0;
		
		//Der Teiler für dei eingegebene Zahl wird bestimmt
		while (zahl / i > 1) {
			i = i * 10;
		}
		
		int qusumme = 0;
		
		//Dei einzelnen Zahlen werden Ausgegeben, in diesem Fall: 1+2+3+4+5
		while (zahl >= 1) {
			zahl1 = zahl / i;
			qusumme = qusumme + zahl1;
			System.out.print(zahl1);
			zahl = zahl % i;
			i = i / 10;
			if (zahl > 1) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + qusumme+" = ");
		int i2 = 1;
		int zahl2 = 0;
		while (qusumme/i2>1) {
			i2 *= 10;
		}
		int qusumme2 = 0;
		while (qusumme>=1) {
			zahl2 = qusumme/i2;
			qusumme2+=zahl2;
			System.out.print(zahl2);
			qusumme %= i2;
			i2 /= 10;
			if (qusumme>1) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = "+qusumme2);
	}
}


public class ISOLatinZeichensatz
{

	public static void main(String[] args) {
		//Variablen werden initialisert
		int i = 32;
		//Zahl und ISO Latin Zeichen werden Ausgegeben
		while (i < 256) {
			printZahl(i);
			char zeichen = (char)i;
			System.out.print(" " + zeichen);
			i++;
			//Nach jeder 8en print Zeile wird eine neue println Zeile gemacht
			if (i % 8 == 0) {
				System.out.println();
			}
		}
	}
	//Leerzeichen werden ausgegeben
	public static void printZahl(int zahl) {
		if (zahl < 10) {
			System.out.print("   " + zahl);
		}
		else {
			if (zahl < 100) {
				System.out.print("  " + zahl);
			}
			else {
				System.out.print(" " + zahl);
			}
		}
	}

}

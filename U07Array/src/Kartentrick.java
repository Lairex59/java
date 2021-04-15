
public class Kartentrick
{

	public static void main(String[] args) {

		System.out.println("Kartentrick");
		System.out.println("===========");

		do {
			int[][] karten = null;
			karten = fuellen(karten, 0);
			ausgeben(karten);
			int spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			System.out.println("Karte " + karten[3][1] + " wurde gewählt");
		} while (Character.toLowerCase(TestScannerErweitert.readChar("Nochmals (j/n)? ")) == 'j');
	}

	/**
	 * Diese Methode füllt die Karten von 1 bis 21 mit jeweils 3 Spalten zu 7 Array
	 * und je nach Plan wird die füllweise verändert
	 * 
	 * @param karten
	 *          ein 2 dimensionales Array in einer bestimmten Reihenfolge
	 * @param spalte
	 *          ist die Spalte, die vom Benutzer eingegeben wurde, um die Zahl zu
	 *          finden
	 * @return ein 2 dimensionales Array welches dieses Array gefüllt zurückgibt
	 */
	public static int[][] fuellen(int[][] karten, int spalte) {
		int[][] ret = null;

		if (spalte == 0) {

			ret = new int[7][3];

			for (int i = 0; i < ret.length; i++) {

				for (int j = 0; j < ret[i].length; j++) {

					if (j == 0) {
						ret[i][j] = i + 1;
					}
					if (j == 1) {
						ret[i][j] = i + 8;
					}
					if (j == 2) {
						ret[i][j] = i + 15;
					}
				}
			}
		} else {

			ret = new int[7][3];
			int[] helparray = new int[3];
			switch (spalte) {
				case 1: {
					helparray[0] = 2;
					helparray[1] = 0;
					helparray[2] = 1;
					break;
				}

				case 2: {
					helparray[0] = 0;
					helparray[1] = 1;
					helparray[2] = 2;
					break;
				}
				case 3: {
					helparray[0] = 1;
					helparray[1] = 2;
					helparray[2] = 0;
					break;
				}

			}
			int n = 0;
			int m = 0;
			for (int i = 0; i < helparray.length; i++) {
				for (int j = 0; j < karten.length; j++) {
					ret[n][m] = karten[j][helparray[i]];
					if (m == 2) {
						m = 0;
						n++;
					} else {
						m++;
					}
				}
			}
		}

		return ret;
	}

	/**
	 * Diese Methode gibt das eingespeicherte 2 Dimensionale Array in der Konsole
	 * aus. Falls die Zahl 2 Stellig ist gilt nur ein Leerzeichen, hingegen wenn es
	 * zum eine Einstellige Zahl handel werden 2 Leerzeichen vor der Zahl ausgegeben
	 * 
	 * @param karten
	 *          ist das 2 Diemnsionale Array, welches ausgegeben wird
	 */
	public static void ausgeben(int[][] karten) {

		for (int i = 0; i < karten.length; i++) {

			for (int j = 0; j < karten[i].length; j++) {

				if (karten[i][j] < 10) {
					System.out.print("  " + karten[i][j]);
				}

				else {
					System.out.print(" " + karten[i][j]);
				}

			}
			System.out.println();
		}

	}

}

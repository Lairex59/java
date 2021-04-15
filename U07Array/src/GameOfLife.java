
/**
 * importiert die Pakete java.awt und java.applet, damit im Applet die Klassen
 * Applet und Graphics verwendet werden k�nnen
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GameOfLife extends Applet
{
	/**
	 * Diese Methode ersetzt komplett die main Methode. Alle Aufrufe werden hier
	 * aufgerufen. Die Anzahl von Spalten und und die maximalen Schritte die Anzahl
	 * von Zeilen werden ebenfalls hier initialisert. Bzw. die intialisierung des
	 * Arrays matrix1.
	 * 
	 * @param g
	 *          ist die Zeichenfläche
	 */

	public void paint(Graphics g) {
		// Maximale Anzahl von Zeilen und Spalten
		final int ANZAHL_ZEILEN = 40;
		final int ANZAHL_SPALTEN = 40;
		// Maximale Anzahl von Iterationsschritten
		final int MAX_SCHRITTE = 150;
		boolean[][] matrix1 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		boolean[][] matrix2 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		// Variable matrix1 wird mit Leben gefüllt
		//matrix1 = fuellenMatrixZufaellig(matrix1, 0.5);
		 matrix1 = fuellenMatrixSternMitte(matrix1, 17);
		int zaehler = 0;
		/*
		 * Wiederholung der Schleife solange, Variable zaehler kleiner, als MAX_SCHRITTE
		 * und falls unterschiede zwischen matrix1 und matrix2 sind
		 */
		do {
			ausgebenMatrix(matrix1, g, ANZAHL_SPALTEN, ANZAHL_ZEILEN);
			matrix2 = cpArray(matrix1);
			matrix1 = berechneMatrix(matrix1);
			zaehler++;
			bremse(250);

		} while (zaehler < MAX_SCHRITTE && existierenUnterschiede(matrix1, matrix2));

	}

	/**
	 * Diese Methode füllt einen Muster mit einem boolean wie ein Stern. Man braucht
	 * das, damit man später im Applet ausgebene kann
	 * 
	 * @param matrix
	 *          ist das 2 Dimensionale Array
	 * @param groesse
	 *          ist die größe des Sterns
	 * @return man liefert einen 2 Dimensionalen boolschen Array zurück
	 */

	public static boolean[][] fuellenMatrixSternMitte (boolean[][] matrix, int groesse) {
		boolean[][] ret = null;

		if (groesse == 0) {
			int mitter = (matrix.length - 1) / 2;
			int mittes = (matrix[mitter].length - 1) / 2;

			ret = matrix;
			ret[mitter][mittes] = true;
		} else {
			int mitter = (matrix.length - 1) / 2;
			int mittes = (matrix[mitter].length - 1) / 2;

			ret = matrix;
			ret[mitter][mittes] = true;

			for (int i = 0; i < groesse; i++) {
				ret[mitter][mittes + i + 1] = true;
				ret[mitter + i + 1][mittes] = true;
				ret[mitter][mittes - i - 1] = true;
				ret[mitter - i - 1][mittes] = true;
			}

		}
		return ret;
	}

	/**
	 * Diese Methode gibt das Stern mit der gewünschten Größe im Applet aus. Die
	 * Rechtecke sind durch einer Linie getrennt und sind jeweils weiß, hingegen die
	 * Rechtecke um das Stern sind grau und die Rechtecke vom Stern sind schwarz
	 * 
	 * @param matrix
	 *          ist das 2 Dimensionales Array
	 * @param g
	 *          ist eine Zeichenfläche
	 * @param spalten
	 *          sind die Anzahl der Splaten, der Rechtecke
	 * @param zeilen
	 *          sind die Anzahl der Zeilen, der Rechtecke
	 */
	public void ausgebenMatrix(boolean[][] matrix, Graphics g, int spalten, int zeilen) {
		int breite = getWidth();
		int hoehe = getHeight();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == false) {
					g.setColor(Color.gray);
				}

				else {
					g.setColor(Color.black);
				}
				g.fillRect((breite / spalten) * j, (hoehe / zeilen) * i, breite / spalten + 1, hoehe / zeilen + 1);
				g.setColor(Color.white);
				g.drawLine((breite / spalten) * j, 0, (breite / spalten) * j, hoehe);
			}
			g.setColor(Color.white);
			g.drawLine(0, (hoehe / zeilen) * i, breite, (hoehe / zeilen) * i);
		}
	}

	/**
	 * Diese Methode berechnet alle Anzahl der Lebenden Nachbaren im Applet.
	 * 
	 * @param matrix
	 *          ist der zu übergebenden Array
	 * @param spalte
	 *          ist die Anzahl der Spalten
	 * @param zeile
	 *          ist die Anzahl der Zeilen
	 * @return liefert einen Int zurück, welches alle Anzahl Lebenden Nachbaren
	 *         zählt zurück
	 */
	public static int anzahlLebendeNachbaren(boolean[][] matrix, int zeile, int spalte) {
		int ret = 0;
		if (zeile == 0) {
			if (spalte == 0) {
				if (matrix[zeile + 1][spalte]) {
					ret++;
				}
				if (matrix[zeile + 1][spalte + 1]) {
					ret++;
				}
				if (matrix[zeile][spalte + 1]) {
					ret++;
				}
			} else {
				if (spalte == matrix[0].length - 1) {
					if (matrix[zeile][spalte - 1]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte - 1]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte]) {
						ret++;
					}
				} else {
					if (matrix[zeile][spalte - 1]) {
						ret++;
					}
					if (matrix[zeile][spalte + 1]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte - 1]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte + 1]) {
						ret++;
					}
				}
			}
		} else {
			if (zeile == matrix.length - 1) {
				if (spalte == 0) {
					if (matrix[zeile - 1][spalte]) {
						ret++;
					}
					if (matrix[zeile - 1][spalte + 1]) {
						ret++;
					}
					if (matrix[zeile][spalte + 1]) {
						ret++;
					}
				} else {
					if (spalte == matrix[0].length - 1) {
						if (matrix[zeile - 1][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile - 1][spalte]) {
							ret++;
						}
						if (matrix[zeile][spalte - 1]) {
							ret++;
						}
					} else {
						if (matrix[zeile - 1][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile - 1][spalte]) {
							ret++;
						}
						if (matrix[zeile - 1][spalte + 1]) {
							ret++;
						}
						if (matrix[zeile][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile][spalte + 1]) {
							ret++;
						}
					}
				}
			} else {
				if (spalte == 0) {
					if (matrix[zeile - 1][spalte]) {
						ret++;
					}
					if (matrix[zeile - 1][spalte + 1]) {
						ret++;
					}
					if (matrix[zeile][spalte + 1]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte]) {
						ret++;
					}
					if (matrix[zeile + 1][spalte + 1]) {
						ret++;
					}
				} else {
					if (spalte == matrix[0].length - 1) {
						if (matrix[zeile - 1][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile - 1][spalte]) {
							ret++;
						}
						if (matrix[zeile][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile + 1][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile + 1][spalte]) {
							ret++;
						}
					} else {
						if (matrix[zeile - 1][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile - 1][spalte]) {
							ret++;
						}
						if (matrix[zeile - 1][spalte + 1]) {
							ret++;
						}
						if (matrix[zeile][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile][spalte + 1]) {
							ret++;
						}
						if (matrix[zeile + 1][spalte - 1]) {
							ret++;
						}
						if (matrix[zeile + 1][spalte]) {
							ret++;
						}
						if (matrix[zeile + 1][spalte + 1]) {
							ret++;
						}
					}
				}
			}
		}
		return ret;
	}

	/**
	 * Diese Methode verwendet die vorige Methode, um einen neuen Lebenszyklus für
	 * die ihr übergebene Matrix zu berechnen. Das neu berechnete Leben wird in
	 * einer neuen Matrix zurück geliefert. Dabei wird die alte Matrix nicht
	 * geändert. Nebenstehend sehen Sie vier Lebenszyklen die aufeinanderfolgend
	 * entstehen.
	 * 
	 * @param matrix1
	 *          ist der einzulesende 2 Dimensionale Array
	 * @return gibt einen 2 Dimensionalen Array zurück. Dieses Array ist ein
	 *         boolean. Falls die anzahl der benachbarten Lebende Feldern kleiner
	 *         als 2 oder größer als 3 ist liefert die Methode false zurück. In
	 *         allen anderen Fällen liefert die Methode true zurück
	 */
	public static boolean[][] berechneMatrix(boolean[][] matrix1) {
		boolean[][] ret = new boolean[matrix1.length][matrix1[0].length];
		boolean feld = true;
		int anzahl = 0;

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {

				feld = matrix1[i][j];
				anzahl = anzahlLebendeNachbaren(matrix1, i, j);

				if (feld == true) {
					if (anzahl < 2 || anzahl > 3) {
						ret[i][j] = false;
					} else {
						ret[i][j] = true;
					}
				} else {
					if (anzahl == 3) {
						ret[i][j] = true;
					}
				}
			}
		}
		return ret;
	}

	/**
	 * Diese Methode kontrolliert ob die beiden übergebenen Matrizen unterschiedlich
	 * sind oder nicht.
	 * 
	 * @param matrix1
	 *          ist der erste zu untersuchende 2 Dimensionales boolsches Array
	 * @param matrix2
	 *          ist der zweite zu untersuchende 2 Dimesnionale boolsches Array
	 * @return liefert true zurück, falls die Matrizen an unterschiedlicher Stellen
	 *         gefüllt sind
	 */
	public static boolean existierenUnterschiede(boolean[][] matrix1, boolean[][] matrix2) {
		boolean ret = false;
		int f = 0;
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix2[i].length; j++) {
					if (matrix1[i][j] != matrix2[i][j]) {
						f++;
					}
				}
			}
			if (f > 0) {
				ret = true;
			}
		}
		return ret;
	}

	/**
	 * Veranlasst dass das Programm millis Millisekunden pausiert
	 * 
	 * @param millis
	 *          Anzahl der Millisekunden die gewartet werden
	 */
	public void bremse(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}
	}

	/**
	 * Diese Methode fuellt Leben Zufaellig. Der Benutze kann entscheiden wie viel
	 * er Leben fuellen will. Z.B. das Verhaeltnis 0.1 beduetet, dass Leben mit 10%
	 * gefüllt werden soll
	 * 
	 * @param matrix
	 *          ist der zu untersuchende 2 Dimensionale boolsches Array
	 * @return ist ein 2 Dimensionales boolsches Array
	 */
	public static boolean[][] fuellenMatrixZufaellig(boolean[][] matrix, double prozent) {
		boolean[][] ret = new boolean[matrix.length][matrix[1].length];
		int anzahl = 0;
		prozent = prozent * matrix.length * matrix[1].length;
		while (anzahl < prozent) {
			int x = (int) (Math.random() * 1000) % matrix.length;
			int y = (int) (Math.random() * 1000) % matrix[1].length;
			if (ret[x][y] == false) {
				ret[x][y] = true;
				anzahl++;
			}
		}
		return ret;
	}

	/**
	 * Kopiert ein zweidimmensionales Array und gibt die Kopie anschließend zurück
	 * 
	 * @param matrix,
	 *          das zu kopierende, zweidimmensionale Array @return, die Kopie
	 */
	public static boolean[][] cpArray(boolean[][] matrix) {
		boolean[][] ret = new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				ret[i][j] = matrix[i][j];
			}
		}
		return ret;
	}
	
}

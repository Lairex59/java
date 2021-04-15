
public class TestArray
{
	/**
	 * Diese Main Methode ruf allte Methoden auf
	 * und gibt sie ausschließlich mit einer
	 * Bildschirmausgabe aus.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] a = randomIntArray(5, -5, 20);
		printIntArray("a = ", a);
		System.out.println("\nMinimum: "+getMinimum(a));
		System.out.println("Maximum: "+getMaximum(a));
		System.out.println("Mittelwert: "+getMittelwert(a));
		System.out.println("IndexOf: "+indexOf(a, 5));
		System.out.println("IndexOf: "+indexOf(a, 5, 3));
		a = randomIntArray(5, 1, 10);
		printIntArray("a = ", a);
		System.out.println("\nGetMinPos: "+getMinPos(a, 2));
		addZahl(a, 100);
		printIntArray("a + 100 = ", a);
		
		a = randomIntArray(3, 1, 10);
		printIntArray("\na = ", a);
		swap(a, 0, 2);
		printIntArray("\nSwap = ", a);
		
		a = randomIntArray(50, 1, 10000);
		sortMinArray(a);
		printIntArray("\nSortiert = ", a);
		
		a = randomIntArray(50, 0, 10);
		printIntArray("\na = ", a);
		a = delDoppelte(a);
		printIntArray("\ndeldoppelte = ", a);



	}
	/**
	 * In dieser Methode gibt die zufälligen Zahlen im Bereich der angegebenen 
	 * Parameter in der Java Notation.
	 * Z.b: printIntArray("a = ", a); ergibt a = {4, 12, 0, -2, 8}
	 * 
	 * @param msg ist der Text, welches Ausgegeben wird im Int Array
	 * @param a das auszugebene Int Array
	 */
	public static void printIntArray(String msg, int[] a) {
		System.out.print(msg);
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
	
	/**
	 * Diese Mehtdoe erstellt einen Array des Datentypes Intger und füllt diese
	 * mit zufälligen Zahlen, die der Benutzer selbst eingegeben hat, im Bereich
	 * von --> bis
	 * 
	 * @param anzahl ist die Länge der Elemente des Int-Array
	 * @param von ist der Anfangsbereich
	 * @param bis
	 * @return
	 */
	public static int[] randomIntArray (int anzahl, int von, int bis){
		int[] ret = new int [anzahl];
		von--;
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (int)(Math.random() * (bis-von+1)+von);
		}
		
		return ret;
	}
	/**
	 * Diese Methode Ermittelt die größte Zahl in dem
	 * Int-Array. Z.b. a = {0, -2, 11, 12, 14} ergibt 14
	 * 
	 * @param a ist das untersuchende Int-Array
	 * @return gibt das kleinste Array zurück
	 */
	public static int getMaximum (int[] a) {
		int ret = -1;
		
		for (int i = 0; i < a.length; i++) {
			ret = ret - a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > ret) {
				ret = a[i];
			}
		}
		
		return ret;
	}
	
	/**
	 * Diese Methode Ermittelt die kleinste Zahl in dem
	 * Int-Array. Z.b. a = {0, -2, 11, 12, 14} ergibt -2
	 * 
	 * @param a ist das untersuchende Int-Array
	 * @return gibt das größte Array zurück;
	 */
	public static int getMinimum (int[] a) {
		int ret = -1;
		
		for (int i = 0; i < a.length; i++) {
			ret = ret + a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < ret) {
				ret = a[i];
			}
		}
		
		return ret;
	}
	/**
	 * Es ermittelt den Mittelwert der Zahlen im 
	 * Int-Array. Z.b. a = {-4, 16, 0, 14, 6} ergibt
	 * 6.4
	 * 
	 * @param a ist das untersuchende Int-Array
	 * @return gibt das Mittelwert zurück
	 */
	
	public static double getMittelwert(int[] a) {
		double ret = 0.0;
		
		for (int i = 0; i < a.length; i++) {
			ret = ret + a[i];
		}
		ret = ret / a.length;
		return ret;
	}
	/**
	 * Ermittelt an welcher Position die parameter
	 * Zahl z im Int-Array mit der Variablenname
	 * a steht. Falls es mehrere Zahlen die gleich
	 * z sind, dann wird das erste mal, wenn diese
	 * Zahl vorkommt, dessen Position genommen.
	 * Z.b: indexOf(a, 11)
	 * a = {8, 11, 9, 17, 16} ergibt 1. Falls
	 * die Zahl nicht vorkommt wird -1 zurückgeliefert
	 * 
	 * @param a ist das untersuchende Array
	 * @param z ist die Zahl die der Benutzer eingegeben hat
	 * die gefunden werden soll
	 * @return gibt die Position der Zahl zurück, falls diese
	 * Zahl nicht gefunden werden konnte wird -1 zurückgeliefert
	 */
	
	public static int indexOf(int[] a, int z) {
		int ret = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (z == a[i]) {
				ret = i;
				i = a.length;
			}
		}
		
		return ret;
	}
	
	/**
	 * Ermittelt die Stelle wo die eingegebene Zahl
	 * des Benutzers, der an der gewünschten Stelle
	 * anfängt. Falls die Zahl nicht gefunden werden kann
	 * wird -1 ausgegegeben. 
	 * Z.b. indexOf(a, 5, 3) 
	 * a = {5, 7, 15, 13, 12, 0, 8, -5, 6, 9, 11, 3, 1, 18, 7, 12, 0, 10, 4, 4}
	 * ergibt -1
	 * 
	 * @param a der zu untersuchende Array
	 * @param z die Zahl die gefunden werden soll
	 * @param pos die Stelle wo begonne werden soll zu suchen
	 * @return gibt die Position zurück wo die Zahl befindet,
	 * falls Sie nicht gefunden werden kann wird -1 zurückgeliefert
	 */
	public static int indexOf(int[] a, int z, int pos) {
		int ret = -1;
		
		for (int i = pos; i < a.length; i++) {
			if (z == a[i]) {
				ret = i;
				i = a.length;
			}
		}
		
		return ret;
	}
	
	/**
	 * Sucht an der gewücnschten Stelle die
	 * kleinste Zahl, die es im Array a gibt
	 * Z.b. indexOf(a, 2)
	 * a = {5, 7, 2, 10, 3} ergibt 2
	 * 
	 * 
	 * @param a der zu untersuchende Array
	 * @param pos die Position wo es startet zu suchen
	 * @return gibt die Stelle zurück an welcher die kleinste Zahl
	 * von pos gestartet ist
	 */
	public static int getMinPos(int[] a, int pos) {
		int ret = -1;
		int num = 0;

		for (int i = pos; i < a.length; i++) {
			num = num + a[i];
		}
		for (int i = pos; i < a.length; i++) {
			if(a[i] < num) {
				num = a[i];
			}
		}
		ret = indexOf(a, num, pos);
		
		return ret; 
	}
	
	/**
	 * Diese Methode addiert die Zahl z zu jedes
	 * Element des Int-Arrays a hinzu.
	 * Z.b. addZahl(a, 100);
	 * a + 100 = {105, 102, 103, 100, 105, 100, 104, 106, 100, 105}
	 * 
	 * @param a untersuchender Array
	 * @param z der addierende Wert
	 */
	public static void  addZahl(int[] a, int z) {
		for (int i = 0; i < a.length; i++) {
			a[i] += z;
		}
	}
	
	/**
	 * Vertauscht das Element an der Stelle
	 * i mit das Element an der Stelle j im Array.
	 * Z.b. a + 100 = {100, 108, 104}
	 * swap = {104, 108, 100}
	 * 
	 * @param a untersuchender Array
	 * @param i Zahl an der Position im Array
	 * @param j andere Zahl an der Position im Array
	 */
	public static void swap (int[] a, int i, int j) {
		int hilfe = a[i];
		a[i] = a[j];
		a[j] = hilfe;
	}
	
	/**
	 * Sortiert alle Zahlen im Int-Array
	 * von der Größe nach.
	 * Z.b. sortMinArray(a); ergibt
	 * Sortiert = {25, 420, 720, 1186}
	 * 
	 * @param a
	 */
	public static void sortMinArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int pos = getMinPos(a, i);
			swap(a, i, pos);
		}
	}
	
	/**
	 * Gibt alle Zahlen aus, die in deisem Array
	 * vorkommen, jedoch falls diese die gleiche Zahl
	 * mehr als einmal vorkommt wird sie gelöscht,
	 * sodass diese Zahl nur einmal vorkommt
	 * 
	 * @param a der zu untersuchende Array des
	 * Datentyps Integer
	 * @return gibt das richtig erzeugte Array in der
	 * Java Notation aus
	 */
	public static int [] delDoppelte(int[] a) {
		int [] ret = null;
		int [] help = new int [a.length];
		for (int i = 0; i < a.length; i++) {
			help[i] = a[i];
		}
		sortMinArray(help);
		int counter = 0;
		for (int i = 0; i < help.length-1; i++) {
			if (help[i] == help[i+1]) {
				counter++;
			}
		}
		ret = new int[help.length-counter];
		int stelle = 0;
		for (int i = 0; i < help.length-1; i++) {
			if (help[i] != help[i+1]) {
				ret[stelle] = help[i];
				stelle++;
			}
		}
		if(stelle < ret.length) {
			ret[stelle] = help[help.length-1];
		}
		int [] indizes = new int [ret.length];
		for (int i = 0; i < indizes.length; i++) {
			indizes[i] = indexOf(a, ret[i]);
		}
		sortMinArray(indizes);
		for (int i = 0; i < ret.length; i++) {
			ret [i] = a[indizes[i]];
		}
		return ret;
	}
}

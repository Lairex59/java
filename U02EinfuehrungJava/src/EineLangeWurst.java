
public class EineLangeWurst
{

	public static void main(String[] args) {
		//Vorbestimmte Variablen werden eingegeben
		int i = 0;
		int n = 60;
		//Das Wort "Ergebnis" wird asugegeben
		System.out.println("Ergebnis");
		//Solange i kleiner gleich n ist lest der Compiler die nächsten Anweisungen
		while (i <= n) {
			if (i % 7 == 5) {
				System.out.println(i);
			}
			i++;
		}
	}
}
//Uebung Nr. 7: Beide Dateien sind gleich groß

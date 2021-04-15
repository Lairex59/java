	
public class ZeichensatzAnalyse
{
	
	public static void main(String[] args) {
		
		System.out.println("isLetter");
		//Variable wird initialisert
		int n = 0;
		//Gibt alle Buchstaben aus, indem nach jede 30e Buchstabe eine neue Zeile ausgegeben wird 
		for (int i = 32; i < 256; i++) {	
			char zeichen = (char)i;
			if (Character.isLetter(zeichen)) {
				System.out.print(zeichen + " ");
				n++;
			}
			if (n  == 30) {
				System.out.println();
				n = 0;
			}
		}
		n = 0;		
		System.out.println();
		//Gibt alle Zahlen aus, indem nach jede 30e Buchstabe eine neue Zeile ausgegeben wird
		System.out.println("isDigit");
		for (int i = 32; i < 256; i++) {
			char zeichen = (char)i;
			if (Character.isDigit(zeichen)) {
				System.out.print(zeichen + " ");
				n++;
			}
			if (n  == 30) {
				System.out.println();
				n = 0;
			}
		}
		n = 0;
		System.out.println();
		/*Gibt alle Leerzeichen durch die ISO Latin Zeichensatz Zahl aus, indem nach jede 30e Buchstabe eine neue 
		 * Zeile ausgegeben wird
		 */
		System.out.println("isWhitesapce");
		for (int i = 32; i < 256; i++) {
			char zeichen = (char)i;
			if (Character.isWhitespace(zeichen)) {
				System.out.println(i);
				n++;
			}
			if (n  == 30) {
				System.out.println();
				n = 0;
			}
		}
		
		n = 0;
		//Gibt alle kleinuchstaben aus, indem nach jede 30e Buchstabe eine neue Zeile ausgegeben wird
		System.out.println("isLowerCase");
		for (int i = 32; i < 256; i++) {
			char zeichen = (char)i;
			if (Character.isLowerCase(zeichen)) {
				System.out.print(zeichen + " ");
				n++;
			}
			if (n  == 30) {
				System.out.println();
				n = 0;
			}
		}
		n = 0;
		System.out.println();
		//Gibt alle großuchstaben aus, indem nach jede 30e Buchstabe eine neue Zeile ausgegeben wird
		System.out.println("isUpperCase");
		for (int i = 32; i < 256; i++) {
			char zeichen = (char)i;
			if (Character.isUpperCase(zeichen)) {
				System.out.print(zeichen + " ");
				n++;
			}
			if (n  == 30) {
				System.out.println();
				n = 0;
			}
		}
	}
}

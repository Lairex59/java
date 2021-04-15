
public class Teiler
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//z wird über der Kommando schleife als eine beliebige Zahl eingegeben und t wird als 1 eingegeben
		int z = Integer.parseInt(args[0]);
		int t = 1;
		//Ausgegeben wird: Die Teiler von z sind:
		System.out.print("Die Teiler von " + z + " sind: ");
		//Solange t kleiner gleich z ist geht man in die Schleife hinein und das Programm liest sie
		while (t <= z) {
			//Falls der Rest von z / t 0 ist, wird der Inhalt der Schleife gelesen
			if (z % t == 0) {
				//t wird ausgegben
				System.out.print(t + " ");
			}
			//t wird nach der if Schleife um 1 erhöht
			t++;
		}
	}
}

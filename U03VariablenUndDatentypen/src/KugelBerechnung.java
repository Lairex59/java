
public class KugelBerechnung
{

	public static void main(String[] args) {
		//Überschrift wird ausgegeben
		System.out.println("Kugelberechnung");
		System.out.println("===============");
		//Methode readDouble wird aufgerufen und somit kann man den Double-Wert in der Console implizieren
		double radius = TestScanner.readDouble("Geben sie den Radius der Kugel ein : ");
		System.out.println();
		//Formel für Umfang der Kugel
		System.out.println("Der Umfang der Kugel beträgt: " + 2*radius*Math.PI);
		//Formel für Oberfläche der Kugel
		System.out.println("Die Oberfläche der Kugel beträgt: " + 4*Math.PI*Math.pow(radius, 2));
		//Formel für Volumen der Kugel
		System.out.println("Das Volumen der Kugel beträgt: " + (4*Math.PI)/3*Math.pow(radius, 3));
	}

}


public class Auto
{
	// Globale deklaration
	private String marke;
	private int reifen;
	private double kW;

	public static void main(String[] args) {
		// Referenz ersetellen
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		// Initialisieren der Marken
		a1.marke = "Audi";
		a2.marke = "Porsche";
		// Initialisieren der Reifen
		a1.reifen = 4;
		a2.reifen = 5;
		// Initialisieren des Kilo Watts
		a1.kW = 150.;
		a2.kW = 200.;
		//Ausgabe der PS von den beiden Autos
		System.out.println(a1.getPS());
		System.out.println(a2.getPS());

	}
	/**
	 * Berechnet den PS der beiden Autos
	 * indem es mit 1.36 multipliziert
	 * z.B. 200 * 1,36
	 * 
	 * @return gibt den PS-Wert als double zurück
	 */
	public double getPS() {
		double ret = 0.0;

		ret = kW * 1.36;

		return ret;
	}

}

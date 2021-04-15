
public class Quadrat
{
	private double seiteA;

	/**
	 * Liefert die seiteA zurück
	 * 
	 * @return gibt die seiteA zurück
	 */
	public double getSeiteA() {
		return seiteA;
	}

	/**
	 * Setzt die Membervariable seiteA, falls
	 * sie größer oder gleich 0 ist. Ansonsten
	 * wird die Membervariable seiteA als 
	 * 0 gesetzt
	 * 
	 * @param seiteA die zu setzende Seite
	 */
	public void setSeiteA(double seiteA) {
		final double EPSILON = 1E-10;
		
		if (Math.abs(this.seiteA - seiteA) < EPSILON) {
			this.seiteA = seiteA;
		} else {
			this.seiteA = 0;
		}
		
	}
	
	/**
	 * Liefert die seiteA zurück
	 * 
	 * @return die zurückliefernde seiteA
	 */
	
	public double getSeiteB() {
		return seiteA;
	}
	
	/**
	 * Setzt die Membervariable seiteB, falls
	 * sie größer oder gleich 0 ist, ansonsten
	 * wird sie als 0 gesetzt
	 * 
	 * @param seiteB die zu setzende Seite
	 */
	public void setSeiteB(double seiteB) {
			this.seiteA = seiteB;
	}
	
	/**
	 * Berechnet den Umfang und
	 * liefert den zurück
	 * 
	 * @return berechnet den Umfang
	 */
	public double getUmfang() {
		return 4*seiteA;
	}
	
	/**
	 * Setzt den Umfang falls er
	 * größer gleich als 0 ist.
	 * Ansonsten wird die Membervariable
	 * als 0 reinitialisert;
	 * 
	 * @param umfang der zu setzende Umfang
	 */
	public void setUmfang(double umfang) {
		this.seiteA = umfang/4;
	}
	
	/**
	 * Berechnet die Fläche des
	 * Quadrates
	 * 
	 * @return die zurückgebende Fläche
	 */
	public double getFlaeche() {
		return Math.pow(seiteA, 2);
	}
	
	/**
	 * Setzt die Fläche falls Sie größer 
	 * oder gleich 0 ist, ansonsten wird sie
	 * als 0 gesetzt
	 * 
	 * @param flaeche die zu setzende Fläche
	 */
	public void setFlaeche(double flaeche) {
			this.seiteA = Math.sqrt(flaeche);
	}
	
	/**
	 * Vergleicht das erste Objekt mit den
	 * in den Parameter geschriebenen Objekt
	 * Falls das Objekt gleich ist wird true
	 * ausgegeben, hingegen ist das übergebene
	 * Objekt null wird false ausgegeben
	 * 
	 * @param obj der zu vergleichende Objekt
	 * @return true falls das Objekt gleich ist,
	 * hingegen wenn es null oder anders ist wird false
	 * zurückgeliefert
	 */
	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		
		if (this == obj)
			ret = true;
		if (obj == null)
			ret = false;
		if (getClass() != obj.getClass())
			ret = false;
		Quadrat other = (Quadrat) obj;
		if (Double.doubleToLongBits(seiteA) != Double.doubleToLongBits(other.seiteA))
			ret = false;
		return ret;
	}
	
	/**
	 * Speichert alle Seiten, Fläche und Umfang
	 * in einem String ein
	 * 
	 * @return wird ein String mit allen Seiten, Fläche
	 * und Umfang zurückgeliefert
	 */
	@Override
	public String toString() {
		return "a = " + getSeiteA() + ", b = " + getSeiteB() + ", U = " + getUmfang()
				+ ", F = " + getFlaeche();
	}
	
	/**
	 * Diese Methode klont die Klasse Quadrat
	 * 
	 * @return die zurückliefernde Klasse
	 */
	public Quadrat clone() {
		Quadrat ret = new Quadrat();
		ret.setSeiteA(this.seiteA);
		return ret;
	}
	
	/**
	 * Vergleicht die Klassen mit der Unicode
	 * Tabelle. Ist die Membervariable this.seiteA
	 * kleiner als die von den Parameter übergebene
	 * Klasse Membervariable seiteA, wird -1 zurückgeliefert.
	 * Im umgekehrten Falle wird 1 zurückgeliefert, sind sie gleich
	 * wird 0 als initialisierter Wert zurückgeliefert
	 * 
	 * @param q1 die zu vergleichende Klasse 
	 * @return ein int, falls this.seiteA größer ist als
	 * q1.seiteA, oder 1 im umgekehrten Falle, oder 0 falls
	 * sie gleich sind
	 */
	public int compareTo(Quadrat q1) {
		int ret = 0;
		
		if (this.seiteA < q1.seiteA) {
			ret = -1;
		} else if (this.seiteA > q1.seiteA) {
			ret = 1;
		}
		
		return ret;
	}
	
}

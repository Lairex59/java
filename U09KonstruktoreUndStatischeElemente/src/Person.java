	
public class Person
{
	//Statische Klassenvaribale
	private static int naechsteAnzahl;
	//Private Memberkonstante
	private final int anzahl;
	//Private Membervariablen
	private String vorname;
	private String nachname;
	private boolean weiblich;
	private Person mutter;
	private Person vater;
	
	

	/**
	 * Dieser Custom-Constructor erzeugt ein Objekt vom Typ
	 * Person und setzt es auf diese Eigesnchaften: 
	 * vorname = String
	 * nachname = String
	 * weiblich = boolean
	 * anzahl = int
	 * 
	 * @param vorname der zu setzende String
	 * @param nachname der zu setzende String
	 * @param weiblich der zu setzende boolean
	 */
	public Person(String vorname, String nachname, boolean weiblich) {
		this.anzahl = naechsteAnzahl;
		this.vorname = vorname;
		this.nachname = nachname;
		this.weiblich = weiblich;
		naechsteAnzahl++;
	}
	
	public Person(String vorname, String nachname, boolean weiblich, Person mutter, Person vater) {
		this(vorname, nachname, weiblich);
		this.setMutter(mutter);
		this.setVater(vater);
	}
	
	public Person(Person p) {
		this(p.vorname, p.nachname, p.weiblich);
		this.vater = null;
		this.mutter = null;
	}

	/**
	 * @return the naechsteAnzahl
	 */
	public static int getNaechsteAnzahl() {
		return naechsteAnzahl;
	}

	/**
	 * @param naechsteAnzahl the naechsteAnzahl to set
	 */
	public static void setNaechsteAnzahl(int naechsteAnzahl) {
		Person.naechsteAnzahl = naechsteAnzahl;
	}

	/**
	 * @return the anzahl
	 */
	public int getAnzahl() {
		return anzahl;
	}

	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param vorname the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param nachname the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * @return the weiblich
	 */
	public boolean isWeiblich() {
		return weiblich;
	}

	/**
	 * @param weiblich the weiblich to set
	 */
	public void setWeiblich(boolean weiblich) {
		this.weiblich = weiblich;
	}
	
	/**
	 * @return the mutter
	 */
	public Person getMutter() {
		return mutter;
	}

	/**
	 * @param mutter the mutter to set
	 */
	public void setMutter(Person mutter) {
		if (mutter.weiblich == true) {
			this.mutter = mutter;
		}
	}

	/**
	 * @return the vater
	 */
	public Person getVater() {
		return vater;
	}

	/**
	 * @param vater the vater to set
	 */
	public void setVater(Person vater) {
		if (vater.weiblich == false) {
			this.vater = vater;
		}
	}
	
	/**
	 * @return Vor- und Nachname
	 */
	public String getName() {
		return this.vorname + " " + this.nachname;
	}
	
	/**
	 * @return liefert alle Membervariablen in einem String zurück
	 */
	public String toString() {
		String mutter;
		String vater;
		if (this.getMutter() == null) {
			mutter = "null";
		} 
		else {
			mutter = this.getMutter().getName();
		}
		if (this.getVater() == null) {
			vater = "null";
		} 
		else {
			vater = this.getVater().getName();
		}
		return this.getAnzahl() + ": " + this.getName() + " w = " + this.isWeiblich() + " m = " +
		mutter + " v = " + vater;
	}
	
	/**
	 * Gibt die Eltern einer Person, als Personen-Objekt in einem Person-Array zurück
	 * @return liefert einen Personen-Array mit den Person-Objekten der Eltern der Person
	 */
	public Person[] getEltern() {
		Person[] ret = new Person[2];
		
		ret[0] = new Person(this.getMutter());
		ret[1] = new Person(this.getVater());
		
		return ret;
	}
	
	/**
	 * Liefert die Großeltern einer Person, als Person-Objekt in einem Person-Array zurürck
	 * @return Person-Array, mit den Personen-Objekten der Großeltern der Person
	 */
	public Person[] getGrosseltern() {
		Person[] ret = new Person[4];
		if (this.getMutter() != null && this.getMutter().getMutter() != null) {
			ret[0] = new Person(this.getMutter().getEltern()[0]);
		}
		if (this.getMutter() != null && this.getMutter().getMutter() != null) {
			ret[1] = new Person(this.getMutter().getEltern()[1]);
		}
		if (this.getVater() != null && this.getVater().getVater() != null) {
			ret[2] = new Person(this.getVater().getEltern()[0]);
		}
		if (this.getVater() != null && this.getVater().getVater() != null) {
			ret[3] = new Person(this.getVater().getEltern()[1]);
		}
		return ret;
	}
	
	/**
	 * Diese Methode liefert alle Vorfahren einer Person als String zurück.
	 * Durch "\n" zeilenweise getrennt
	 * @return String aller Vorfahren der Person
	 */
	public String getListe() {
		String	ret = this.toString() + "\n";
		if (this.getMutter() != null) {
			ret += this.getMutter().getListe();
		}
		
		if (this.getVater() != null) {
			ret += this.getVater().getListe();
		}
		return ret;
	}
}

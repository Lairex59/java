
public class Song
{
	private String titel;
	private String interpret;
	private String album;
	private int erscheinungsjahr;
	
	/**
	 * @return the titel
	 */
	public String getTitel() {
		return titel;
	}
	/**
	 * @param titel the titel to set
	 */
	public void setTitel(String titel) {
		this.titel = titel;
	}
	/**
	 * @return the interpret
	 */
	public String getInterpret() {
		return interpret;
	}
	/**
	 * @param interpret the interpret to set
	 */
	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return the erscheinungsjahr
	 */
	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	/**
	 * @param erscheinungsjahr the erscheinungsjahr to set
	 */
	public void setErscheinungsjahr(int erscheinungsjahr) {
		if (erscheinungsjahr < 0) {
			this.erscheinungsjahr = 0;
		}
		else {
			this.erscheinungsjahr = erscheinungsjahr;
		}
		
	}
	
	/**
	 * Die equals Methode kontrolliert ob der
	 * aufzurufende Song mit dem zu vergleichenden
	 * Objekt übereinstimmt. Dabei werden alle
	 * unterschiedlich verglichen
	 * 
	 * @param obj der zu untersuchende Objekt
	 * @return liefert einen boolean zurück, false,
	 * wenn die Objekten ungleich sind, ansonsten true
	 */
	public boolean equals(Object obj) {
		boolean ret = false;
		
		if (obj instanceof Song) {
			Song s = (Song) obj;
			if (s.getTitel().equals(this.getTitel())) {
				if (s.getInterpret().equals(this.getInterpret())) {
					if (s.getAlbum().equals(this.getAlbum())) {
						if (s.getErscheinungsjahr() == this.getErscheinungsjahr()) {
							ret = true;
						}
					}
				}
			}
		}
		return ret;
	}
	
	/**
	 * Diese Methode vergleicht der aufzurufende
	 * Song mit der in den paramtern stehenden, 
	 * ob es größer oder kleiner ist. Es berechnet
	 * dabei durch der Unicode Tabelle einzeln durch mit
	 * dem Aufruf compareTo. Erster wird das Interpret, nachher 
	 * das Album und zuletzt das Titel verglichen.
	 * 
	 * @param song der zu untersuchende Objekt
	 * @return liefert 1 zurürck wenn der aufrufende Song
	 * größer ist, als der Parameter Song, im umgekehrten Falle liefert
	 * es -1 zurück und falls beide Objekte gleich sind liefert die Methode 0 zurürck
	 */
	public int comapreTo (Song song) {
		int ret = 0;
		
		int value = 0;
		
		if (this.getInterpret().compareTo(song.getInterpret()) == 0) {
			if (this.getAlbum().compareTo(song.getAlbum()) == 0) {
				if (this.getTitel().compareTo(song.getTitel()) == 0) {
					ret = 0;
				} 
				else {
					value = this.getTitel().compareTo(song.getTitel());
					if (value < 0) {
						ret = -1;
					} 
					else {
						ret = 1;
					}
				}
			} 
			else {
				value = this.getAlbum().compareTo(song.getAlbum());
				if (value < 0) {
					ret = -1;
				}
				else {
					ret = 1;
				}
			}
		}
		else {
			value = this.getInterpret().compareTo(song.getInterpret());
			if (value < 0) {
				ret = -1;
			} 
			else {
				ret = 1;
			}
		}
		
		return ret;
	}
	
	/**
	 * Erstellt eine Kopie vom Song Objekt
	 * 
	 * @return liefert das geklonte Objekt zurück
	 */
	public Song clone () {
		Song ret = new Song();
		
		ret.setAlbum(this.getAlbum());
		ret.setErscheinungsjahr(this.getErscheinungsjahr());
		ret.setInterpret(this.getInterpret());
		ret.setTitel(this.getTitel());
		
		return ret;
	}
	
	/**
	 * Liefert einen String in dieser
	 * Form zurück: A Hard Rain's A-Gonna Fall;The Best Of Volume 2;Bob Dylan;2000
	 * 
	 * @return liefert einen String zurück
	 */
	@Override
	public String toString() {
		return this.getTitel()+ ";" + this.getAlbum() + ";" + this.getInterpret() + ";"
				+ this.getErscheinungsjahr();
	}
	
	/**
	 * Die Methode setSong zerlegt den ihr übergebenen String in Titel, Album, Interpret und
	 * Erscheinungsjahr und fügt die Teile in das Song-Objekt ein. So wird beispielsweise der String
	 * "A Hard Rain's A-Gonna Fall;The Best Of Bob Dylan Volume 2;Bob Dylan;2000"
	 * folgendermaßen aufgeteilt:
	 * Titel: A Hard Rain's A-Gonna Fall
	 * Album: The Best Of Bob Dylan Volume 2
	 * Interpret: Bob Dylan
	 * Erscheinungsjahr: 2000
	 * 
	 * Das Trennzeichen ist der Strichpunkt (;)
	 * 
	 * @param song ist ein String aus welchen die Song-Eigenschaften extrahiert werden
	 */
	public void setSong(String song) {
		String[] s = song.split(";");
		this.setTitel(s[0]);
		this.setAlbum(s[1]);
		this.setInterpret(s[2]);
		this.setErscheinungsjahr(Integer.decode(s[3]));
	}
	
	
}

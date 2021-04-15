public class MeinZahlensystemwandler {
	/**
	 * Wandelt das Zeichen nr in eine Zahl um, wobei die Groß-/Klein-schreibung
	 * ignoriert wird: '0' ergibt 0, '1' ergibt 1, ... '9' ergbit 9, 'A' ergibt 10,
	 * 'B' ergibt 11, ..., 'Z' ergibt 35 Sollte ein ungültiges Zeichen übergeben
	 * werden, so gibt die Methode -1 zurück
	 * 
	 * @param nr
	 *            das umzuwandelnde Zeichen
	 * @return die Zahl für die das Zeichen steht
	 */
	public static int getDigit(char nr) {
		int ret = -1;
		if (Character.isDigit(nr) || Character.isLetter(nr)) {
			nr = Character.toLowerCase(nr);
			if (Character.isDigit(nr) && nr - 48 <= 10) {
				ret = nr - 48;
			}
			if (Character.isLetter(nr)) {
				ret = nr - 87;
			}
		}
		return ret;
	}

	/**
	 * Wandelt die Nummer der Ziffer nr in ein Zeichen um: 0 ergibt '0', 1 ergibt
	 * '1', ..., 9 ergibt '9', 10 ergibt 'A', 11 ergibt 'B', ..., 35 ergibt 'Z'
	 * Sollte eine ungültige Nummer übergeben werden, so gibt die Methode einen
	 * Stern '*' zurück
	 * 
	 * @param nr
	 *            die Nummer welche in ein Zeichen umgewandelt werden soll
	 * @return das Zeichen das für die Nummer steht
	 */
	public static char getDigit(int nr) {
		char ret = 0;
		if (nr >= 0 && nr <= 35) {
			if (nr < 10) {
				ret = (char) (nr + 48);
			} else {
				ret = (char) (nr + 55);
			}
		} else {
			ret = '*';
		}
		return ret;
	}

	/**
	 * Wandelt die Zahl num mit der Basis basis in eine Dezimalzahl um und liefert
	 * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge
	 * gleich 0 ist oder die Basis kleiner als 2 ist, wird -1 zurück geliefert. Wenn
	 * eine Ziffer der übergebenen Zahl nicht zur Basis pass, wird ebenfalls -1
	 * zurück geliefert Beispiel: numToDec("01110110", 2) ergibt 118
	 * numToDec("170712", 8) ergibt 61898 numToDec("170712", 7) ergibt -1
	 * 
	 * @param num
	 *            die umzuwandelnde Zahl als String übergeben
	 * @param basis
	 *            die Basis der umzuwandelnden Zahl
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static int numToDec(String num, int basis) {
		int ret = -1;
		boolean fehler = false;
		for (int i = 0; i < num.length(); i++) {
			if (getDigit(num.charAt(i)) >= basis) {
				fehler = true;
			}
		}
		if (num != null && num.length() > 0 && basis >= 2 && !fehler) {
			ret = 0;
			int j = 0;
			for (int i = num.length() - 1; i >= 0; i--) {
				ret = ret + (getDigit(num.charAt(i)) * (int) Math.pow(basis, j));
				j++;
			}
		}
		return ret;
	}

	/**
	 * Wandelt die Dezimalzahl dec in eine Zahl mit der Basis basis um und gibt
	 * diese zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein und
	 * die Basis muss größer als 1 sein, ansonsten wird null zurück geliefert.
	 * Beispiel: decToNum(118,2) ergibt 1110110 decToNum(61898,8) ergibt 170712
	 * 
	 * @param dec die umzuwandelnde Dezimalzahl
	 * @param basis nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 */
	public static String decToNum(int dec, int basis) {
		String ret = null;
		int rest = 0;
		int erg = 0;
		int laenge = 1;
		if (dec >= 0 && basis > 1) {
			while (dec > 0) {
				rest = dec % basis;
				dec = dec / basis;
				erg = (int) (erg + rest * laenge);
				laenge = laenge * 10;
			}
			ret = "";
			ret = ret + erg;
		}
		return ret;
	}
	/**
	 * Wandelt die Hexadezimale Zahl in eine Dezimale Zahl um und gibt diese zurück. Es
	 * muss dabei gelten, dass die Zahl größer als 0 und ungleich null ist. Sie liefert
	 * eine Dezimale Zahl zurück, wenn dies übereinstimmt.
	 * 
	 * @param hex die umzuwandelnde Hexadezimalzahl
	 * @return liefert die Dezimale Zahl zurück
	 */
	public static int hexToDec(String hex) {
		int ret = -1;
		if (hex.length() > 0 && hex != null) {
			ret = 0;
			String hexz = "0123456789ABCDEF";
			hex = hex.toUpperCase();
			for (int i = 0; i < hex.length(); i++) {
				int convert = hexz.indexOf(hex.charAt(i));
				ret = 16*ret+convert;
			}
		}
		return ret;
	}
	/**
	 * Wandelt die parameter Zahl, in diesem Falle eine Dezimale Zahl in eine
	 * Hexadezimale zahl zurück. Es gibt nur eine Einschränkung für die 
	 * Dezimale Zahl. Sie soll nicht größer sein als wie viel ein Intgere
	 * besteht. Sie liefert eine Hexadezimale Zahl zurück
	 * 
	 * @param dec die Zahl die eingelesen werden soll
	 * @return liefert die Hexadezimale Zahl in einem String zurück
	 */
	public static String decToHex (int dec) {
		String ret = null;
		
		String digits = "0123456789ABCDEF";
    if (dec <= 0) {
    	ret = "0";
    }
    int base = 16;
    String hex = "";
    while (dec > 0) {
        int digit = dec % base;
        hex = digits.charAt(digit) + hex; 
        dec = dec / base;
    }
		ret = hex;
    
		return ret;
	}
	/**
	 * Wandelt die eingelesene Binär Zahl in eine Dezimale Zahl
	 * zurück. Die Binär Zahl soll nur 1 und 0 enthalten. Sie 
	 * liefert einen Integer zurück. Falls die eingegebene Zahl
	 * nicht mit den Bedinungen übereinstimmt wird -1 ausgegeben
	 * 
	 * @param dual die eingelesene Binär Zahl vom Typ String
	 * @return liefert einen Integer zurück und ist eine Dezimale Zahl
	 */
	public static int dualToDec(String dual) {
		int ret = 0;
		
		int power = 0;
		for(int i = dual.length() - 1; i >= 0; i--) {
      if(dual.charAt(i) == '1') {
          ret += Math.pow(2, power);
      }
      
      
      power++;
		}
		for (int i = dual.length() - 1; i >= 0; i--) {
			if (dual.charAt(i) != '1' && dual.charAt(i) != '0') {
				ret = -1;
			}
		}
		
		return ret;
	}
	/**
	 * Diese Methode wandelt die eingelesene Integer Dezimale Zahl
	 * dec in eine Binär Zahl um. Es gibt keine Einschränkungen für 
	 * die eingelesene Zahl dec
	 * 
	 * @param dec die eingelesene Dezimale Integer Zahl
	 * @return liefert einen Integer zurück entsprechend umgewandelt ins
	 * Binärsystem
	 */
	public static int decToDual(int dec){
		
		int ret = 0;
		
     if (dec != 0) {
        ret = (dec % 2 + 10 * decToDual(dec / 2));
     }
     
     return ret;
  }
	/**
	 * Wandelt die eingegebene von einer beliebigen Zahlensystem Zahl
	 * in einem beliebigen Zahlensystem um. Es gibt keine besonderen 
	 * Einschränkungen dafür.
	 *
	 * @param num die umzuwandelnde eingelesene Zahl
	 * @param base die Basis der umzuwandelnden Zahl
	 * @return liefert einen Integer zurück.
	 */
	
	public static String numToNum(String num, int basis, int basis2) {
    String ret = "";
    int num2 = MeinZahlensystemwandler.numToDec(num, basis);
    ret = MeinZahlensystemwandler.decToNum(num2, basis2);
    return ret;
	}
}
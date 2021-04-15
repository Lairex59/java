
public class Messwert
{

	private double messwert;
	
	public static void main(String[] args) {
		Messwert m1 = new Messwert();
		Messwert[] m = new Messwert[5];
		for (int i = 0; i < m.length; i++)
			m[i] = m1;
		
		Messwert m2 = m1.clone();
		for (int i = 1; i < m.length; i++) 
			m[i] = m2;
		Messwert[] m3 = new Messwert[500];
	}
	
	public static double messwertDurchschnitt(Messwert messwert[]) {
		double ret = 0D;
		
		double alles = 0D;
		for (int i = 0; i < messwert.length; i++) {
			alles +=  messwert[i].messwert;
		}
		
		ret = alles / messwert.length;
		
		return ret;
	}
	

	public Messwert clone() {
		Messwert ret = new Messwert();
		
		ret.messwert = this.messwert;
		
		return ret;
	}

}

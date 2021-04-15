/**
 * 
 * @author Laraib
 *
 */

public class SummeSieben
{
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int ergebnis = 0 ;
		int i = 1;
		//Solange a größer gleich 7 und kleiner gelich 1000
		while (i < 1000 && i >= 1) {
			/**ergebnis = ergebnis + a
			* d.h. ergebnis wird um a erhöht
			*/
			ergebnis += n * i;			
			
			//a wird um 1 erhöht
			i++;
		}
		//ergebnis wird ausgegeben
		System.out.println(ergebnis);
	}

}


public class KreisProgramm
{
	public static void main(String[] args) {
		//Objekt wird angelegt
		Kreis k1 = new Kreis();
		double f = 3;
		//Fläche wird angelegt
		k1.setFlaeche(f);
		Kreis k2 = new Kreis();
		//Objekt wird geklont
		k2 = k1.clone();
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		System.out.println("k1.equals(k2) ergibt " + k1.equals(k2));
		//Umfang und Radius wird angelegt
		k2.setUmfang(-1);
		k2.setRadius(1);
		System.out.println("k1.compareTo(k2) ergibt " + k1.compareTo(k2));
		System.out.println(k1.toString());
		System.out.println(k2.toString());
	}
}

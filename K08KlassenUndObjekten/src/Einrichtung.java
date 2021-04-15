
public class Einrichtung
{

	public static void main(String[] args) {
		Schrank schrank = new Schrank();
		Stuhl stuhl = new Stuhl();
		Polsterung polsterung = stuhl.getPolsterung();
		
		polsterung.setPFarbe("Grau");
		polsterung.setPMaterial("Baumwolle");
		
		stuhl.setPolsterung(polsterung);
		stuhl.setMaterial("Wolle");
		stuhl.setPreis(50);
		stuhl.setTeile(1);
		
		schrank.setMaterial("Holz");
		schrank.setPreis(219.98);
		schrank.setTeile(2);
		
		System.out.println("Polsterung Farbe: "+polsterung.getPFarbe());
		System.out.println("Polsterung Material: "+polsterung.getPMaterial());
		
		System.out.println();

		System.out.println("Stuhl Preis: "+stuhl.getPreis());
		System.out.println("Stuhl Teile: "+stuhl.getTeile());
		System.out.println("Stuhl Polsterung: "+stuhl.getPolsterung());
		System.out.println("Stuhl Material: "+stuhl.getMaterial());
		
		System.out.println();
		
		System.out.println("Schrank Material: "+schrank.getMaterial());
		System.out.println("Schrank Preis: "+schrank.getPreis());
		System.out.println("Schrank Teile: "+schrank.getTeile());
	}
	
}








public class PersonTest
{

	public static void main(String[] args) {
		//Instanziierung der Person-Objekten des Stammbaums
		Person annaHuber = new Person("Anna", "Huber", true);
		Person ediGreif = new Person("Edi", "Greif", false);
		Person bertaGreif = new Person("Berta", "Greif", true, annaHuber, ediGreif);
		Person resiRuepel = new Person("Resi", "Rüpel", true);
		Person martinSeeber = new Person("Martin", "Seeber", false);
		Person hansSeeber = new Person("Hans", "Seeber", false, resiRuepel, martinSeeber);
		Person annaSeeber = new Person("Anna", "Seeber", true, bertaGreif, hansSeeber);
		Person eddaHuber = new Person("Edda", "Huber", true);
		Person erwinPircher = new Person("Erwin", "Pircher", false);
		Person elsaPircher = new Person("Elsa", "Pircher", true, eddaHuber, erwinPircher);
		Person astridPenn = new Person("Astrid", "Penn", true);
		Person franzAmonn = new Person("Franz", "Amonn", false);
		Person seppAmonn = new Person("Sepp", "Franz", false, astridPenn, franzAmonn);
		Person rudiAmonn = new Person("Rudi", "Amonn", false, elsaPircher, seppAmonn);
		Person adamAmonn = new Person("Adam", "Amonn", false, annaSeeber, rudiAmonn);
		//Vater von Adam Amonn
		System.out.println("Vater von Adam Amonn: " + adamAmonn.getVater().getName());
		//Großvater mütterlichseits von Rudi Amonn
		System.out.println("Großvater mütterlichseits von Rudi Amonn: " + rudiAmonn.getMutter().getVater()
				.getName());
		//Eltern von Adam Amonn
		System.out.println("Eltern von Adam Amonn: ");
		Person[] eltern = adamAmonn.getEltern();
		System.out.println(eltern[0].toString());
		System.out.println(eltern[1].toString());
		//Großeltern von Adam Amonn
		System.out.println("Großeltern von Adam Amonn: ");
		Person[] greltern = adamAmonn.getGrosseltern();
		System.out.println(greltern[0].toString());
		System.out.println(greltern[1].toString());
		System.out.println(greltern[2].toString());
		System.out.println(greltern[3].toString());
		//Alle Vorfahren von Adam Amonn
		System.out.println("Liste");
		System.out.println(adamAmonn.getListe());
	}

}

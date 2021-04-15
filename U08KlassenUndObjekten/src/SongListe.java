import java.io.*;

public class SongListe
{

	public static void main(String[] args) {
		int counter = -1;
		//Quelle und Ziel
		String quelle = "D:\\Laraib\\TFO_Max_Valier_Bozen\\3InfB\\Informatik\\tracklist.csv";
		String ziel = "D:\\Laraib\\TFO_Max_Valier_Bozen\\3InfB\\Informatik\\sortlist.csv";
		//Schaut ob die Datei erfolgreich erstellt worden ist, falls nicht wird das Problem angezeigt
		try {
			BufferedReader reader = new BufferedReader(new FileReader(quelle));
			while (true) {
				String zeile = reader.readLine();
				if (zeile == null)
					// Dateiende erkannt
					break;
				else
					counter++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
		} catch (IOException e) {
			System.out.println("Lesefehler in Datei");
		}
		//Song Array wird mit der counter variable instanziiert 
		Song[] s1 = new Song[counter];
		
		String titel = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(quelle));
			
			titel = reader.readLine();
			
			
			for (int i = 0; i < s1.length; i++) {
				String zeile = reader.readLine();
				
				if (zeile == null) {
				// Dateiende erkannt
					break;
				}
				//Die Song Klasse wird new instanziiert im ganzen Array und die Zeile wird gesettet
				s1[i] = new Song();
				s1[i].setSong(zeile);
				
				int a = i;
				//Sortiert die Song Liste in Größe um
				while (a > 0 && s1[a].comapreTo(s1[a-1]) == -1) {
					Song help = new Song();
					
					help = s1[a-1];
					s1[a-1] = s1[a];
					s1[a] = help;
					
					a--;
				}
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
		} catch (IOException e) {
			System.out.println("Lesefehler in Datei");
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ziel));
			// ACHTUNG: Am Ende jeder Zeile muss eine Zeilenschaltung \n eingef�gt werden
			writer.write(titel+"\n");
			//Überschreibt die csv-Datei mit den richtigen Inhalten
			for (int i = 0; i < counter; i++) {
				writer.write(s1[i].toString()+"\n");
			}
			
			writer.close();
		} catch (IOException e) {
			System.out.println("Datei nicht angelegt");
		}
	}

}

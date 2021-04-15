import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Stoppuhr
{
	private long starttime = 0;
	private long stopptime = 0;
	private long[] stoppzeit = new long[1000];
	private int index = -1;
	String dateiname = "";
	
	/**
	 * @return the starttime
	 */
	public long getStarttime() {
		return starttime;
	}
	/**
	 * @param starttime the starttime to set
	 */
	public void setStarttime(long starttime) {
		this.starttime = starttime;
	}
	/**
	 * @return the stopptime
	 */
	public long getStopptime() {
		return stopptime;
	}
	/**
	 * @param stopptime the stopptime to set
	 */
	public void setStopptime(long stopptime) {
		this.stopptime = stopptime;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the dateiname
	 */
	public String getDateiname() {
		return dateiname;
	}
	/**
	 * @param dateiname the dateiname to set
	 */
	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}
	
	/**
	 * Methode startet die Stoppuhr
	 */
	public void starteStoppuhr() {
		this.setStarttime(new java.util.GregorianCalendar().getTimeInMillis());
	}
	
	/**
	 * Methode stoppt die Stoppuhr
	 */
	public void stoppeStoppuhr() {
		this.setStopptime(new java.util.GregorianCalendar().getTimeInMillis());
		this.setIndex(index + 1);
		this.stoppzeit[index] = this.getStopptime() - this.getStarttime();
	}
	
	/**
	 * @return gibt die gestoppte Zeit zurück
	 */
	public long getGestoppteZeit() {
		return this.stoppzeit[index];
	}
	
	/**
	 * Schreibt die Zeiten in die csv-Datei um mit
	 * writer.write
	 * 
	 * @return gibt 0 zurück falls die Datei erfolgreich
	 * geschrieben worden ist ansonsten -1
	 */
	public int schreibeZeiten() {
		int ret = -1;
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(this.getDateiname()));
			ret = 0;
			writer.write("Nummer;gestoppte Zeit[ms]\n");
			
			for (int i = 0; i <= index; i++) {
				writer.write(i+1+";"+stoppzeit[i]+"\n");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Datei nicht angelegt");
		}
		
		return ret;
	}
}

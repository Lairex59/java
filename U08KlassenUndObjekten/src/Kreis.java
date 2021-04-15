
public class Kreis
{
	
	private double radius;
	
	/**
	 * 
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}
	
	/**
	 * 
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * 
	 * @param umfang der zu setzende umfang
	 */
	public void setUmfang(double umfang) {
		if (umfang != 0D) {
			double radius = umfang / (2 * Math.PI);
			this.radius = radius;
		}
	}
	
	/**
	 * 
	 * @return der umfang
	 */
	public double getUmfang() {
		double ret = 2 * this.radius * Math.PI;
		return ret;
	}
	
	/**
	 * 
	 * @param flaeche die zu setzende fläche
	 */
	public void setFlaeche(double flaeche) {
		if (flaeche != 0D) {
			double radius = Math.sqrt(flaeche/Math.PI);
			this.radius = radius;
		}
	}
	
	/**
	 * 
	 * @return die fläche
	 */
	public double getFlaeche() {
		double ret = Math.pow(this.radius, 2) * Math.PI;
		
		return ret;
	}
	
	/**
	 * Überprüft ob des aufzurufende Objekt gleich ist wie das
	 * in den Parameter geschriebenen Objekt
	 * 
	 * @param obj der zu vergleichnde Objekt
	 * @return true, falls beide Objekte gleich sind, ansonsten
	 * false
	 */
	@Override
	public boolean equals(Object obj) {
		boolean ret;
		
		if (this == obj)
			ret = true;
		if (obj == null)
			ret = false;
		if (getClass() != obj.getClass())
			ret = false;
		Kreis other = (Kreis) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			ret = false;
		ret = true;
		
		return ret;
	}
	
	/**
	 * Vergleicht den unterschied mit den aufzurufenden
	 * Objekt mit den in den Paramter stehenden Objekt
	 * 
	 * @param k2 das zu vergleichende Objekt
	 * @return -1 falls der aufzurufende Objekt kleiner
	 * ist als das in den Parameter stehenden, im umgekehrten
	 * Falle 1 und falls sie gleich sind 0
	 */
	public int compareTo(Kreis k2) {
		int ret = 0;
		
		if (this.radius < k2.getRadius()) {
			ret = -1;
		}
		else if (this.radius > k2.getRadius()) {
			ret = 1;
		}
		return ret;
	}
	
	/**
	 * Klont das aufzurufende Objekt
	 * 
	 * @return gibt den geklonten Objekt zurück
	 */
	public Kreis clone() {
		Kreis ret = new Kreis();
		ret.setRadius(this.radius);
		return ret;
	}
	
	@Override
	/**
	 * Wandelt alle Variablen die man ausgeben muss
	 * in einem String um
	 */
	public String toString() {
		return "Kreis [r=" + getRadius() + " U=" + getUmfang() + " F= "+ getFlaeche() + "]";
	}
}

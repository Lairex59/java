import java.awt.*;

public class Ball
{
	
	private int radius = 0;
	private int xposition = 60;
	private int yposition = 80;
	private int xrichtung = 0;
	private int yrichtung = 0;
	
	private Color farbe = Color.BLACK;
	
	
	
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @return the xposition
	 */
	public int getXposition() {
		return xposition;
	}

	/**
	 * @param xposition the xposition to set
	 */
	public void setXposition(int xposition) {
		this.xposition = xposition;
	}

	/**
	 * @return the yposition
	 */
	public int getYposition() {
		return yposition;
	}

	/**
	 * @param yposition the yposition to set
	 */
	public void setYposition(int yposition) {
		this.yposition = yposition;
	}

	/**
	 * @return the xrichtung
	 */
	public int getXrichtung() {
		return xrichtung;
	}

	/**
	 * @param xrichtung the xrichtung to set
	 */
	public void setXrichtung(int xrichtung) {
		this.xrichtung = xrichtung;
	}

	/**
	 * @return the yrichtung
	 */
	public int getYrichtung() {
		return yrichtung;
	}

	/**
	 * @param yrichtung the yrichtung to set
	 */
	public void setYrichtung(int yrichtung) {
		this.yrichtung = yrichtung;
	}

	/**
	 * @return the farbe
	 */
	public Color getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}
	
	

	/**
	 * Wandelt alle Werte in diesem einzigen String um
	 */
	@Override
	public String toString() {
		return "r = " + getRadius() + ", xposition = " + getXposition() + ", yposition = "
				+ getYposition() + ", xrichtung = "
				+ getXrichtung() + ", yrichtung = " + getYrichtung();
	}

	/**
	 * Methode welche folgende Eigenschaften des Balles mit zufälligen Werten
	 * im angegebenen Bereich füllt:
	 * radius im Bereich von 2 und 40
	 * xrichtung und yrichtung im Bereich -10 und 10 und sie dürfen nicht 0 sein
	 * farbe, zufällig im RGB-Bereich zwischen 0 und 255
	 */
	public void setZufaellig() {
		this.radius = (int)(Math.random() * (40)+2);
		this.xrichtung = (int)(Math.random() * (21)-11);
		this.yrichtung = (int)(Math.random() * (21)-11);
		
		while (xrichtung == 0) {
			xrichtung = (int)(Math.random() * (21)-11);
		}
		while (yrichtung == 0) {
			yrichtung = (int)(Math.random() * (21)-11);
		}
		
		this.farbe = new Color((int)(Math.random() * (256)), (int)(Math.random() * (256)), 
				(int)(Math.random() * (256)));
	}
	
	/**
	 * Diese Methode bewegt den Ball mit newxpos, 
	 * newypos, newxrichtung und new yrichtung. Sie prallt
	 * an den Rändern des Applets ab. Sie wird Zufällig generiert
	 * 
	 * @param g ist die Grafikoberflöche
	 * @param width ist die breite
	 * @param height ist die höhe
	 */
	public void bewege(Graphics g, double width, double height) {
		int newxpos = this.xposition + this.xrichtung;
		if (newxpos < 0) {
			newxpos = 0;
			this.xrichtung *= -1;
		}
		
		if (newxpos + (this.radius*2) > width) {
			newxpos = (int)(width - this.radius*2);
			this.xrichtung *= -1;
		}
		
		int newypos = this.yposition + this.yrichtung;
		
		if (newypos < 0) {
			newypos = 0;
			this.yrichtung *= -1;
		}
		
		if (newypos + (this.radius*2) > height) {
			newypos = (int)(height - this.radius*2);
			this.yrichtung *= -1;
		}
		
		this.xposition = newxpos;
		this.yposition = newypos;
		
		g.setColor(this.farbe);
		g.fillOval(this.xposition, this.yposition, this.radius*2, this.radius*2);
	}
		
}

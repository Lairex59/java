import javax.swing.*;
import java.awt.*;

public class CosSinFenster extends JFrame
{
	/**
	 * Festlegen der Weltkoordinaten
	 */
	private final double WELT_X0 = -10.0;
	private final double WELT_Y0 = -1.0;
	private final double WELT_X1 = 10.0;
	private final double WELT_Y1 = 1.0;

	public CosSinFenster() {
		//Fenstereigenschaften
		setTitle("Cosinus-, Sinusberechnung");
		setBounds(10, 10, 600, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}

	/**
	 * Umwandlung Welt-X-Koordinaten in Bildschirmkoordinaten. Da die Methoden
	 * getHeight und getWidth auch die Ränder und insbesondere die Titelleiste in
	 * die Höhe und Breite des Fensters einrechnen, müssen mit Insets diese Ränder
	 * weggezählt werden
	 * 
	 * @param xwert
	 *          die umzuwandelnde Welt-X-Koordinate
	 * @return die Bildschirmkoordinate
	 */
	private int umrechnungX(double xwert) {
		Insets i = getInsets();
		return i.left + (int) ((xwert - WELT_X0) * (getWidth() - i.left - i.right) / (WELT_X1 - WELT_X0));
	}

	private int umrechnungY(double ywert) {
		Insets i = getInsets();
		return i.top + (int) (getHeight() - i.top - i.bottom
				- (ywert - WELT_Y0) * (getHeight() - i.top - i.bottom) / (WELT_Y1 - WELT_Y0));
	}
	
	/**
	 * Diese paint Methode gibt die Koordinaten und
	 * die Sinus und Cosinus in der Gui aus 
	 * 
	 * @param g Grafische Zeichenfläche
	 */
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		// Y-Koordinate
		g.drawLine(umrechnungX(0.0), umrechnungY(WELT_Y1), umrechnungX(0.0), umrechnungY(WELT_Y0));
		//X-Koordinate
		g.drawLine(umrechnungX(WELT_X0), umrechnungY(0.0), umrechnungX(WELT_X1), umrechnungY(0.0));
		
		for (double i = WELT_X0; i < WELT_X1; i += 0.0001) {
			double y = Math.sin(i);
			double y2 = Math.cos(i);
			
			// Sinus
			g.drawLine(umrechnungX(i), umrechnungY(y), umrechnungX(i), umrechnungY(y));
			// Cosinus
			g.drawLine(umrechnungX(i), umrechnungY(y2), umrechnungX(i), umrechnungY(y2));
		}
		
	}

}

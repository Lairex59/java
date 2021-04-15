import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KreisGUI extends JFrame
{
	private JLabel lRadius = null;
	private JLabel lUmfang = null;
	private JLabel lArea = null;

	private JTextField tRadius = null;
	private JTextField tUmfang = null;
	private JTextField tArea = null;

	private JButton b = null;

	public KreisGUI() {
		// Kreis-Objekt wird angelegt
		Kreis kreis = new Kreis();
		// Fenstereigenschaften
		setTitle("Kreisberechnung");
		setBounds(10, 10, 260, 190);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// Label anlegen
		lRadius = new JLabel("Radius:");
		lRadius.setBounds(20, 30, 50, 25);
		lUmfang = new JLabel("Umfang:");
		lUmfang.setBounds(20, 60, 50, 25);
		lArea = new JLabel("Fläche:");
		lArea.setBounds(20, 90, 50, 25);
		// Textfield anlegen
		tRadius = new JTextField();
		tRadius.setText(String.valueOf(kreis.getRadius()));
		tRadius.setBounds(80, 30, 160, 25);
		tUmfang = new JTextField();
		tUmfang.setText(String.valueOf(kreis.getUmfang()));
		tUmfang.setBounds(80, 60, 160, 25);
		tArea = new JTextField();
		tArea.setText(String.valueOf(kreis.getFlaeche()));
		tArea.setBounds(80, 90, 160, 25);
		// Button anlegen
		b = new JButton();
		b.setText("Rechne");
		b.setBounds(20, 120, 220, 25);
		// Content Pane initialisieren
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		// Label wird hinzugefügt
		contentPane.add(lRadius);
		contentPane.add(lUmfang);
		contentPane.add(lArea);
		// Textfield wird hinzugefügt
		contentPane.add(tRadius);
		contentPane.add(tUmfang);
		contentPane.add(tArea);
		// Button wird hinzugefügt
		contentPane.add(b);
		// Fenster wird sichtbar
		setVisible(true);
		// Falls Button geklickt wird
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				// Zaehler für error
				int err = 0;
				// Radius
				try {
					double r = Double.parseDouble(tRadius.getText());
					if (kreis.getRadius() != r) {
						kreis.setRadius(r);
					} else {
						// Umfang
						try {
							double u = Double.parseDouble(tUmfang.getText());
							if (kreis.getUmfang() != u) {
								kreis.setUmfang(u);
							} else {
								// Flaeche
								try {
									double f = Double.parseDouble(tArea.getText());
									if (kreis.getFlaeche() != f) {
										kreis.setFlaeche(f);
									}
								} catch (NumberFormatException e) {
									tArea.setText("Fehler!");
									err++;
								}
								// Ende Flaehce
							}
						} catch (NumberFormatException e) {
							tUmfang.setText("Fehler!");
							err++;
						}
						// Ende Umfang
					}
				} catch (NumberFormatException e) {
					tRadius.setText("Fehler!");
					err++;
				}
				// Ende Radius	
				if (err == 0) {
					tRadius.setText(String.valueOf(kreis.getRadius()));
					tUmfang.setText(String.valueOf(kreis.getUmfang()));
					tArea.setText(String.valueOf(kreis.getFlaeche()));
				}
			}
		});
	}
}

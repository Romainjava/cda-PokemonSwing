package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class V_ContentPaneGeneral extends JPanel {
	private BufferedImage image;
	private V_Form formulaire;
	private V_Tableau tableau;

	public V_ContentPaneGeneral(String nomImg) {
		/**
		 * Permet d'afficher une image en background d'un JPanel
		 */

		try {
			image = ImageIO.read(new File(nomImg));
			image.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(new MigLayout("", "[grow,right][grow,left]", "[grow]"));

		// == LEFT PANEL == //
		formulaire = new V_Form();
		this.add(formulaire, "cell 0 0,grow");

		// === RIGHT PANEL === //
		tableau = new V_Tableau();
		this.add(tableau, "cell 1 0,grow");
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// dimension de l'image
		g.drawImage(image, 0, 0, 1100, 800, null);
	}

	// === ACCESSEURS === //

	public V_Form getFormulaire() {
		return formulaire;
	}

	public V_Tableau getTableau() {
		return tableau;
	}
}

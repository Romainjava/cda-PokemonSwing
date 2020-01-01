package components;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * Class qui devait me permettre de mettre un background, sans succés
 * J'ai réussi seulement avec un BufferedImage et en @overide le paintComponent
 * @author Romain
 *
 */
public class BackgroundPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ImageIcon background;

	public BackgroundPanel(String fileName) {
		super();
		//this.setLayout(new GridBagLayout());
		this.background = new ImageIcon(fileName);
	}

	public void setBackground(ImageIcon background) {
		this.background = background;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background.getImage(), 0, 0, this);
	}

}

package Components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 * Custom components de JLabel
 * @author Romain
 *
 */
public class JLabelCustom extends JLabel {

	
	public JLabelCustom(String str) {
		super();
		this.setText(str);
		this.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		this.setForeground(Color.WHITE);
	}
	
	public JLabelCustom() {
		super();
		this.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		this.setForeground(Color.WHITE);
	}
}

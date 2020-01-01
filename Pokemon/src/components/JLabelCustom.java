package components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 * Custom components de JLabel
 * @author Romain
 *
 */
@SuppressWarnings("serial")
public class JLabelCustom extends JLabel {

	public JLabelCustom() {
		super();
		this.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		this.setForeground(Color.WHITE);
	}
	
	public JLabelCustom(String str) {
		super();
		this.setText(str);
		this.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		this.setForeground(Color.WHITE);
	}
	
	public JLabelCustom(String text,int sizeFont) {
		super();
		this.setText(text);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, sizeFont));
		this.setForeground(Color.WHITE);
	}
	
	public JLabelCustom(String text,int sizeFont, Color color) {
		super();
		this.setText(text);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, sizeFont));
		this.setForeground(color);
	}
}

package Components;

import java.awt.Font;


import javax.swing.JButton;
/**
 * Custom class de button
 * @author Romain
 *
 */
@SuppressWarnings("serial")
public class ButtonCustom extends JButton{

	public ButtonCustom(String text) {
		super();
		this.setText(text);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
	}
	
	public ButtonCustom() {
		super();
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
	}
}

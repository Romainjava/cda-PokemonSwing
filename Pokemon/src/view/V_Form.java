package view;

import java.awt.Color;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class V_Form extends JPanel {
	private V_Header header;
	private V_Main main;
	private V_Footer footer;

	public V_Form() {
		this.setBackground(new Color(0, 0, 0, 0));
		this.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));

		header = new V_Header();
		this.add(header, "cell 0 0,grow");

		main = new V_Main();
		this.add(main, "cell 0 1,grow");

		footer = new V_Footer();
		this.add(footer, "cell 0 2,grow");
	}

	// === ACCESSEURS === //
	public V_Header getHeader() {
		return header;
	}

	public V_Main getMain() {
		return main;
	}

	public V_Footer getFooter() {
		return footer;
	}
}

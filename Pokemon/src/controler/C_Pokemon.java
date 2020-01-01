package controler;

import view.V_ContentPaneGeneral;

public class C_Pokemon {
	private V_ContentPaneGeneral panel;

	public C_Pokemon(V_ContentPaneGeneral panel) {
		this.panel = panel;
		
		
	}
	
	// == 	ACCESSEURS  == //
	public V_ContentPaneGeneral getPanel() {
		return panel;
	}
}

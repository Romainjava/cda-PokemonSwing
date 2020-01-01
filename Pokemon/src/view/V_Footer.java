package view;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JPanel;

import components.JLabelCustom;
import components.PlaceholderTextField;
import net.miginfocom.swing.MigLayout;

public class V_Footer extends JPanel {
	private PlaceholderTextField nomDresseur;

	public V_Footer() {
		
		this.setBackground(new Color(0, 0, 0, 125));

		
		this.setLayout(new MigLayout("", "[grow]", "[grow][grow][200px:n,grow]"));

		JLabelCustom lblListeDePokemon = new JLabelCustom("Liste de Pokemon par Dresseur");
		this.add(lblListeDePokemon, "cell 0 0,alignx center");

		JLabelCustom lblNomDresseur = new JLabelCustom("Nom Dresseur :");
		this.add(lblNomDresseur, "flowx,cell 0 1,alignx center");

		nomDresseur = new PlaceholderTextField();
		nomDresseur.setPlaceholder("Nom du Dresseur");
		this.add(nomDresseur, "cell 0 1");
		nomDresseur.setColumns(10);

		JList<?> footer_jlist = new JList<>();
		this.add(footer_jlist, "cell 0 2,grow");
	}
	
	// == ACCESSEURS == //
	public PlaceholderTextField getNomDresseur() {
		return nomDresseur;
	}
}

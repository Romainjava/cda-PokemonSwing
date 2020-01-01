package Module;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JPanel;
import Components.JLabelCustom;
import Components.PlaceholderTextField;
import net.miginfocom.swing.MigLayout;

public class FooterModule {
	PlaceholderTextField nomDresseur;

	public FooterModule(JPanel left_panel) {
		JPanel block_footer_panel = new JPanel();
		block_footer_panel.setBackground(new Color(0, 0, 0, 125));

		left_panel.add(block_footer_panel, "cell 0 2,grow");
		block_footer_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][200px:n,grow]"));

		JLabelCustom lblListeDePokemon = new JLabelCustom("Liste de Pokemon par Dresseur");
		block_footer_panel.add(lblListeDePokemon, "cell 0 0,alignx center");

		JLabelCustom lblNomDresseur = new JLabelCustom("Nom Dresseur :");
		block_footer_panel.add(lblNomDresseur, "flowx,cell 0 1,alignx center");

		nomDresseur = new PlaceholderTextField();
		nomDresseur.setPlaceholder("Nom du Dresseur");
		block_footer_panel.add(nomDresseur, "cell 0 1");
		nomDresseur.setColumns(10);

		JList<?> footer_jlist = new JList<>();
		block_footer_panel.add(footer_jlist, "cell 0 2,grow");
	}
}

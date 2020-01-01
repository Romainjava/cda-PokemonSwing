package Module;

import java.awt.Color;
import Components.ButtonCustom;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import Components.JLabelCustom;
import Components.PlaceholderTextField;
import net.miginfocom.swing.MigLayout;

public class HeaderModule {
	PlaceholderTextField nomPoke;
	
	public HeaderModule(JPanel main_left) {
		JPanel block_header_panel = new JPanel();
		block_header_panel.setBackground(new Color(0, 0, 0, 125));// permet de mettre opacity à 125(0,255)

		main_left.add(block_header_panel, "cell 0 0,grow");
		block_header_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));

		JLabelCustom lblAjoutPokemonDans = new JLabelCustom("Ajout pokemon dans Pokedex National");
		block_header_panel.add(lblAjoutPokemonDans, "cell 0 0,alignx center");

		nomPoke = new PlaceholderTextField();
		block_header_panel.add(nomPoke, "cell 0 1,alignx center");
		nomPoke.setColumns(10);

		JComboBox<?> header_type_comboBox = new JComboBox<>();
		block_header_panel.add(header_type_comboBox, "cell 0 1,alignx center");

		JComboBox<?> header_type2_textfield = new JComboBox<>();
		block_header_panel.add(header_type2_textfield, "cell 0 1,alignx center");

		ButtonCustom header_btnadd = new ButtonCustom("+");
		block_header_panel.add(header_btnadd, "cell 0 2,alignx center");

		ButtonCustom header_btnless = new ButtonCustom("-");
		block_header_panel.add(header_btnless, "cell 0 2,alignx center");

		ButtonCustom header_btnUpdate = new ButtonCustom("Update");
		block_header_panel.add(header_btnUpdate, "cell 0 2,alignx center");
	}
}

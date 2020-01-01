package Module;

import java.awt.Color;
import Components.ButtonCustom;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import Components.JLabelCustom;
import Components.PlaceholderTextField;
import Enum.E_type;
import net.miginfocom.swing.MigLayout;

public class HeaderModule {
	PlaceholderTextField nomPoke;
	JComboBox<?> header_type_comboBox;
	JComboBox<?> header_type2_textfield;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public HeaderModule(JPanel main_left) {
		JPanel block_header_panel = new JPanel();
		block_header_panel.setBackground(new Color(0, 0, 0, 125));// permet de mettre opacity à 125(0,255)

		main_left.add(block_header_panel, "cell 0 0,grow");
		block_header_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));

		JLabelCustom lblAjoutPokemonDans = new JLabelCustom("Ajout pokemon dans Pokedex National");
		block_header_panel.add(lblAjoutPokemonDans, "cell 0 0,alignx center");

		nomPoke = new PlaceholderTextField();
		nomPoke.setPlaceholder("Nom du pokemon");
		block_header_panel.add(nomPoke, "cell 0 1,alignx center");
		nomPoke.setColumns(10);

		header_type_comboBox = new JComboBox<>();
		header_type_comboBox.setModel(new DefaultComboBoxModel(E_type.values()));
		block_header_panel.add(header_type_comboBox, "cell 0 1,alignx center");

		header_type2_textfield = new JComboBox<>();
		header_type2_textfield.setModel(new DefaultComboBoxModel(E_type.values()));
		block_header_panel.add(header_type2_textfield, "cell 0 1,alignx center");

		ButtonCustom header_btnadd = new ButtonCustom("+");
		block_header_panel.add(header_btnadd, "cell 0 2,alignx center");

		ButtonCustom header_btnless = new ButtonCustom("-");
		block_header_panel.add(header_btnless, "cell 0 2,alignx center");

		ButtonCustom header_btnUpdate = new ButtonCustom("Update");
		block_header_panel.add(header_btnUpdate, "cell 0 2,alignx center");
	}
	
	/**
	 * Recupére la valeur des types grâce aux methode du model du JComboBox
	 * TODO remplir les valeurs recupéré avec T dans l'instance de la classe spécifique
	 * TODO faire condition si deux même type selectionné
	 */
	public void getTypePokemon() {
		E_type T = (E_type) header_type_comboBox.getModel().getSelectedItem();
		//TODO utiliser T pour injecter les valeurs
	}
}

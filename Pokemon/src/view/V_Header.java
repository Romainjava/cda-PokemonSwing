package view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import components.ButtonCustom;
import components.JLabelCustom;
import components.PlaceholderTextField;
import enumeration.E_type;
import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class V_Header extends JPanel {
	PlaceholderTextField nomPoke;
	JComboBox<?> header_type_comboBox;
	JComboBox<?> header_type2_textfield;
	ButtonCustom header_btnadd;
	ButtonCustom header_btnless;
	ButtonCustom header_btnUpdate;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public V_Header() {
		
		this.setBackground(new Color(0, 0, 0, 125));// permet de mettre opacity à 125(0,255)

		
		this.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));

		JLabelCustom lblAjoutPokemonDans = new JLabelCustom("Ajout pokemon dans Pokedex National");
		this.add(lblAjoutPokemonDans, "cell 0 0,alignx center");

		nomPoke = new PlaceholderTextField();
		nomPoke.setPlaceholder("Nom du pokemon");
		this.add(nomPoke, "cell 0 1,alignx center");
		nomPoke.setColumns(10);

		header_type_comboBox = new JComboBox<>();
		header_type_comboBox.setModel(new DefaultComboBoxModel(E_type.values()));
		this.add(header_type_comboBox, "cell 0 1,alignx center");

		header_type2_textfield = new JComboBox<>();
		header_type2_textfield.setModel(new DefaultComboBoxModel(E_type.values()));
		this.add(header_type2_textfield, "cell 0 1,alignx center");

		header_btnadd = new ButtonCustom("+");
		this.add(header_btnadd, "cell 0 2,alignx center");

		header_btnless = new ButtonCustom("-");
		this.add(header_btnless, "cell 0 2,alignx center");

		header_btnUpdate = new ButtonCustom("Update");
		this.add(header_btnUpdate, "cell 0 2,alignx center");
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

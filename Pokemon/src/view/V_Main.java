package view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;

import components.ButtonCustom;
import components.JLabelCustom;
import components.PlaceholderTextField;
import enumeration.E_type;
import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class V_Main extends JPanel {

	PlaceholderTextField nomDresseur;
	PlaceholderTextField nomPoke;
	PlaceholderTextField libelleAtk;
	PlaceholderTextField pp;
	PlaceholderTextField puissance;
	PlaceholderTextField precision;
	JComboBox<?> main_type_comboBox;
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public V_Main() {
		
		this.setBackground(new Color(0, 0, 0, 125));
		
		this.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][200px:n,grow]"));

		JLabelCustom lblAjoutDunPokemon = new JLabelCustom("Ajout d'un pokemon attrapé par un dresseur");
		this.add(lblAjoutDunPokemon, "cell 0 0,alignx center");

		nomDresseur = new PlaceholderTextField();
		nomDresseur.setPlaceholder("Nom du Dresseur");
		this.add(nomDresseur, "cell 0 1,alignx center");
		nomDresseur.setColumns(10);

		nomPoke = new PlaceholderTextField();
		nomPoke.setPlaceholder("Nom du pokemon");
		this.add(nomPoke, "flowx,cell 0 2,alignx center");
		nomPoke.setColumns(10);
		
		//TODO transformer le libelleAtk en JComboBox ?
		libelleAtk = new PlaceholderTextField();
		libelleAtk.setPlaceholder("Nom de l'attaque");
		this.add(libelleAtk, "cell 0 2");
		libelleAtk.setColumns(10);

		pp = new PlaceholderTextField();
		pp.setPlaceholder("Nbr pp (5/10/15)");
		this.add(pp, "cell 0 2");
		pp.setColumns(10);

		puissance = new PlaceholderTextField();
		puissance.setPlaceholder("Puissance de atk");
		this.add(puissance, "cell 0 2");
		puissance.setColumns(10);

		precision = new PlaceholderTextField();
		precision.setPlaceholder("Précision de atk");
		this.add(precision, "cell 0 2");
		precision.setColumns(10);

		main_type_comboBox = new JComboBox<>();
		main_type_comboBox.setModel(new DefaultComboBoxModel(E_type.values()));
		
		this.add(main_type_comboBox, "cell 0 2");

		ButtonCustom main_btnAdd = new ButtonCustom("+");
		this.add(main_btnAdd, "cell 0 3,alignx center");

		ButtonCustom main_btnDel = new ButtonCustom("-");
		this.add(main_btnDel, "cell 0 3,alignx center");

		ButtonCustom main_btnUpdate = new ButtonCustom("Update");
		this.add(main_btnUpdate, "cell 0 3,alignx center");

		JList<?> main_jlist = new JList<>();
		this.add(main_jlist, "cell 0 4,grow");
	}
}

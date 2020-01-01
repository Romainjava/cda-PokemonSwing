package Module;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import Components.ButtonCustom;
import Components.JLabelCustom;
import javax.swing.JList;
import javax.swing.JPanel;
import Components.PlaceholderTextField;
import Enum.E_type;
import net.miginfocom.swing.MigLayout;

public class MainModule {

	PlaceholderTextField nomDresseur;
	PlaceholderTextField nomPoke;
	PlaceholderTextField libelleAtk;
	PlaceholderTextField pp;
	PlaceholderTextField puissance;
	PlaceholderTextField precision;
	JComboBox<?> main_type_comboBox;
	public MainModule(JPanel main_left) {
		JPanel block_main_panel = new JPanel();
		block_main_panel.setBackground(new Color(0, 0, 0, 125));
		main_left.add(block_main_panel, "cell 0 1,grow");
		block_main_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][200px:n,grow]"));

		JLabelCustom lblAjoutDunPokemon = new JLabelCustom("Ajout d'un pokemon attrapé par un dresseur");
		block_main_panel.add(lblAjoutDunPokemon, "cell 0 0,alignx center");

		nomDresseur = new PlaceholderTextField();
		nomDresseur.setPlaceholder("Nom du Dresseur");
		block_main_panel.add(nomDresseur, "cell 0 1,alignx center");
		nomDresseur.setColumns(10);

		nomPoke = new PlaceholderTextField();
		nomPoke.setPlaceholder("Nom du pokemon");
		block_main_panel.add(nomPoke, "flowx,cell 0 2,alignx center");
		nomPoke.setColumns(10);
		
		//TODO transformer le libelleAtk en JComboBox ?
		libelleAtk = new PlaceholderTextField();
		libelleAtk.setPlaceholder("Nom de l'attaque");
		block_main_panel.add(libelleAtk, "cell 0 2");
		libelleAtk.setColumns(10);

		pp = new PlaceholderTextField();
		pp.setPlaceholder("Nbr pp (5/10/15)");
		block_main_panel.add(pp, "cell 0 2");
		pp.setColumns(10);

		puissance = new PlaceholderTextField();
		puissance.setPlaceholder("Puissance de atk");
		block_main_panel.add(puissance, "cell 0 2");
		puissance.setColumns(10);

		precision = new PlaceholderTextField();
		precision.setPlaceholder("Précision de atk");
		block_main_panel.add(precision, "cell 0 2");
		precision.setColumns(10);

		main_type_comboBox = new JComboBox<>();
		main_type_comboBox.setModel(new DefaultComboBoxModel(E_type.values()));
		
		block_main_panel.add(main_type_comboBox, "cell 0 2");

		ButtonCustom main_btnAdd = new ButtonCustom("+");
		block_main_panel.add(main_btnAdd, "cell 0 3,alignx center");

		ButtonCustom main_btnDel = new ButtonCustom("-");
		block_main_panel.add(main_btnDel, "cell 0 3,alignx center");

		ButtonCustom main_btnUpdate = new ButtonCustom("Update");
		block_main_panel.add(main_btnUpdate, "cell 0 3,alignx center");

		JList<?> main_jlist = new JList<>();
		block_main_panel.add(main_jlist, "cell 0 4,grow");
	}
}

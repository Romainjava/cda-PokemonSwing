package View;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;

@SuppressWarnings("serial")
public class MainApp extends JFrame {

	private JPanel contentPane;
	private JTable tableau;
	private JTextField search_textField;
	private JTextField header_nomPoke_textfield;
	private JTextField main_nomDresseur_textField;
	private JTextField main_nomPoke_textField;
	private JTextField main_libelleAtk_textField;
	private JTextField main_pp_textField;
	private JTextField main_puissance_textField;
	private JTextField main_precision_textField;
	private JTextField footer_nomDre_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow,right][grow,left]", "[grow]"));
		
		// == LEFT PANEL == //
		JPanel main_left_panel = new JPanel();
		contentPane.add(main_left_panel, "cell 0 0,grow");
		main_left_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));
		
		JPanel block_header_panel = new JPanel();
		main_left_panel.add(block_header_panel, "cell 0 0,grow");
		block_header_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));
		
		JLabel lblAjoutPokemonDans = new JLabel("Ajout pokemon dans Pokedex National");
		block_header_panel.add(lblAjoutPokemonDans, "cell 0 0,alignx center");
		
		header_nomPoke_textfield = new JTextField();
		block_header_panel.add(header_nomPoke_textfield, "cell 0 1,alignx center");
		header_nomPoke_textfield.setColumns(10);
		
		JComboBox<?>header_type_comboBox = new JComboBox<>();
		block_header_panel.add(header_type_comboBox, "cell 0 1,alignx center");
		
		JComboBox<?> header_type2_textfield = new JComboBox<>();
		block_header_panel.add(header_type2_textfield, "cell 0 1,alignx center");
		
		JButton header_btnadd = new JButton("+");
		block_header_panel.add(header_btnadd, "cell 0 2,alignx center");
		
		JButton header_btnless = new JButton("-");
		block_header_panel.add(header_btnless, "cell 0 2,alignx center");
		
		JButton header_btnUpdate = new JButton("Update");
		block_header_panel.add(header_btnUpdate, "cell 0 2,alignx center");
		
		JPanel block_main_panel = new JPanel();
		main_left_panel.add(block_main_panel, "cell 0 1,grow");
		block_main_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][200px:n,grow]"));
		
		JLabel lblAjoutDunPokemon = new JLabel("Ajout d'un pokemon attrapé par un dresseur");
		block_main_panel.add(lblAjoutDunPokemon, "cell 0 0,alignx center");
		
		main_nomDresseur_textField = new JTextField();
		block_main_panel.add(main_nomDresseur_textField, "cell 0 1,alignx center");
		main_nomDresseur_textField.setColumns(10);
		
		main_nomPoke_textField = new JTextField();
		block_main_panel.add(main_nomPoke_textField, "flowx,cell 0 2,alignx center");
		main_nomPoke_textField.setColumns(10);
		
		main_libelleAtk_textField = new JTextField();
		block_main_panel.add(main_libelleAtk_textField, "cell 0 2");
		main_libelleAtk_textField.setColumns(10);
		
		main_pp_textField = new JTextField();
		block_main_panel.add(main_pp_textField, "cell 0 2");
		main_pp_textField.setColumns(10);
		
		main_puissance_textField = new JTextField();
		block_main_panel.add(main_puissance_textField, "cell 0 2");
		main_puissance_textField.setColumns(10);
		
		main_precision_textField = new JTextField();
		block_main_panel.add(main_precision_textField, "cell 0 2");
		main_precision_textField.setColumns(10);
		
		JComboBox<?> main_type_comboBox = new JComboBox<>();
		block_main_panel.add(main_type_comboBox, "cell 0 2");
		
		JButton main_btnAdd = new JButton("+");
		block_main_panel.add(main_btnAdd, "cell 0 3,alignx center");
		
		JButton main_btnDel = new JButton("-");
		block_main_panel.add(main_btnDel, "cell 0 3,alignx center");
		
		JButton main_btnUpdate = new JButton("Update");
		block_main_panel.add(main_btnUpdate, "cell 0 3,alignx center");
		
		JList<?> main_jlist = new JList<>();
		block_main_panel.add(main_jlist, "cell 0 4,grow");
		
		
		JPanel block_footer_panel = new JPanel();
		main_left_panel.add(block_footer_panel, "cell 0 2,grow");
		block_footer_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][200px:n,grow]"));
		
		JLabel lblListeDePokemon = new JLabel("Liste de Pokemon par Dresseur");
		block_footer_panel.add(lblListeDePokemon, "cell 0 0,alignx center");
		
		JLabel lblNomDresseur = new JLabel("Nom Dresseur :");
		block_footer_panel.add(lblNomDresseur, "flowx,cell 0 1,alignx center");
		
		footer_nomDre_textField = new JTextField();
		block_footer_panel.add(footer_nomDre_textField, "cell 0 1");
		footer_nomDre_textField.setColumns(10);
		
		JList<?> footer_jlist = new JList<>();
		block_footer_panel.add(footer_jlist, "cell 0 2,grow");
		
		// === RIGHT PANEL === //
		JPanel main_right_panel = new JPanel();
		contentPane.add(main_right_panel, "cell 1 0,grow");
		main_right_panel.setLayout(new MigLayout("", "[grow]", "[::100px,grow][grow]"));
		
		JPanel block_search_panel = new JPanel();
		main_right_panel.add(block_search_panel, "cell 0 0,grow");
		block_search_panel.setLayout(new MigLayout("", "[grow]", "[::50px][::50px]"));
		
		JLabel lblPokedexNational = new JLabel("Pokedex National");
		block_search_panel.add(lblPokedexNational, "cell 0 0,alignx center");
		
		search_textField = new JTextField();
		block_search_panel.add(search_textField, "cell 0 1,alignx center");
		search_textField.setColumns(10);
		
		JScrollPane block_wrapTab_scrollPane = new JScrollPane();
		main_right_panel.add(block_wrapTab_scrollPane, "cell 0 1,grow");
		
		tableau = new JTable();
		block_wrapTab_scrollPane.setViewportView(tableau);
	}

}

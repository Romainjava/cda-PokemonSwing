package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Components.JLabelCustom;
import Module.FooterModule;
import Module.HeaderModule;
import Module.MainModule;
import Module.TableauModule;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;

@SuppressWarnings({ "serial", "deprecation" })
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
	BufferedImage image;

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
		/**
		 * UI Nimbus
		 */
//		try {
//			UIManager.setLookAndFeel(new NimbusLookAndFeel());
//		} catch (UnsupportedLookAndFeelException e) {
//			e.printStackTrace();
//		}
		// ==== FIN UI NIMBUS === //
		// === Background Image === //
		// BackgroundPanel bagrP = new BackgroundPanel("wallPaperPKM.png");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 800);
		/**
		 * Permet d'afficher une image en background d'un JPanel
		 */
		try {
			image = ImageIO.read(new File("wallPaperPKM.png"));
			image.getScaledInstance(1100, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}

		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				// dimension de l'image
				g.drawImage(image, 0, 0, 1100, 800, null);
			}
		};

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow,right][grow,left]", "[grow]"));

		// == LEFT PANEL == //
		JPanel main_left_panel = new JPanel();
		main_left_panel.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(main_left_panel, "cell 0 0,grow");
		main_left_panel.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow]"));
		
		//TODO A METTRE DANSLE CONTROLEUR PAR LA SUITE	
		HeaderModule header = new HeaderModule(main_left_panel);	
		MainModule main = new MainModule(main_left_panel);
		FooterModule footer = new FooterModule(main_left_panel);


		// === RIGHT PANEL === //
		JPanel main_right_panel = new JPanel();
		main_right_panel.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(main_right_panel, "cell 1 0,grow");
		main_right_panel.setLayout(new MigLayout("", "[grow]", "[::100px,grow][grow]"));
		
		//TODO A METTRE DANSLE CONTROLEUR PAR LA SUITE	
		TableauModule tableau = new TableauModule(main_right_panel);

	}

}

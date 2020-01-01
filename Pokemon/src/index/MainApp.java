package index;

import java.awt.EventQueue;
import javax.swing.JFrame;
import view.V_ContentPaneGeneral;




@SuppressWarnings({ "serial"})
public class MainApp extends JFrame {

	private V_ContentPaneGeneral contentPane;
	
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
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1100, 800);
		
		
		contentPane = new V_ContentPaneGeneral("wallPaperPKM.png");

		
		
		//TODO A METTRE DANSLE CONTROLEUR PAR LA SUITE	
		//C_Pokemon c_pokemon = new C_Pokemon(main_right_panel);
		this.setContentPane(contentPane);

	}

}

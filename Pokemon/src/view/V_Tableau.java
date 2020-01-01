package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import components.JLabelCustom;
import components.PlaceholderTextField;
import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class V_Tableau extends JPanel {
	private PlaceholderTextField search;
	private JTable tableau;

	public V_Tableau() {
		this.setBackground(new Color(0, 0, 0, 0));
		this.setLayout(new MigLayout("", "[grow]", "[::100px,grow][grow]"));
		this.addSearchPanel();
		this.addTabScrollPanel();
	}

	public void addSearchPanel() {
		JPanel block_search_panel = new JPanel();
		block_search_panel.setBackground(new Color(0, 0, 0, 100));
		block_search_panel.setLayout(new MigLayout("", "[grow]", "[::50px][::50px]"));

		JLabelCustom lblPokedexNational = new JLabelCustom("Pokedex National");
		block_search_panel.add(lblPokedexNational, "cell 0 0,alignx center");

		search = new PlaceholderTextField();
		block_search_panel.add(search, "cell 0 1,alignx center");
		search.setColumns(10);

		this.add(block_search_panel, "cell 0 0,grow");
	}

	public void addTabScrollPanel() {
		JScrollPane block_wrapTab_scrollPane = new JScrollPane();
		block_wrapTab_scrollPane.setBackground(new Color(0, 0, 0, 0));
		tableau = new JTable();
		block_wrapTab_scrollPane.setViewportView(tableau);

		this.add(block_wrapTab_scrollPane, "cell 0 1,grow");
	}

	// == ACCESSEURS == //
	public PlaceholderTextField getSearch() {
		return search;
	}

	public JTable getTableau() {
		return tableau;
	}
}

package Module;

import java.awt.Color;
import Components.JLabelCustom;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Components.PlaceholderTextField;
import net.miginfocom.swing.MigLayout;

public class TableauModule {
	PlaceholderTextField search;
	JTable tableau;

	public TableauModule(JPanel right_panel) {
		JPanel block_search_panel = new JPanel();
		block_search_panel.setBackground(new Color(0, 0, 0, 125));
		right_panel.add(block_search_panel, "cell 0 0,grow");
		block_search_panel.setLayout(new MigLayout("", "[grow]", "[::50px][::50px]"));

		JLabelCustom lblPokedexNational = new JLabelCustom("Pokedex National");
		block_search_panel.add(lblPokedexNational, "cell 0 0,alignx center");

		search = new PlaceholderTextField();
		block_search_panel.add(search, "cell 0 1,alignx center");
		search.setColumns(10);

		JScrollPane block_wrapTab_scrollPane = new JScrollPane();
		block_wrapTab_scrollPane.setBackground(new Color(0, 0, 0, 125));
		right_panel.add(block_wrapTab_scrollPane, "cell 0 1,grow");

		tableau = new JTable();
		block_wrapTab_scrollPane.setViewportView(tableau);
	}

}

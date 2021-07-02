package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/*
 * Created by JFormDesigner on Fri Jul 02 22:34:09 CST 2021
 */


/**
 * @author somnusym
 */
public class FormTheme extends Form {
	public static String[] themes = {
			"Light",
			"Intellij",
			"Arc",
			"Arc - Orange",
			"Cyan Light",
			"Gray",
			"Light Flat - Intellij",
			"Solarized Light - Intellij",
			"Atom One Light",
			"Github",
			"Light Owl",
			"Material Lighter",
			"Solarized Light - Material",
			"Dark",
			"Darcula - Intellij"
	};

	public FormTheme(){
		initComponents();
	}

	private void listThemesMouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		Theme = new JFrame();
		spTheme = new JScrollPane();
		listThemes = new JList();

		//======== Theme ========
		{
			Theme.setTitle("\u9009\u62e9\u4e3b\u9898");
			Theme.setResizable(false);
			Theme.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			Container ThemeContentPane = Theme.getContentPane();

			//======== spTheme ========
			{

				//---- listThemes ----
				listThemes.setFocusable(false);
				listThemes.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						listThemesMouseClicked(e);
					}
				});
				spTheme.setViewportView(listThemes);
			}

			GroupLayout ThemeContentPaneLayout = new GroupLayout(ThemeContentPane);
			ThemeContentPane.setLayout(ThemeContentPaneLayout);
			ThemeContentPaneLayout.setHorizontalGroup(
				ThemeContentPaneLayout.createParallelGroup()
					.addComponent(spTheme, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
			);
			ThemeContentPaneLayout.setVerticalGroup(
				ThemeContentPaneLayout.createParallelGroup()
					.addComponent(spTheme, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
			);
			Theme.pack();
			Theme.setLocationRelativeTo(null);
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	public JFrame Theme;
	private JScrollPane spTheme;
	private JList listThemes;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

package ui;
import java.awt.*;
import java.awt.event.*;
import ui.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class chatter extends JFrame {

	public chatter() {
		initComponents();
		initListeners();
	}

	private void initListeners() {
		listFriends.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(listFriends.getSelectedIndex() != -1) {
					if(e.getClickCount() == 2){
						String selected = listFriends.getSelectedValue();
						if(FrameManager.isMainExisted(selected)){
							FrameManager.setFrameVisible(FrameManager.getFrame(selected), true);
						}
						else{
							main c = new main(selected);
							FrameManager.addFrame(c);
						}
					}
				}
			}
		});
		
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		lbMyFriends = new JLabel();
		scrollPane1 = new JScrollPane();
		listFriends = new JList<>();

		//======== this ========
		setMinimumSize(new Dimension(220, 440));
		setTitle("Chatter");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3,alignx center",
			// columns
			"[grow]",
			// rows
			"[]" +
			"[grow]" +
			"[]"));

		//---- lbMyFriends ----
		lbMyFriends.setText("\u6211\u7684\u597d\u53cb");
		lbMyFriends.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		contentPane.add(lbMyFriends, "cell 0 0");

		//======== scrollPane1 ========
		{

			//---- listFriends ----
			listFriends.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listFriends.setModel(new AbstractListModel<String>() {
				String[] values = {
					"\u5ed6\u601d\u6e90",
					"\u8d3e\u5b89\u5353",
					"\u5b59\u6708\u660e",
					"\u51af\u5251\u8c6a",
					"\u8d75\u777f",
					"\u51af\u5609\u4f26"
				};
				@Override
				public int getSize() { return values.length; }
				@Override
				public String getElementAt(int i) { return values[i]; }
			});
			listFriends.setFocusable(false);
			listFriends.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
			scrollPane1.setViewportView(listFriends);
		}
		contentPane.add(scrollPane1, "cell 0 1, grow");
		setSize(220, 550);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel lbMyFriends;
	private JScrollPane scrollPane1;
	private JList<String> listFriends;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	
}

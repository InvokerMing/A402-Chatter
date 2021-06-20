package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import net.miginfocom.swing.*;


public class main extends JFrame{
	private String ChatTo;

	public main(String ChatTo) {
		this.ChatTo = ChatTo;
		initComponents();
		initListeners();
	}

	private void initListeners() {
		btnSendMsg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tpInputMsg.getText().equals(""))
					return;
				tpHisMsg.setText(tpHisMsg.getText() + "\n" + tpInputMsg.getText());
				tpInputMsg.setText("");
			}
		});
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		Chat = new JFrame();
		spHisMsg = new JScrollPane();
		tpHisMsg = new JTextPane();
		btnEmoji = new JButton();
		btnPic = new JButton();
		btnMsgRec = new JButton();
		spInputMsg = new JScrollPane();
		tpInputMsg = new JTextPane();
		btnSendMsg = new JButton();

		//======== Chat ========
		{
			Chat.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			Chat.setMinimumSize(new Dimension(600, 600));
			Chat.setResizable(false);
			Chat.setTitle("xxx");
			Container ChatContentPane = Chat.getContentPane();
			ChatContentPane.setLayout(new MigLayout(
				"insets panel,hidemode 3",
				// columns
				"[grow]" +
				"[grow]" +
				"[150!]",
				// rows
				"[400]" +
				"[40]" +
				"[120]" +
				"[40]"));

			//======== spHisMsg ========
			{

				//---- tpHisMsg ----
				tpHisMsg.setEditable(false);
				tpHisMsg.setText("\u5386\u53f2\u6d88\u606f");
				spHisMsg.setViewportView(tpHisMsg);
			}
			ChatContentPane.add(spHisMsg, "spanx 2,grow");

			//---- btnEmoji ----
			btnEmoji.setText("\u8868\u60c5");
			btnEmoji.setFocusable(false);
			ChatContentPane.add(btnEmoji, "cell 0 1");

			//---- btnPic ----
			btnPic.setText("\u56fe\u7247");
			btnPic.setFocusPainted(false);
			btnPic.setFocusable(false);
			ChatContentPane.add(btnPic, "cell 0 1");

			//---- btnMsgRec ----
			btnMsgRec.setText("\u804a\u5929\u8bb0\u5f55");
			btnMsgRec.setFocusPainted(false);
			btnMsgRec.setFocusable(false);
			ChatContentPane.add(btnMsgRec, "cell 1 1,alignx right,growx 0");

			//======== spInputMsg ========
			{

				//---- tpInputMsg ----
				tpInputMsg.setToolTipText("\u8f93\u5165\u6846");
				tpInputMsg.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
				spInputMsg.setViewportView(tpInputMsg);
			}
			ChatContentPane.add(spInputMsg, "cell 0 2 2 1,grow");

			//---- btnSendMsg ----
			btnSendMsg.setText("\u53d1\u9001");
			btnSendMsg.setFocusable(false);
			btnSendMsg.setActionCommand("SendMessage");
			ChatContentPane.add(btnSendMsg, "cell 1 3,alignx right");
			Chat.setSize(600, 600);
			Chat.setLocationRelativeTo(null);
		}

		
		Chat.setVisible(true);
		Chat.setTitle(ChatTo);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	public JFrame Chat;
	private JScrollPane spHisMsg;
	private JTextPane tpHisMsg;
	private JButton btnEmoji;
	private JButton btnPic;
	private JButton btnMsgRec;
	private JScrollPane spInputMsg;
	private JTextPane tpInputMsg;
	private JButton btnSendMsg;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	public String getChatTo() {
		return ChatTo;
	}
}

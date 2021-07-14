package ui;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

import DTO.User;
import net.miginfocom.swing.*;


public class FormDetail extends Form {
    private User user;

    public FormDetail() {
        initComponents();
    }

    private void thisWindowActivated(WindowEvent e) {
        // TODO: 置组件标题为用户信息
    }

    private void btnEditActionPerformed(ActionEvent e) {

    }

    private void lbAvatarMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void tfNicknameKeyReleased(KeyEvent e) {
        // TODO add your code here
    }

    private void tfNicknameActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void tfAgeKeyReleased(KeyEvent e) {
        // TODO add your code here
    }

    private void tfAgeActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void tfHomeKeyReleased(KeyEvent e) {
        // TODO add your code here
    }

    private void tfHomeActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    public void setUser(User user) {
        this.user = user;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Detail = new JFrame();
        lbAvatar = new JLabel();
        tfNickname = new JTextField();
        lbID = new JLabel();
        tfAge = new JTextField();
        tfSex = new JTextField();
        btnEdit = new JButton();
        tfHome = new JTextField();
        tfBirthday = new JTextField();

        //======== Detail ========
        {
            Detail.setResizable(false);
            Detail.setTitle("\u4e2a\u4eba\u4fe1\u606f");
            Detail.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            Detail.addWindowListener(new WindowAdapter() {
                @Override
                public void windowActivated(WindowEvent e) {
                    thisWindowActivated(e);
                }
            });
            Container DetailContentPane = Detail.getContentPane();
            DetailContentPane.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                            "[fill]" +
                            "[fill]",
                    // rows
                    "[160]" +
                            "[160]" +
                            "[160]" +
                            "[]"));

            //---- lbAvatar ----
            lbAvatar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/jpg/\u5934\u50cf \u7537\u5b69.png"))));
            lbAvatar.setInheritsPopupMenu(false);
            lbAvatar.setFocusable(false);
            lbAvatar.setDisabledIcon(null);
            lbAvatar.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbAvatarMouseClicked(e);
                }
            });
            DetailContentPane.add(lbAvatar, "cell 0 0 1 2,align center center,grow 0 0");

            //---- tfNickname ----
            tfNickname.setEditable(false);
            tfNickname.setText("\u6635\u79f0\uff1a\u6e05\u98ce\u98de\u96ea");
            tfNickname.setMaximumSize(new Dimension(214, 214));
            tfNickname.setPreferredSize(new Dimension(80, 27));
            tfNickname.setHorizontalAlignment(SwingConstants.CENTER);
            tfNickname.setFocusable(false);
            tfNickname.setBorder(null);
            tfNickname.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    tfNicknameKeyReleased(e);
                }
            });
            tfNickname.addActionListener(e -> tfNicknameActionPerformed(e));
            DetailContentPane.add(tfNickname, "cell 1 0");

            //---- lbID ----
            lbID.setText("\u804a\u5929\u53f7\uff1a18071099");
            lbID.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            DetailContentPane.add(lbID, "cell 2 0,alignx center,growx 0");

            //---- tfAge ----
            tfAge.setEditable(false);
            tfAge.setText("\u5e74\u9f84\uff1a20");
            tfAge.setMaximumSize(new Dimension(214, 214));
            tfAge.setPreferredSize(new Dimension(80, 27));
            tfAge.setHorizontalAlignment(SwingConstants.CENTER);
            tfAge.setFocusable(false);
            tfAge.setBorder(null);
            tfAge.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    tfNicknameKeyReleased(e);
                    tfAgeKeyReleased(e);
                }
            });
            tfAge.addActionListener(e -> tfAgeActionPerformed(e));
            DetailContentPane.add(tfAge, "cell 1 1");

            //---- tfSex ----
            tfSex.setEditable(false);
            tfSex.setText("\u6027\u522b\uff1a\u7537");
            tfSex.setMaximumSize(new Dimension(214, 214));
            tfSex.setPreferredSize(new Dimension(80, 27));
            tfSex.setHorizontalAlignment(SwingConstants.CENTER);
            tfSex.setFocusable(false);
            tfSex.setBorder(null);
            tfSex.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    tfNicknameKeyReleased(e);
                    tfAgeKeyReleased(e);
                }
            });
            DetailContentPane.add(tfSex, "cell 2 1");

            //---- btnEdit ----
            btnEdit.setText("\u4fee\u6539");
            btnEdit.setFocusable(false);
            btnEdit.addActionListener(e -> btnEditActionPerformed(e));
            DetailContentPane.add(btnEdit, "cell 0 2 1 2,alignx center,growx 0,width 100:100:100");

            //---- tfHome ----
            tfHome.setEditable(false);
            tfHome.setText("\u5bb6\u4e61\uff1a\u5317\u4eac");
            tfHome.setMaximumSize(new Dimension(214, 214));
            tfHome.setPreferredSize(new Dimension(80, 27));
            tfHome.setHorizontalAlignment(SwingConstants.CENTER);
            tfHome.setFocusable(false);
            tfHome.setBorder(null);
            tfHome.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    tfNicknameKeyReleased(e);
                    tfAgeKeyReleased(e);
                    tfHomeKeyReleased(e);
                }
            });
            tfHome.addActionListener(e -> tfHomeActionPerformed(e));
            DetailContentPane.add(tfHome, "cell 1 2");

            //---- tfAge2 ----
            tfBirthday.setEditable(false);
            tfBirthday.setText("\u751f\u65e5\uff1a2000-01-01");
            tfBirthday.setMaximumSize(new Dimension(214, 214));
            tfBirthday.setPreferredSize(new Dimension(80, 27));
            tfBirthday.setHorizontalAlignment(SwingConstants.CENTER);
            tfBirthday.setFocusable(false);
            tfBirthday.setBorder(null);
            tfBirthday.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    tfNicknameKeyReleased(e);
                    tfAgeKeyReleased(e);
                }
            });
            DetailContentPane.add(tfBirthday, "cell 2 2");
            Detail.setSize(640, 480);
            Detail.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JFrame Detail;
    private JLabel lbAvatar;
    private JTextField tfNickname;
    private JLabel lbID;
    private JTextField tfAge;
    private JTextField tfSex;
    private JButton btnEdit;
    private JTextField tfHome;
    private JTextField tfBirthday;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

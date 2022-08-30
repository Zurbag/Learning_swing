package PopUpMenu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

        jFrame.add(jPanel);

        JPopupMenu jPopupMenu = new JPopupMenu();


        jPopupMenu.add(new JMenuItem("One"));
        jPopupMenu.add(new JMenuItem("Two"));

        //Добавим кнопку и слушатель
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world");
            }
        });
        jPopupMenu.add(copyItem);

        jPanel.setComponentPopupMenu(jPopupMenu);
        jFrame.revalidate();
    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}

package MenuToolBar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        //Тулбар может двигаться по форме
        //Кнопка с иконкой
        JToolBar jToolBar = new JToolBar("Some text");

        JButton jOneButton = new JButton("One", new ImageIcon("img/icons_file_24.png"));

        //Кнопка с подсветкой
        JButton jTwoButton = new JButton("Two");
        jTwoButton.setToolTipText("Second");

        //Кнопка с действием
        JButton jThreeButton = new JButton("Three");
        jThreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Press the button three!!!");
            }
        });

        //Добавляем на форму
        jToolBar.add(jOneButton);
        jToolBar.addSeparator();
        jToolBar.add(jTwoButton);
        jToolBar.add(jThreeButton);

        jPanel.add(jToolBar);



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

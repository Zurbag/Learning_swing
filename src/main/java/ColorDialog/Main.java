package ColorDialog;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    //Выбор палитры цветов
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color =  JColorChooser.showDialog(jPanel, "title", Color.CYAN);
                jPanel.setBackground(color);
            }
        });

        jPanel.revalidate();
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        return jFrame;
    }
}

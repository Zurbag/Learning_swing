package CustomDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    //Создание собственного диалога
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        });

    }

    //Для создания собственного диалога мы долны создать свой класс
    public static class MyDialog extends JDialog{
        public MyDialog() {
            //jFrame, - где выводим
            // "Title", - заголовок
            // true - модальность, не модальность
            super(jFrame, "Title", true);
            //Добавим текстовое поле
            add(new JTextField(), BorderLayout.NORTH);
            //Кнопку
            add(new JButton("Button"),BorderLayout.SOUTH);
            //Размеры
            setBounds(500,500,250,150);
        }
    }

    public static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 300, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }


}






package EventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("submit");
        jPanel.add(jButton);

        //Изменячем заголовок приложения
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Говорим что явно у кнопки на которой случилось событие мы возбмем текст
//                //И установим на Заголовок панели
//                jFrame.setTitle(((JButton)e.getSource()).getText());
//            }
//        });

        //Тоже самое с помошью Event Handler
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame,"title","source.text"));


    }

    static JFrame getJFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        return jFrame;
    }
}

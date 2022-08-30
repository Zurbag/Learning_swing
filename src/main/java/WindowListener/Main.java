package WindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Нужен для обработки взаимодействия с диологовыми окнами
public class Main {
    public static void main(String[] args) {
        // Обрабатываем события окон
        JFrame jFrame = getFrame();

        //Можно добавть слушатель окна
//        jFrame.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });

        //Но лучше использовать другой способ который позволит использовать только то что нам нужно
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                int i = 0;
                System.out.println(i);
            }
        });
    }

    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
        return jFrame;
    }
}

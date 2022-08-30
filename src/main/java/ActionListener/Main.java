package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        //Создади панель для кнопок
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        //Добавляем кнопку
        JButton jButton = new JButton("Submit");
        jPanel.add(jButton);
        //Добаваляем действия кнопки через анонимный класс можно и через отдельный класс
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });
    }

    private static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        return jFrame;
    }

}

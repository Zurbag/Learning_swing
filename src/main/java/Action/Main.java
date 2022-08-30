package Action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Так можно сразу положить экшен в объект с кнопкой
        JButton jButton = new JButton(new MyAction());
        //Текст кнопки можно задать так
        jButton.setText("Set color");
        jPanel.add(jButton);

    }

    //Наследуемся от абстрактного класса что бы узать его офигенские методы
    static class MyAction extends AbstractAction {

        MyAction(){
            //Тут можно передать различные свойства в кнопку
            putValue(AbstractAction.SHORT_DESCRIPTION, "MySmallAction");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.GREEN);
        }
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

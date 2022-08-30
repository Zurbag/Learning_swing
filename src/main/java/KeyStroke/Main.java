package KeyStroke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.security.Key;

//Сочетания клавиш для кнопок
public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("submit");
        jPanel.add(jButton);

        //Сочетание клавиш которое ждем
        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        //Что должно быть в фокусе для того что бы срабатывало сочетание клавиш
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        //Идентификация кнопки с объектом
        inputMap.put(keyStroke, "changeColor");
        //Создаем actionMap на для кнопок панели
        ActionMap actionMap = jPanel.getActionMap();
        //Если пришел changeColor выполнить myAction
        actionMap.put("changeColor", myAction);


    }

    static class MyAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.GREEN);
        }
    }

    private static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
        return jFrame;
    }
}

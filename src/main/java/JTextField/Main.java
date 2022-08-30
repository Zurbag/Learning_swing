package JTextField;

import javax.swing.*;

//Вводим текст
public class Main {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        //Добавляется лейбл
        jPanel.add(new JLabel("this is label"));
        //Добавляем свойства лейблу
//        JLabel jLabel = new JLabel();
//        jLabel.setText("Some Text");

        //Добавляем поле 20 символов
        jPanel.add(new JTextField("default value",20));

        //Добавление свойств полю
//        JTextField jTextField = new JTextField();
//        jTextField.setText("Text");
//        jTextField.setBounds(20,50,200,200);
//        //Переотображаем и revalidate() - перепроверяет границы и поля;
//        jPanel.add(jTextField);
        jPanel.revalidate();


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

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
        jPanel.add(new JTextField("default value", 35));

        //Добавление свойств полю
//        JTextField jTextField = new JTextField();
//        jTextField.setText("Text");
//        jTextField.setBounds(20,50,200,200);
//        jPanel.add(jTextField);

        //Поле для ввода пароля
        jPanel.add(new JLabel("Пароль"));
        jPanel.add(new JPasswordField(35));

        //Большое поле для ввода тескт тут размер 5 строк по 20 символов
        JTextArea jTextArea = new JTextArea(5, 35);
        //Размер ограничивается зоной видимости
        jTextArea.setLineWrap(true);

        //Добаим полосу прокрутки в нее добавим текстовое поле
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);

        //Переотображаем и revalidate() - перепроверяет границы и поля;
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

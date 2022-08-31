package Dialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        //На данную кнопку добавим диалог - диалог это модальное окно, хрен с программой поработаешь пока не закроешь
        JButton jButton = new JButton("show Message Dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Создаем диалоговое окно
                // jPanel - где высвечиваем,
                // "this is my dialog" - что высвечиваем
                //"some title" - заголовок
                // JOptionPane.ERROR_MESSAGE - окно опций их много влияет на цвет занчка
                JOptionPane.showMessageDialog(jPanel, "this is my dialog", "some title",JOptionPane.QUESTION_MESSAGE);
            }
        });

        //Тут кнопка вернет значение
        JButton jButton2 = new JButton("show Confirm Dialog");
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Так можно вернуть значение из кнопки
                int i = JOptionPane.showConfirmDialog(jPanel, "this is confirmation dialog", "some title", JOptionPane.YES_NO_CANCEL_OPTION);
                System.out.println("Button's value: "+i);
            }
        });


        JButton jButton3 = new JButton("show Option Dialog");
        jPanel.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Создаем диалог с опциями
                //jPanel, - куда выводим
                // "this is option dialog", - сообщение
                // "some title"-заголовок,
                // JOptionPane.DEFAULT_OPTION, - Значение кнопок по умолчанию
                // JOptionPane.ERROR_MESSAGE, - Иконка окна
                // null, - своя иконка
                // new String[]{"One","Two","Three"}, "two" - поле опций и что выбрано по умолчанию
                int optionValue = JOptionPane.showOptionDialog(jPanel,"this is option dialog", "some title",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, new String[]{"One","Two","Three"}, "two");
                System.out.println(optionValue);

            }
        });

        JButton jButton4 = new JButton("show Input Dialog");
        jPanel.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(jPanel, "some message");
                System.out.println(input);

            }
        });


    }

    public static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 300, 200, 250);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}

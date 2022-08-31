package GridBagLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Установим менеджер лейаутов
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        //Указываем сколько клеточек будет занимать наш объект
        GridBagConstraints constraints1 = new GridBagConstraints();
        //Указываем положения 0 - занимает сколько ему нужно
        constraints1.weightx = 0;
        constraints1.weighty = 0;
        //Начальныее координаты сетки му упавляем не пискселями а сеткой
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        //Сколько заниает ширина ячеек
        constraints1.gridheight = 2;
        constraints1.gridwidth = 2;

        //Кладем любой компонент на JPanel и применяем к нему конструктор
        jPanel.add(new JTextArea(4,20), constraints1);


        //Создаем еще поле кнопка
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 2; // типа отступы
        constraints2.gridy = 0;
        constraints2.gridheight = 1; //сколько ячее занимает по высоте
        constraints2.gridwidth = 2; // сколько по ширине
        jPanel.add(new JButton("!!!!submit really long name!!!!"), constraints2);


        //Создаем еще кнопку меньше и ниже
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.gridx = 2; // типа  еще
        constraints3.gridy = 1; // Указываем что опускаемя вниз на клетку
        constraints3.gridheight = 1; //сколько ячее занимает по высоте
        constraints3.gridwidth = 1; // сколько по ширине
        jPanel.add(new JButton("One Button"), constraints3);

        //Создаем еще кнопку меньше и ниже
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;
        constraints4.weighty = 0;
        constraints4.gridx = 3; //смещаемся по x
        constraints4.gridy = 1;
        constraints4.gridheight = 1;
        constraints4.gridwidth = 1;
        jPanel.add(new JButton("Two Button"), constraints4);


        //Обязательно подтверди и перересуй
        jPanel.revalidate();

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 500);
        return jFrame;
    }
}

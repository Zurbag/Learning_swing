package Sliders;

import jdk.security.jarsigner.JarSigner;

import javax.swing.*;

public class Main {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        // JSlider.HORIZONTAL - Положение на панели,
        // 0, - начальное значение
        // 100, - конечное значение
        // 20 - установленное значее для ползунка по умолчанию
        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        //Отрезки на слайдере
        //Маленткие черточки
        jSlider.setMinorTickSpacing(10);
        //Большие черточки
        jSlider.setMajorTickSpacing(20);
        //Отрисовываем отрезки
        jSlider.setPaintTicks(true);
        //Округляет значение ползунка на слайдере
        jSlider.setSnapToTicks(true);

        jPanel.add(jSlider);

        //Прописывает числа на слайдере (нужно добавлять
        // только когда доьбависл слайдерт на панель)
        jSlider.setPaintLabels(true);

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

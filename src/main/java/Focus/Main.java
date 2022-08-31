package Focus;

import javax.swing.*;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        //При нажатии таб фокус будет перемешаться между кнопками
        jPanel.add(new JButton("submit1"));

        //Кнопка не будет появляться в фокусе при нажатии таб
        jPanel.add(new JButton("submit2")).setFocusable(false);

        //Делаем фокус в самом начале программы
        jPanel.add(new JButton("submit3")).requestFocusInWindow();
        jFrame.revalidate();

    }

    public static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 300, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}

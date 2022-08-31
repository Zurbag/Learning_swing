package CustomLayout;

import javax.swing.*;
import java.awt.*;


public class Main {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    //Делаем Layout Manager который располагает все элементы по диагонали
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Устанавливаем Layout
        jPanel.setLayout(new MyLayout());
        JButton jButton1 = new JButton("One");
        JButton jButton2 = new JButton("Two");
        JButton jButton3 = new JButton("Three");

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        jPanel.revalidate();
    }

    //Создаем Свой Layout
    static class MyLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        //Изменяем этот метод
        @Override
        public void layoutContainer(Container parent) {
            //Получаем список компонентов которые видит менеджер лайаутов
            for (int i = 0; i < parent.getComponentCount(); i++) {
                Component component = parent.getComponent(i);
                component.setBounds(i * 100, i*40, 100, 40);
            }
        }
    }

    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 500);

        return jFrame;
    }
}

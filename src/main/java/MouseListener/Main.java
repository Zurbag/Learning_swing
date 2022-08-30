package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    static JFrame jFrame = getFrame();


    //Перехват мышки
    public static void main(String[] args) throws Exception {
        //На этом компоненте будем рисовать
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        //Добавляем компонет в котором реализован метод отображения координат
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoordinates = e.getX();
                MyComponent.yCoordinates = e.getY();
                //Передаем координаты на компонент
                jComponent.repaint();

            }
        });
    }

    //Отслеживаем движение мыши
    static class MyComponent extends JComponent {
        public static int xCoordinates;
        public static int yCoordinates;
        //Координаты в строку
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D) g).drawString("Coordinates x: " + xCoordinates + " Coordinates y: " + yCoordinates, 50, 50);
        }
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 500);
        return jFrame;
    }
}

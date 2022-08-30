package JComponetn;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        //Добавляем компонент на форму
        jFrame.add(new MyComponent());

    }

    static class MyComponent extends JComponent {
        //Посмотреть шрифты в системе
//        String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        Arrays.stream(fonts).forEach(p -> System.out.println(p));

        //Переопределяем метод для рисования
        @Override
        protected void paintComponent(Graphics g) {
            //Преобразуем график в новый формат
            Graphics2D graphics2D = (Graphics2D) g;

            //Устанавливаем шрифты
            //Параметры
            // "Arial Black" - Название шрифта
            // Font.BOLD - Тип шрифта
            // 20 - Размер
            Font font = new Font("Arial", Font.ITALIC, 15);
            graphics2D.setFont(font);

            //Рисуем строку
            //Что рисуем
            //Координаты
            graphics2D.drawString("Hello World", 50, 50);

            //Рисуем Линию c помощью координат
            //Передаем координаты
            Line2D line2D1 = new Line2D.Double(50, 60, 200, 60);
            //Отображаем линию
            graphics2D.draw(line2D1);

            //Рисуем линию с помошью начальной и конечной точки
            Point2D p1 = new Point2D.Double(50, 70);
            Point2D p2 = new Point2D.Double(200, 70);

            Line2D line2D2 = new Line2D.Double(p1, p2);
            //Комманда на отрисовку
            graphics2D.draw(line2D2);

            //Рисуем элипс
            //Координаты расположение, не поцентру, размеры
            Ellipse2D ellipse2D = new Ellipse2D.Double(50, 80, 150, 150);
            //Можно отрисовать
            graphics2D.draw(ellipse2D);

            //Можно передать цвет
            graphics2D.setPaint(new Color(125));
            //А можно закрасить
            graphics2D.fill(ellipse2D);

            //Вывести изображение
            try {
                URL url = new URL("https://www.purinaone.ru/cat/sites/default/files/2018-04/article_indoor-outdoor_0.png");
                Image image = new ImageIcon(url).getImage();
                graphics2D.drawImage(image, 220,50 ,null);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

            //Рисуем прямоугольник
            Rectangle2D rectangle2D = new Rectangle2D.Double(250, 60, 120, 120);
            graphics2D.draw(rectangle2D);

        }
    }

    static JFrame getFrame() {
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

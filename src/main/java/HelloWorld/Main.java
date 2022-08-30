package HelloWorld;

import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {
        //Основной класс для работы с окнами
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        //Закрытие обязательно нужно прописать
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("My First App");
        //Изображения заголовка
//        jFrame.setIconImage();
        //Размеры
//        jFrame.setSize(300, 300);

        //Также можно сделать так что бы оо ставилосьб по середине
        //Нужно получить размеры окна виндовс
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //Получаем размер окна
        Dimension dimension = toolkit.getScreenSize();
        //Устанавливем размеры получаем центр и из него вычитаем половину ширины и высоты приложения
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);

    }
}

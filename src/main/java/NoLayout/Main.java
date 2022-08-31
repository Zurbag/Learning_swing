package NoLayout;

import javax.swing.*;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    //Не используем лайоут отлючаем FlowLayout панель становится не расширяемой, лучше использовать Лайауты
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Отчлючаем все Layout
        jPanel.setLayout(null);
        JButton jButton = new JButton("submit");
        //Указываем расположени кнопки
        jButton.setBounds(50,50, 150, 40);
        //Добавляем на панель
        jPanel.add(jButton);

        jPanel.revalidate();
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        return jFrame;
    }
}

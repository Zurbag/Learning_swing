package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);

        file.add(new JMenuItem("Open", new ImageIcon("img/icons_file_24.png")));
        file.add(new JMenuItem("Save", 'S'));
        file.addSeparator();

        //Добавляем выход
        JMenuItem exitItem = file.add(new JMenuItem("Exit"));
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Добавляем выход с помощью горячих клавиш
        exitItem.setAccelerator(KeyStroke.getKeyStroke("ctrl Q"));


        //Сделать недоступным но видимым
        JMenuItem editItem = edit.add(new JMenuItem("Cut"));
        editItem.setEnabled(false);

        edit.add(new JMenuItem("Copy"));

        //Создаем вложенное меню
        JMenu options = new JMenu("Options");
        options.add(new JMenuItem("One"));
        options.add(new JMenuItem("Two"));
        edit.add(options);

        //Добавим Чек бокс меню
        edit.add(new JCheckBoxMenuItem("CheckBox"));

        //Добавляем радиобатон
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem jRadioButtonMenuItem1 = new JRadioButtonMenuItem("One");
        JRadioButtonMenuItem jRadioButtonMenuItem2 = new JRadioButtonMenuItem("Two");
        buttonGroup.add(jRadioButtonMenuItem1);
        buttonGroup.add(jRadioButtonMenuItem2);
        edit.add(jRadioButtonMenuItem1);
        edit.add(jRadioButtonMenuItem2);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();

    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500,500);

        return jFrame;
    }
}

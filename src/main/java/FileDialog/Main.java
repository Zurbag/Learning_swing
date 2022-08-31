package FileDialog;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    //Создание собственного диалога
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show file dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Для работы с проводником используется данный класс
                JFileChooser fileChooser = new JFileChooser();


                //Позволяет указать что мы выбираем
//                 JFileChooser.DIRECTORIES_ONLY - позволяет выбрать только директории
//                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                //Позволяет делать множественный выбор
//                fileChooser.setMultiSelectionEnabled(true);

                //Есть fileChooser для сохранения
//                fileChooser.showSaveDialog(jPanel);

                //Для вывода своих значений
//                fileChooser.showDialog(jPanel, "Выбрать");
//                fileChooser.setCurrentDirectory(new File("."));

                //Открыть заранее выбранный файл
//                fileChooser.setSelectedFile(new File("."));

                //Установка фильтров выбираем только картинки gif
//                fileChooser.setFileFilter(new FileFilter() {
//                    @Override
//                    public boolean accept(File f) {
//                        if (f.getName().endsWith("gif")) {
//                            return true;
//                        }
//                        return false;
//                    }
//
//                    @Override
//                    public String getDescription() {
//                        return "Only gif files";
//                    }
//                });


                //Можно добавлять свои компоненты
//                TextField textField = new TextField("My Text field", 50);
//                fileChooser.add(textField, BorderLayout.WEST);
//
//                //Отправляем в поле пути к выбранному файлу
//                fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
//                    @Override
//                    public void propertyChange(PropertyChangeEvent evt) {
//                        textField.setText(evt.getSource().toString());
//                    }
//                });

                //Получение значений

                //Открыть диалог Open почему-то работает только если ниже фильтра
//                fileChooser.showOpenDialog(jPanel);

                //Получить значение выбранного файла
                //Если выбрана папка вернется 1
                //Если файл то 0
//                int i = fileChooser.showOpenDialog(jPanel);
//                System.out.println(i);


                //Узнаем какой файл был или папка были выбраны
                fileChooser.showOpenDialog(jPanel);
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getName());

            }

        });


        jPanel.revalidate();
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







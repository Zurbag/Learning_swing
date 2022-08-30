package RadioButton;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Рисуем чек бокс
        jPanel.add(new JCheckBox("CheckBox Label"));

        //Рисуем радио баттон
        JRadioButton jRadioButton1 = new JRadioButton();
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("One");
        JRadioButton jRadioButton2 = new JRadioButton();
        jRadioButton2.setText("Two");

        //Что бы выбрать только 1 нужно поместить их в button Group
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);

        //Границы и Title у них
        Border border = BorderFactory.createEtchedBorder( );
        Border borderTitle = BorderFactory.createTitledBorder(border, "Title");
        jPanel.setBorder(borderTitle);


        //Компонент для множетвенноговы выбора
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.insertItemAt("One", 0);
        comboBox.addItem("Two");
        comboBox.addItem("Three");
        comboBox.addItem("Four");
        jPanel.add(comboBox);
        jPanel.revalidate();
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

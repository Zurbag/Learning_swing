package BorderGridLayout;
import javax.swing.*;
import java.awt.*;

public class Test {
    static JFrame jFrame = getFrame();
    public static void main(String[] args) {

        JPanel jPanel = new JPanel();

        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(new JButton("One"));
        jPanel.add(new JButton("Two"));
        jPanel.add(new JButton("Three"));
        jPanel.add(new JButton("Four"));
        jFrame.add(jPanel);
        jFrame.revalidate();

    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}

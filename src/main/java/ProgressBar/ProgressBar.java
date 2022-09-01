package ProgressBar;

import javax.swing.*;

public class ProgressBar {
    int i = 0;
    int num = 0;
    JFrame frame;
    JProgressBar jProgressBar;

    public static void main(String[] args) {
        ProgressBar progressBar = new ProgressBar();
        progressBar.iterate();
    }

    public ProgressBar() {
        frame = new JFrame("Progressbar Example");
        frame.setBounds(550, 200,250, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        jProgressBar = new JProgressBar(0, 2000);
        jProgressBar.setBounds(40,40,160,30);
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(true);

        frame.add(jProgressBar);
    }

    public void iterate(){
        while (i <= 2000){
            jProgressBar.setValue(i);
            i = i+20;
            try {
                Thread.sleep(150);
            }catch (Exception e){

            }
        }
    }
}

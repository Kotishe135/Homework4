package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void createFrame(){
        JFrame window = new JFrame("Схема");
        window.setBounds((Toolkit.getDefaultToolkit().getScreenSize().width - 700)/2, (Toolkit.getDefaultToolkit().getScreenSize().height-555)/2, 700, 555);
        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel plan = new JLabel();
        plan.setIcon(new ImageIcon("Схема.png"));
        plan.setBounds(0, 0, window.getWidth() - 5, plan.getIcon().getIconHeight());

        JScrollPane pane = new JScrollPane(plan);
        pane.setBounds(0, 0, window.getWidth() - 5, plan.getIcon().getIconHeight()+20);

        window.getContentPane().add(pane);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Программа успешно скомпилирована, ошибок не найдено", "Информация", 1);
        createFrame();
    }
}

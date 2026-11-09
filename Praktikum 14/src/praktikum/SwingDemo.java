package praktikum;

import java.awt.*;

import javax.swing.*;

public class SwingDemo {
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    Container contentPane;
    public SwingDemo() { }
    void launchFrame() {
        frame = new JFrame("My First Swing Application");
        panel = new JPanel();
        textField = new JTextField("Default text");
        button = new JButton("Click me!");
        contentPane = frame.getContentPane();
        panel.add(textField);
        panel.add(button);
        contentPane.add(panel, BorderLayout.CENTER);
        frame.pack(); frame.setVisible(true);
    }
    public static void main(String args[]) {
        SwingDemo sd = new SwingDemo();
        sd.launchFrame();
    }
}
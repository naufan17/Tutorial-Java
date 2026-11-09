package praktikum;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneDemo {
    JOptionPane optionPane;
    public JOptionPaneDemo() { }
    void launchFrame() {
        optionPane = new JOptionPane();
        String name = optionPane.showInputDialog("Hi, what's yourname?");
        optionPane.showMessageDialog(null,"Nice to meet you, " + name + ".", "Greeting...",optionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    public static void main(String args[]) {
        new JOptionPaneDemo().launchFrame();
    }
}

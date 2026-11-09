package praktikum;

import java.awt.*;
public class GridLayoutDemo extends Frame {
    public GridLayoutDemo() { }
    public static void main(String args[]) {
        GridLayoutDemo gld = new GridLayoutDemo();
        gld.setLayout(new GridLayout(2, 3, 4, 4));
        gld.add(new Button("ONE"));
        gld.add(new Button("TWO"));
        gld.add(new Button("THREE"));
        gld.add(new Button("FOUR"));
        gld.add(new Button("FIVE"));
        gld.setSize(200, 200);
        gld.setVisible(true);
    }
}

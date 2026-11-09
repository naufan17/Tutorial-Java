package praktikum;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(new Integer(1));
        v.addElement(new Integer(3));
        v.addElement(new Integer(5));
        v.addElement(new Integer(7));
        v.addElement(new Integer(9));

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        v.setElementAt(new Integer(2), 0);
        v.removeElementAt(4);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }

        e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println(v.contains(new Integer(1)));
        System.out.println(v.contains(new Integer(2)));
    }
}
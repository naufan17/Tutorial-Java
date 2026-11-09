package praktikum;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class TestHashtable {
    public static void main(String[] args) {
        Vector v = new Vector();
        Hashtable h = new Hashtable();
        h.put("nim", "01");
        h.put("nama", "Budi");
        h.put("alamat", "Bantul");
        v.addElement(h);

        h = new Hashtable();
        h.put("nim", "02");
        h.put("nama", "Andi");
        h.put("alamat", "Sleman");
        v.addElement(h);

        h = new Hashtable();
        h.put("nim", "03");
        h.put("nama", "Dewi");
        h.put("alamat", "Kodya");
        v.addElement(h);

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Hashtable h2 = (Hashtable) e.nextElement();
            System.out.println(h2.get("nim") + " " + h2.get("nama") + " " + h2.get("alamat"));
        }
    }
}

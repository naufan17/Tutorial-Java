package praktikum;

class ThrowingClass {
    static void myMethod() throws ClassNotFoundException {
        throw new ClassNotFoundException("just a demo");
    }
}
public class ThrowsDemo {
    public ThrowsDemo() { }
    public static void main(String args[]) {
        try {
            ThrowingClass.myMethod();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
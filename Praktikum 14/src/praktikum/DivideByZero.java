package praktikum;

public class DivideByZero {
    public DivideByZero() { }
    public static void main(String args[]) {
        try {
            System.out.println(3/0);
            System.out.println("Please print me.");
        } catch(ArithmeticException exc) {
            System.out.println(exc);
        }
        System.out.println("After exception.");
    }
}
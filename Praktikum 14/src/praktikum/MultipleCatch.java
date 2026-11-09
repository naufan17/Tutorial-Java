package praktikum;

public class MultipleCatch {
    public MultipleCatch() { }
    public static void main(String args[]) {
        try {
            int den = Integer.parseInt(args[0]); //line 4
            System.out.println(3/den); //line 5
        } catch (ArithmeticException exc) {
            System.out.println("Divisor was 0.");
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Missing argument.");
        }
        System.out.println("After exception.");
    }
}
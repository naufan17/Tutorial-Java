package praktikum;

public class FinallyDemo {
    public FinallyDemo() { }
    static void myMethod(int n) throws Exception {
        try {
            switch(n) {
                case 1: System.out.println("first case");
                    return;
                case 3: System.out.println("third case");
                    throw new RuntimeException("third case demo");
                case 4: System.out.println("fourth case");
                    throw new Exception("fourth case demo");
                case 2: System.out.println("second case");
            }
        } catch (RuntimeException e) {
            System.out.print("RuntimeException caught: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try-block is entered.");
        }
    }
    public static void main(String args[]){
        for (int i=1; i<=4; i++) {
            try {
                FinallyDemo.myMethod(i);
            } catch (Exception e) {
                System.out.print("Exception caught: ");
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}

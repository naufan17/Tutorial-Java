public class ArraySample {
    public static void main( String[] args ) {
        int[] ages = new int[100];
        
        for(int i = 0; i < 100; i++) {
            ages[i] = i * 2;
        }
        
        for(int i = 0; i < 100; i++) {
            System.out.println(ages[i]);
        }
    }
}
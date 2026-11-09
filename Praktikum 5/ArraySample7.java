public class ArraySample7 {
    public static void main(String[] args) {
        int[][] arr = new int[7][];
        
        for (int i = 0; i < 6; i++) {
            arr[i] = new int[i];
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = j;
            }
        }
        
        for (int i = 6; i > 0; i--) {
            arr[i] = new int[i];
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = j;
            }
        }
        
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
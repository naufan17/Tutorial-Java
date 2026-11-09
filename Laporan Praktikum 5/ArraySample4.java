import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySample4{
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String[][] dataMhs = new String[5][3];
        System.out.println("Input Data Mahasiswa");

        for(byte i = 0; i < dataMhs.length; i++) {
            try {
                System.out.println("Data Ke-"+(i+1));
                
                System.out.print("NIM : ");
                String input = dataIn.readLine();
                dataMhs[i][0] = input;
                
                System.out.print("Nama : ");
                input = dataIn.readLine();
                dataMhs[i][1] = input;
                
                System.out.print("Umur : ");
                input = dataIn.readLine();
                dataMhs[i][2] = input;
                
                System.out.println();
                
            } catch (IOException e) {
                System.out.println("Error in getting input");
            }
        }

        System.out.println("Tampilan Data Mahasiswa");
        System.out.println("=======================");

        for(byte i = 0; i < dataMhs.length; i++) {
            System.out.println("Data Ke-" + (i + 1));
            System.out.println("Nim : " + dataMhs[i][0]);
            System.out.println("Nama : " + dataMhs[i][1]);
            System.out.println("Umur : " + dataMhs[i][2]);
            System.out.println();
        }
    }
}
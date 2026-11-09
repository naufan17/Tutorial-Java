package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchEngine {
    public static void main( String[] args )
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input kata : ");
            String input = dataIn.readLine();
            String strOrig = input;
            System.out.print("Masukkan kata yang dicari : ");
            String search = dataIn.readLine();
            int intIndex = strOrig.indexOf(search);
            if(intIndex == -1) {
                System.out.println("Pencarian tidak bisa ditemukan");
            } else {
                System.out.println("Kata tersebut ditemukan pada index ke- " + intIndex);
            }
        } catch (IOException e) {
            System.out.println("Error in getting input");
        }
    }
}

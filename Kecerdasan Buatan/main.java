import java.util.*;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat digit = new DecimalFormat("0");

        String gejala1, gejala2;
        String G1 = "demam";
        String G2 = "batuk";
        String G3 = "sesak napas";
        String G4 = "pilek";
        String G5 = "bersin-bersin";
        double P1 = 0;
        double P2 = 0;
        double J = 0; 
        double C = 0;
        double F = 0;

        // menginputkan gejala
        System.out.print("Apa gejala anda : ");
        gejala1 = input.nextLine();
        System.out.print("Apa gejala anda : ");
        gejala2 = input.nextLine();
        System.out.println("Gejala 1 " + gejala1);
        System.out.println("Gejala 2 " + gejala2);

        // menghitung gejala pertama yang muncul pada penyakit covid
        if (gejala1.equals(G1)){
            P1 = P1 + 1;
        } else if (gejala1.equals(G2)){
            P1 = P1 + 1;
        } else if (gejala1.equals(G3)){
            P1 = P1 + 1;
        }

        // menghitung gejala kedua yang muncul pada penyakit covid
        if (gejala2.equals(G1)){
            P1 = P1 + 1;
        } else if (gejala2.equals(G2)){
            P1 = P1 + 1;
        } else if (gejala2.equals(G3)){
            P1 = P1 + 1;
        }
        
        // menghitung gejala pertama yang muncul pada penyakit flu
        if (gejala1.equals(G2)){
            P2 = P2 + 1;
        } else if (gejala1.equals(G4)){
            P2 = P2 + 1;
        } else if (gejala1.equals(G5)){
            P2 = P2 + 1;
        }

        // menghitung gejala kedua yang muncul pada penyakit flu
        if (gejala2.equals(G2)){
            P2 = P2 + 1;
        } else if (gejala2.equals(G4)){
            P2 = P2 + 1;
        } else if (gejala2.equals(G5)){
            P2 = P2 + 1;
        }

        // jumlah gejala dari kedua penyakit
        J = P1 + P2;

        // gejala yang muncul dari penyakit 1 dibagi jumlah gejala dari kedua penyakit
        C = P1 / J * 100;
        System.out.println("Prosentase penyakit covid " + digit.format(C) + "%");

        // gejala yang muncul dari penyakit 2 dibagi jumlah gejala dari kedua penyakit
        F = P2 / J * 100;
        System.out.println("Prosentase penyakit flu " + digit.format(F) + "%");
    }
}
 
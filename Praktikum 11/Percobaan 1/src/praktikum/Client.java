package praktikum;

import java.net.*;
import java.io.*;

public class Client
{
    public static void main(String[] args) {
        try {
            String pesanMasuk;
            String pesanKeluar;
            Socket server = new Socket("localhost",2000);
            System.out.println("Client menghubungi server localhost pada port 2000...");

            BufferedReader sin = new BufferedReader(new InputStreamReader(server.getInputStream()));
            PrintStream sout = new PrintStream(server.getOutputStream());
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

            do {
                System.out.print("Client : ");
                pesanKeluar = stdin.readLine();
                sout.println(pesanKeluar);

                pesanMasuk = sin.readLine();
                System.out.print("Server : " + pesanMasuk + "\n");
            } while (!pesanKeluar.equalsIgnoreCase("stop"));

            sin.close();
            sout.close();
            stdin.close();
            server.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

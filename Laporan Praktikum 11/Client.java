package praktikum;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            String pesanKeluar;
            String pesanMasuk;
            Socket server = new Socket("localhost", 5000);
            System.out.println("Client menghubungi server localhost pada port 5000...");

            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            do {
                System.out.print("Client : ");
                pesanKeluar = input.readLine();
                out.writeBytes(pesanKeluar + "\n");

                pesanMasuk = in.readLine();
                System.out.println("Server : " + pesanMasuk);
            } while (!pesanKeluar.equalsIgnoreCase("stop"));

            in.close();
            out.close();
            input.close();
            server.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

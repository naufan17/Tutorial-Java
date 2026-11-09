package praktikum;

import java.net.*;
import java.io.*;

public class ClientHandler extends Thread {
    private Socket client;
    public ClientHandler(Socket client) {
        this.client = client;
        start();
    }

    public void run() {
        try {
            String pesanMasuk;
            String pesanKeluar;

            BufferedReader cin = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream cout = new PrintStream(client.getOutputStream());
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

            do {
                pesanMasuk = cin.readLine();
                System. out.print("Client : " + pesanMasuk + "\n");

                System.out.print("Server : ");
                pesanKeluar = stdin.readLine();
                cout.println(pesanKeluar);
            } while (!pesanMasuk.equalsIgnoreCase("stop"));

            cin.close();
            cout.close();
            stdin.close();
            client.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

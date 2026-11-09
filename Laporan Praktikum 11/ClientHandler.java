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
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            do {
                pesanMasuk = in.readLine();
                System.out.print("Client : " + pesanMasuk + "\n");
                out.writeBytes("Pesan diterima\n");
            } while (!pesanMasuk.equalsIgnoreCase("stop"));

            in.close();
            out.close();
            client.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

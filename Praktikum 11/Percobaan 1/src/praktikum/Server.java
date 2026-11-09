package praktikum;

import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2000);
            System.out.println("Server siap pada port 2000...");
            while(true){
                Socket client = server.accept();
                new ClientHandler(client);
            }
//            server.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package praktikum;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server extends Thread{
    private ServerSocket serverSocket;
    private final Vector<Socket> clientList = new Vector<>();
    private final int port;

    public Server(){
        // input port
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan port : ");
        port = keyboard.nextInt();

        // start server
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.setReuseAddress(true);
        } catch (IOException e) {
           e.getStackTrace();
        }
    }

    public void acceptClient() throws IOException {
        System.out.println("Menunggu Client...");
        while(true) {
            // accept client
            Socket client = serverSocket.accept();
            // add client socket to vector client list
            clientList.add(client);
            ClientHandler handler = new ClientHandler(client,this);
            // start new thread client
            Thread t = new Thread(handler);
            t.start();
        }
    }

    public synchronized void broadcastMassage(String msg) throws IOException {
        for (Socket client : clientList) {
            if (!client.isClosed()) {
                PrintWriter pw = new PrintWriter(client.getOutputStream());
                pw.println(msg);
                pw.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Server().acceptClient();
    }
}
package praktikum;

import java.net.*;
import java.io.*;

public class ChatServer
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(2000);
        System.out.println("Server siap pada port 2000...");
        System.out.println("Menunggu Klien mengirim pesan pertama...");
        System.out.println("Chat dilakukan 2 arah, server dan klien bergantian kirim pesan");
        Socket sk = ss.accept();
        System.out.println("Untuk berhenti, ketik stop pada klien\n");
        BufferedReader cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream cout = new PrintStream(sk.getOutputStream());
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ( true ) {
            s = cin.readLine();
            if (s.equalsIgnoreCase("stop")) {
                cout.println("Bye");
                break;
            }
            System. out.print("Client : " + s + "\n");
            System.out.print("Server : ");
            s = stdin.readLine();
            cout.println(s);
        }
        ss.close();
        sk.close();
        cin.close();
        cout.close();
        stdin.close();
    }
}

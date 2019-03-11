package se.task11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 6666;

        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting for a client...");

            Socket socket = ss.accept();

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line;
            while(true) {
                line = in.readUTF();
                System.out.println("Client: " + line);
                System.out.print("Server: ");
                String response = new Scanner(System.in).nextLine();
                out.writeUTF(response);
                out.flush();
            }
        } catch(Exception x) { x.printStackTrace(); }
    }
}
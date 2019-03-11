package se.task11;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void execute() {
        int serverPort = 6666;
        String address = "127.0.0.1";

        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            Socket socket = new Socket(ipAddress, serverPort);

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line;

            while (true) {
                System.out.print("Client: ");
                line = keyboard.readLine();
                out.writeUTF(line);
                out.flush();
                line = in.readUTF();
                System.out.println("Server: " + line);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
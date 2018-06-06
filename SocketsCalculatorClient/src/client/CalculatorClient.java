package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CalculatorClient {

    private Socket client;

    private CalculatorClient(Socket client) {
        this.client = client;
    }

    public static void main(String args[]) throws IOException {

        String hostName = "127.0.0.1";
        int portNumber = 12345;

        try (
                Socket socket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String fromServer;
            String fromUser;

            do {
                fromUser = stdIn.readLine();
                System.out.println("Client: " + fromUser);
                out.println(fromUser);

                fromServer = in.readLine();
                System.out.println("Server: " + fromServer);

                if (fromUser.equals("Adios"))break;
            }while (true);

        } catch (UnknownHostException e) {
            System.err.println("Don't know about Host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O form the connection to " + hostName);
            System.exit(1);
        }

    }
}
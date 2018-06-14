package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CalculatorClient {

    public static void main(String args[]) throws IOException {

        String hostName = "127.0.0.1";
        int portNumber = 54321;

        try (
                Socket Socket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter(Socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(Socket.getInputStream()));) {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String fromServer;
            String fromUser;

            while ((fromServer = in.readLine()) != null) {
                System.out.println("Server: " + fromServer);
                if (fromServer.equals("Bye")) {
                    System.out.println("Fim do Cliente");
                    break;
                }

                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    out.println(fromUser);
                }

                if (fromUser.equals("Bye")) {
                    System.out.println("Fim do Cliente");
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about Host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O form the connection to " + hostName);
            System.exit(1);
        }
    }
}
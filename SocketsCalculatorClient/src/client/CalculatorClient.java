package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CalculatorClient implements Runnable {

    private Socket client;

    public CalculatorClient(Socket client) {
        this.client = client;
    }

    public static void main(String args[]) throws IOException {

        String hostName = "127.0.0.1";
        int portNumber = 12345;

        Socket socket = new Socket(hostName, portNumber);

        CalculatorClient c = new CalculatorClient(socket);
        Thread t = new Thread(c);
        t.start();
    }

    public void run() {

        do {
            try {
                PrintWriter out = new PrintWriter(this.client.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
                {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
                    String fromServer;
                    String fromUser;

                    System.out.println("O cliente conectou ao servidor");

                    while ((fromServer = in.readLine()) != null) {
                        System.out.println("Server: " + fromServer);
                        if (fromServer.equals("Bye.")) {
                            break;
                        }

                        fromUser = stdIn.readLine();
                        if (fromUser != null) {
                            System.out.println("Client: " + fromUser);
                            out.println(fromUser);
                        }

                        if (fromUser.equals("Bye")){
                            out.println("Bye");
                            break;
                        }
                    }
                    System.out.println("Fim do cliente!");
                    this.client.close();
                }

            } catch (UnknownHostException e) {
                System.err.println("Don't know about Host ");
                System.exit(1);
            } catch (IOException e) {
                System.err.println("Couldn't get I/O form the connection");
                System.exit(1);
            }

        } while (true);
    }
}
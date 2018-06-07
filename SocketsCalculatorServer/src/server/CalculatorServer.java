package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer implements Runnable {

    public Socket client;

    public CalculatorServer(Socket client) {
        this.client = client;
    }

    public static void main(String[] args) throws IOException {
        int portNumber = 12345;

        ServerSocket server = new ServerSocket(portNumber);
        System.out.println("Porta " + portNumber + " aberta!");
        System.out.println("Aguardando conexão do cliente...");

        while (true) {
            Socket client = server.accept();
            CalculatorServer treatment = new CalculatorServer(client);
            Thread t = new Thread(treatment);
            t.start();
        }
    }

    public void run() {
        System.out.println("Nova conexão com o cliente " + this.client.getInetAddress().getHostAddress());

        do {
            try {
                PrintWriter out = new PrintWriter(this.client.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
                {

                    String inputLine;
                    String outputLine;
                    outputLine = "ola";
                    System.out.println("Server: " + outputLine);
                    out.println(outputLine);
                    inputLine = in.readLine();
                    System.out.println("Client: " + client.getRemoteSocketAddress() + " said " + inputLine);

                    if (inputLine.equals("Bye")) {
                        out.println("Bye");
                        break;
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (true);

    }
}

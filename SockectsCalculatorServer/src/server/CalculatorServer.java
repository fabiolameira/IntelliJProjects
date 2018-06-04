package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer implements Runnable {

    public Socket client;

    public CalculatorServer(Socket client) {
        this.client = client;
    }

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");
        System.out.println("Aguardando conexão do cliente...");

        while (true) {
            Socket client = server.accept();

            CalculatorServer connection = new CalculatorServer(client);
            Thread thread = new Thread(connection);
            thread.start();
        }
    }

    public void run() {
        System.out.println("Nova conexao com o cliente " + this.client.getInetAddress().getHostAddress());

        try {
            Scanner scanner = null;
            scanner = new Scanner(this.client.getInputStream());

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
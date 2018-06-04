package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient implements Runnable {

    private Socket client;

    public CalculatorClient(Socket client){
        this.client = client;
    }

    public static void main(String args[]) throws IOException {

        Socket socket = new Socket("127.0.0.1", 12345);

        CalculatorClient client = new CalculatorClient(socket);
        Thread thread = new Thread(client);
        thread.start();
    }

    public void run() {
        try {
            PrintStream output;
            System.out.println("O cliente conectou ao servidor");

            Scanner keyboard = new Scanner(System.in);
            output = new PrintStream(this.client.getOutputStream());

            while(keyboard.hasNextLine()){
                output.println(keyboard.nextLine());
            }

            output.close();
            keyboard.close();
            this.client.close();
            System.out.println("Fim do cliente!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
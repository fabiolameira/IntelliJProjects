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
        int portNumber = 54321;

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

        try {
            CalculatorOperations calculatorOperations = new CalculatorOperations();
            PrintWriter out = new PrintWriter(this.client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            {
                String inputLine;
                String outputLine = "Olá Senhor Utilizador :D";

                float value01;
                float value02;
                String operation;
                float total = 0;
                System.out.println("Server: " + outputLine);
                out.println(outputLine);
                inputLine = in.readLine();
                System.out.println("Client: " + inputLine);

                do {
                    System.out.println("Diga-nos o 1º Valor:");
                    outputLine = "Diga-nos o 1º Valor:";
                    do {
                        try {
                            out.println(outputLine);
                            inputLine = in.readLine();
                            value01 = Float.parseFloat(inputLine);
                            break;
                        }catch (NumberFormatException e) {
                            System.out.println("O Valor inserido não é válido. Tente novamente.");
                            outputLine = "O Valor inserido não é válido. Tente novamente.";
                        }
                    } while (true);


                    System.out.println("Diga-nos a operação (+)(-)(*)(/)(pow)?");
                    outputLine = "Diga-nos a operação (+)(-)(*)(/)(pow)?";
                    do {
                        out.println(outputLine);
                        inputLine = in.readLine();
                        operation = inputLine;
                        if (operation.equals("+" ) || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("pow")) {
                            break;
                        }
                        else {
                            System.out.println("O operador inserido não é válido. Tente novamente (+)(-)(*)(/)(pow).");
                            outputLine = "O operador inserido não é válido. Tente novamente (+)(-)(*)(/)(pow).";
                        }
                    }while (true);


                    System.out.println("Diga-nos o 2º Valor");
                    outputLine = "Diga-nos o 2º Valor";
                    do {
                        try {
                            out.println(outputLine);
                            inputLine = in.readLine();
                            value02 = Float.parseFloat(inputLine);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("O Valor inserido não é válido. Tente novamente. ");
                            outputLine = "O Valor inserido não é válido. Tente novamente.";
                        }
                    } while (true);

                    switch (operation) {
                        case "+":
                            total = calculatorOperations.sum(value01, value02);
                            break;
                        case "-":
                            total = calculatorOperations.sub(value01, value02);
                            break;
                        case "*":
                            total = calculatorOperations.mult(value01, value02);
                            break;
                        case "/":
                            total = calculatorOperations.div(value01, value02);
                            break;
                        case "pow":
                            total = (float) calculatorOperations.pow(value01, value02);
                            break;
                    }

                    System.out.println("Total: " + total);
                    System.out.println("Deseja continuar a Calcular? (S)(N)");
                    outputLine = ("Total: " + total + " --> Deseja continuar a Calcular? (S)(N)");
                    out.println(outputLine);
                    inputLine = in.readLine();

                    if (inputLine.equals("n") || inputLine.equals("N")) {
                        System.out.println("O cliente " + this.client.getInetAddress().getHostAddress() + " desconectou-se...");
                        outputLine = ("Bye");
                        out.println(outputLine);
                        break;
                    }
                } while (true);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.reacher.j20171105.echo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by reacher on 17-11-5.
 */
public class EchoClient {

    private String host = "127.0.0.1";
    private Socket socket;

    public EchoClient(int port) throws Exception {
        this.socket = new Socket(host, port);
        System.out.println("Client start......");
    }

    public void client() throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            writer.println(message);
            System.out.println(message + " = " + reader.readLine());
            if ("bye".equalsIgnoreCase(message)) {
                break;
            }
        }
        socket.close();
    }

    public static void main(String[] args) throws Exception {
        new EchoClient(8888).client();
    }
}

package com.reacher.j20171105.echo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by reacher on 17-11-5.
 */
public class EchoServer {

    private ServerSocket server;

    public EchoServer(int port) throws Exception {
        this.server = new ServerSocket(port);
        System.out.println("Server start......");
    }

    public void server() throws Exception {
        while (true) {
            Socket socket = this.server.accept();
            try {
                System.out.println("New connection accepted: " +
                        socket.getInetAddress() + ":" + socket.getPort());

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(
                        socket.getOutputStream(), true);

                String message = null;
                while ((message = reader.readLine()) != null) {
                    if (message.contains("+")) {
                        String[] numbers = message.split("\\+");
                        int sum = Integer.valueOf(numbers[0].trim()) +
                                Integer.valueOf(numbers[1].trim());
                        writer.println(sum);
                    } else {
                        break;
                    }
                }
            } finally {
                socket.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new EchoServer(8888).server();
    }
}

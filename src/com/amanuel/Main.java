package com.amanuel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {


            while (true) {
                new Echoer(serverSocket.accept()).start();
//                 Socket socket= serverSocket.accept();
//                 Echoer echoer=new Echoer(socket);
//                 echoer.start();
                //equivalent to the above code

            }

        } catch (IOException e) {
            System.out.println("Server Exception " + e.getMessage());
        }
    }
}

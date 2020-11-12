package ru.geekbrains.lesson10;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        System.out.println("Сервер открыт...");
        try (ServerSocket serverSocket = new ServerSocket(7070)) {
            System.out.println("Соединение открыто...");
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> newThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void newThread(Socket socket) {
        try (DataInputStream input = new DataInputStream(socket.getInputStream())) {
            String message = "";
            while (!message.equals("exit")) {
                message = input.readUTF();
                System.out.println(message);
            }
            System.out.println("Соединение закрыто.");
            socket.close();
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
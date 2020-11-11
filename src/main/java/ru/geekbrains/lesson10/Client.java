package ru.geekbrains.lesson10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("Клиент открыт...");
        try (Socket socket = new Socket("localhost", 7070)) {
            System.out.println("Соединение открыто...");
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            {
                String message = "";
                while (!message.equals("exit")) {
                    System.out.print("Введите сообщение: ");
                    message = scanner.nextLine();
                    output.writeUTF(message);
                }
                System.out.println("Соединение закрыто.");
                System.out.println("Клиент закрыт.");
                output.close();
                socket.close();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

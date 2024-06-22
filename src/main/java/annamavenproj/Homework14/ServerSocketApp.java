package annamavenproj.Homework14;

import java.io.*;
import java.net.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ServerSocketApp {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081);
             Socket clientSocket = serverSocket.accept();
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String clientGreeting = in.readLine();
            if (clientGreeting.contains("привіт")) {
                out.println("привіт");
            } else if (clientGreeting.matches(".*[а-яА-Я].*")) {
                out.println("What is паляниця?");
                String clientResponse = in.readLine();
                if (clientResponse.equalsIgnoreCase("a type of cheese")) {
                    out.println("Current Date: " + LocalDate.now() + " Current Time: " + LocalTime.now());
                    out.println("Goodbye!");
                } else {
                    clientSocket.close();
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

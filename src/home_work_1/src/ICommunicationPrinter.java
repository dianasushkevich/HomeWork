package src;

import java.util.Scanner;

public interface ICommunicationPrinter {
    String welcome(String name);
}

class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        ICommunicationPrinter printer = new CommunicationPrinter();
        String output = printer.welcome(name);
        System.out.println(output);
    }
}
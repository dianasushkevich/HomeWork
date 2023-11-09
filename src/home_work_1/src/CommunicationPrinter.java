package src;

public class CommunicationPrinter implements ICommunicationPrinter {
    public String welcome(String name) {
        if (name.equals("Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        } else if (name.equals("Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}

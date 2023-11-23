package DTO;
import java.util.Random;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person(String s, String substring, String string) {
        this.nick = generateRandomString();
        this.password = generateRandomPassword();
        this.name = generateRandomName();
    }

    private String generateRandomString() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private String generateRandomPassword() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        int length = random.nextInt(6) + 5; // Random password length between 5 and 10
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private String generateRandomName() {
        Random random = new Random();
        String[] names = {"Михаил", "Эмма", "София", "Оливия", "Александр", "Даник", "Олег"};
        return names[random.nextInt(names.length)];
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
package DTO;

import java.util.Random;

public class Animal {
    private int age;
    private String nick;

    public Animal() {
        Random random = new Random();
        this.age = random.nextInt(15) + 1;
        this.nick = generateRandomNick();
    }

    private String generateRandomNick() {
        Random random = new Random();
        int length = random.nextInt(6) + 5; // length between 5 and 10
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(32) + 'а'); // random Russian letter code
            builder.append(c);
        }

        return builder.toString();
    }

    // Getters and setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
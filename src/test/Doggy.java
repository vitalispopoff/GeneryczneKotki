package test;

import java.util.Random;

public class Doggy implements Pawable<Pawable> {

    private static final int idLength= 8;
    private final Sex sex;
    private int age;
    private String 
        name,
        race,
        id;

    public Doggy(String name, String race, int age, Sex sex) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.sex = sex;
        id = setId();
    }

    public String setId() {
        StringBuilder cache = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < idLength; i++) {
            int digit = random.nextInt(16);
            digit = (digit < 10) ? (digit += 48) : (digit += 55);
            cache.append((char) digit);
        }
        return cache.toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "[doggy - id: "+getId()+", name: "+name+"]";
    }

    public static void main(String[] args) {
        Doggy doggy = new Doggy("burek", "kundel", 1, Sex.FEMALE);
    }
}

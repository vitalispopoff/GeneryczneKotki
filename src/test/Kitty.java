package test;

import java.util.Comparator;

public class Kitty implements Comparator, Pawable<Pawable>  {

    private String name;
    private String race;
    private int age;
    private final Sex sex;
    private String id;

    public Kitty(String name, String race, int age, Sex sex) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[kitty - id: "+getId()+"name: "+name+"]";
    }

    public static void main(String[] args) {
        Kitty kitty = new Kitty("puszek", "dachowiec", 1, Sex.MALE);
        System.out.println(kitty.getName().hashCode());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

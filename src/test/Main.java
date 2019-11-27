package test;

public class Main {

    static Box box = new Box();

    static void addThreeKittens() {
        Kitty Kulka = new Kitty("Kulka", "dachowiec", 2, Sex.FEMALE);
        Kitty Pazur = new Kitty("Pazur", "maine coon", 6, Sex.MALE);
        Kitty Zmiataj = new Kitty("Zmiataj", "dachowiec", 7, Sex.MALE);

        box.putInTheBox(Kulka);
        box.putInTheBox(Pazur);
        box.putInTheBox(Zmiataj);
    }

    public static void addThreePups() {
        Doggy Mrok = new Doggy("Mrok", "jamnik", 1, Sex.FEMALE);
        Doggy Trwoga = new Doggy("Trwoga", "chihuahua", 0, Sex.MALE);
        Doggy Spioch = new Doggy("Spioch", "owczarek kaukaski", 4, Sex.FEMALE);

        box.putInTheBox(Mrok);
        box.putInTheBox(Trwoga);
        box.putInTheBox(Spioch);

    }

    public static void main(String[] args) {

        addThreePups();
        addThreeKittens();

        box.whatsInBox();

        System.out.println("\nwe take outta box");
        box.takeFromTheBox();

        System.out.println("\nwe check the box");

        box.whatsInBox();
    }


}

/**
 * Stwórz niwersalna klase pudelko, spelniajaca ponizsze oczekiwania:
 * <p>
 * Do pudelka mozna wkladac obiekty klasy Kotek lub Piesek.
 * Obiekty klasy Kotek, które beda posiadaly indywidualny numer rozpoznawczy w pudelku.
 * Zapewnij sortowanie Kotków na 3 rózne sposoby.
 * Do pudelka mozna wkladac obiekty klasy Piesek,
 * które beda rozpoznawane na podstawie losowanej wartosci Hexadecymalnej (8 znaków)
 * <p>
 * Zapewnij funkcjonalnosc, w której bedziesz mógl dodawac oraz wyjmowac
 * Pieska lub Kotka do/z pudelka.
 * Wyjmowanie Kotka lub Pieska ma zostac zrealizowane w sposób losowy.
 */
package timeDataExample;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDAte = LocalDate.of(2010, 1, 30);
        LocalDate parseDate = LocalDate.parse("2013-11-02");

        System.out.println("now() : " + nowDate);
        System.out.println("of(...) : " + ofDAte);
        System.out.println("parse(...) : " + parseDate);
    }
}

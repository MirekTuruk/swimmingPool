package dateBeforeOrAfter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2018-01-01");
        LocalDate date2 = LocalDate.parse("2018-05-23");

        System.out.println("date1 występuje po date2: " + date1.isAfter(date2));
        System.out.println("date1 występuje przed date2: " + date1.isBefore(date2));
    }
}

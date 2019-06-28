package dayOf;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2019-06-28");

        System.out.println("date1 który to dzień tygodnia: " + date1.getDayOfWeek());
        System.out.println("date1 który to dzień miesiąca: " + date1.getDayOfMonth());
        System.out.println("date1 który to dzień w roku: " + date1.getDayOfYear());
    }
}

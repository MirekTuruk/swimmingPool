package timeNow;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(9, 30, 15);
        LocalTime time3 = LocalTime.parse("11:32:05");

        System.out.println("now() : " + time1);
        System.out.println("of(...) : " + time2);
        System.out.println("parse(...) : " + time3);

    }
}

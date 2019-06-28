package dataTimeExample;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

            LocalDate sourceDate = LocalDate.parse("2018-01-01");

            LocalDate date1 = sourceDate.plusDays(5);
            LocalDate date2 = sourceDate.minusDays(5);
            LocalDate date3 = sourceDate.minusMonths(6);


            System.out.println("Date1: " + date1);
            System.out.println("Date1: " + date2);
            System.out.println("Date1: " + date3);
        }
    }


package exampleException;

import java.util.Scanner;

public class ExampleException {

    public static void main(String[] args) {

        String [] strings = new  String[] {"To", "jest", "bardzo", "przydatny", "kurs"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer wyrazu, który chcesz zobaczyć (od 0 do 5, 'q' aby zakończyć): ");

        for(int i = 0; i < 100; i++){
            String next = scanner.next();
            System.out.println("Podałeś: " + next);

            if(next.equals("q")){
                break;
            }
            int index = Integer.valueOf(next);
            System.out.println("Wyraz o indeksie: " + index + " to: " + strings[index] + "'");
        }
    }
}

package labOne;

import java.util.Scanner;

public class Main {
    String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int input;

    Scanner myScanner = new Scanner(System.in);




        for (int i = 0; i <= daysOfWeek.length; i++){
        System.out.println("Enter a number that corresponds with a day in the week: ");
        daysOfWeek[i] = myScanner.nextLine();
    }
}

package labOne;

import java.util.Scanner;

public class DaysOfTheWeek {
    private int dayOfWeek;
    private String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday"};

    public void askNumber(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number that corresponds to a day in the week:");
        this.dayOfWeek = myScanner.nextInt();
    }

    public void printDay(){
        System.out.println(daysOfWeek[this.dayOfWeek-1]);
    }
}

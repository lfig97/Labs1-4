package labOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number that corresponds to a day in the week:");
        int dayOfWeek = myScanner.nextInt();


        System.out.println(daysOfWeek[dayOfWeek -1 ]);






    }
}
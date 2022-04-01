package labTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //defining variables for later use
        String userName;
        //default password set to Password1
        final String password = "Password1";
        //counter starts at one to account for the failed attempt that would have required the prompt to be called.
        int loginAttempts = 1;


        //initial request for a password input. First step.
        System.out.println("Input your password below:");
        while (true) {
            //scanner input set-up
            Scanner userInput = new Scanner(System.in);
            String passwordInput = userInput.nextLine();

            if (password.equals(passwordInput)) {
                //login authentication success
                System.out.println("Log-in Successful, Welcome User");
                break;
            } else {
                //call from psvm, continuously adds to value a for every incorrect password input, beginning at one.
                int a = loginAttempts++;
                //output in the event of an incorrect password input.
                System.out.println("Incorrect Password. You have " + a + " Failed attempt(s). Please try again.");
            }
        }
    }
}
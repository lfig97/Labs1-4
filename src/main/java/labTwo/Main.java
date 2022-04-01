package labTwo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    //initial setup
    private String username;
    private String defaultPass;
    private String invalidMessage;
    private static boolean validPass;
//    public char[] specialchars = {'!','@','#','$','%','^','&','*','(',')','_','+','-','=',',','.','/',';','"',':','<','>','?','[','{',']','}'};

    //getter and setter for username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    //getter and setter for password
    public String getDefaultPass() {
        return defaultPass;
    }
    public void setDefaultPass(String defaultPass) {
        this.defaultPass = defaultPass;
    }
    public boolean validPass(){
        return validPass;
    }
    public void closeUserinput(){
        userInput.close();
    }
    public static Scanner userInput = new Scanner(System.in);
    public Main(String username, String defaultPass){
        this.username=username;
        this.defaultPass=defaultPass;
    }

    public static void main(String[] args) {
//        char[] specialchars = {'!','@','#','$','%','^','&','*','(',')','_','+','-','=',',','.','/',';','"',':','<','>','?','[','{',']','}'};
//        int upperCount = 0;
//        int specialCount = 0;

        System.out.println("Please enter your username below: ");
        String username = userInput.nextLine();

        System.out.println("Please enter your password below: ");
        String password = userInput.nextLine();

        System.out.println("Your new password must: ");
        System.out.println("-be at least 8 characters long.");
        System.out.println("-contain an uppercase letter.");
        System.out.println("-contain a special character.");
        System.out.println("-not contain your username.");
        System.out.println("-be different from your old password.");

        while (true){
            System.out.println("Please enter your new password below: ");
            String newPass = userInput.nextLine();

//            for (int i = 0; i++){
//                char check = userInput.charAt(i);

            if (newPass.length() < 8) {
                validPass = false;
                System.out.println("Your new password must be at least 8 characters");
            }else if (newPass.toUpperCase().contains(username.toUpperCase())){
                validPass = false;
                System.out.println("Your new password must not contain your username!");
            }else if (newPass.equals(password)){
                validPass = false;
                System.out.println("Your new password must be different from your current password!");
            }



        }


    }
}
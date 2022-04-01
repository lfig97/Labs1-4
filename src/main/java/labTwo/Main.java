package labTwo;

import java.util.Scanner;

public class Main {
    //initial setup
    private String username;
    private String defaultPass;
    private static boolean validPass;

    //getter and setter for username


    public static Scanner userInput = new Scanner(System.in);

    public Main(String username, String defaultPass) {
        this.username = username;
        this.defaultPass = defaultPass;
    }

    public static void main(String[] args) {
        char[] specialchars = {'!','@','#','$','%','^','&','*','(',')','_','+','-','=',',','.','/',';','"',':','<','>','?','[','{',']','}'};
        boolean isValid = true;

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

        while (isValid==true) {
            boolean isUpper = false;
            boolean isSpecial = false;
            boolean isLong = false;
            boolean isNotuser = false;
            boolean isDifferent = false;

            System.out.println("Please enter your new password below: ");
            String newPass = userInput.nextLine();


            if (newPass.length() < 8) {
                validPass = false;
                System.out.println("Your new password must be at least 8 characters");
            }if (newPass.length() >= 8) {
                isLong = true;

            }if (newPass.toUpperCase().contains(username.toUpperCase())) {
                validPass = false;
                System.out.println("Your new password must not contain your username!");
            }if (!newPass.toUpperCase().contains(username.toUpperCase())) {
                isNotuser = true;

            }if (newPass.equals(password)) {
                validPass = false;
                System.out.println("Your new password must be different from your current password!");
            }if (!newPass.equals(password)){
                isDifferent = true;
            }for (int i = 0; i < newPass.length(); i++) {
                if (Character.isUpperCase(newPass.charAt(i))) {
                    isUpper = true;
                }
            }if (isUpper == false){
                System.out.println("Your new password must contain an uppercase letter.");
            }for (int x=0; x < newPass.length(); x++){
                for (int y=0; y< specialchars.length; y++){
                    if (newPass.charAt(x)==specialchars[y]){
                        isSpecial=true;
                    }
                }
            }if (isSpecial==false){
                System.out.println("Your new password must contain a special character.");
            }
            if (isLong&&isNotuser&&isDifferent&&isUpper&&isSpecial){
                isValid=false;
//                System.out.println("Test");
            }
//            System.out.println("isDifferent: " + isDifferent);
//            System.out.println("isLong: " +isLong);
//            System.out.println("isNotUser: " +isNotuser);
//            System.out.println("isSpecial: " +isSpecial);
//            System.out.println("isUpper: " + isUpper);
                }
        System.out.println("Password is Valid");
            }
        }
package week2;

import static input.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {

        String secretpassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password: ");

        int maxGuesses = 5;

        while (!userPassword.equals(secretpassword) && maxGuesses > 1) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password: ");

            maxGuesses--;
        }

        if (maxGuesses > 1) {  // ran otu of guesses
            System.out.println("Correct password - access granted");
        }

        else {
            System.out.println("Maximum guesses reached");
            System.exit(0);


        }

    }
}

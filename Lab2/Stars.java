package week2;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {

        int size = positiveIntInput("Enter size of square?");
        if (size >= 300) {
            System.out.println("Try another a smaller number");
        }

        for (int x = 0 ; x < size ; x++) {

            for (int y = 0 ; y < size; y++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

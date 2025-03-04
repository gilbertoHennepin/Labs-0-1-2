package week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {

        String[] textbooks = new String[5];

        for (int number = 0 ; number < textbooks.length ; number++) {
            System.out.println("Book number " + (number+1) + "is" + textbooks[number]);

            String bookName = stringInput("Please enter name of textbook");

            textbooks[number] = bookName;

            System.out.println("Thanks you: here is th data you entered");
            System.out.println(Arrays.toString(textbooks));
        }
    }
}

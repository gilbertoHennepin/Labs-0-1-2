package week2;

import java.util.Arrays;

import static input.InputUtils.intInput;

public class ArrayExamples {
    public static void main(String[] args) {

//        example int array
//        int[] numbers = new int[5];
//        numbers[0] = 4;
//        numbers[1] = 100;


        String[] classNames = { "Java", "C#", "Web", "Android", "iOS"};
//        classNames[0] = "Java";
//        classNames[1] = "C+";
//        classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[2]);

        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + "classes in the array");



        for (int x=0; x<classNames.length; x++) {  // print all arrays
            System.out.println("A class name is " + classNames[x]);
        }

        System.out.println(Arrays.toString(classNames));
    }
}

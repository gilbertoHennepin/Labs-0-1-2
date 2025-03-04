package com.gil;

public class HelloStrings {

    public static void main(String[] args) {
        String name = "Gil";
        String nameInUpperCase = name.toUpperCase();
        System.out.println(nameInUpperCase);            //outputs the name in uppercase

        String nameINLowerCase = name.toLowerCase();
        System.out.println(nameINLowerCase);            // outputs the name in lowercase

        int charactersInName = name.length();           // counts the characters in the input
        System.out.println("There are "+ charactersInName + " characters in your name ");
    }
}

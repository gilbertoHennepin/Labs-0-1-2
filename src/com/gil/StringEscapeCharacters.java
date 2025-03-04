package com.gil;

public class StringEscapeCharacters {
    public static void main(String[] args)  { //"psvm" shortcut
        String message = "This class is \"Java Programming\"!";  // use "\" in between text to add "" when program runs
            System.out.println(message);
        String anotherMessage = "Welcome, everyone!\nI hope you enjoy the class!"; // use "\n" to add a new line
            System.out.println(anotherMessage);
        String andAnotherMessage = "Videos\tLabs\tZoom"; // use "\t" to add tabs in between words
            System.out.println(andAnotherMessage);
    }
}

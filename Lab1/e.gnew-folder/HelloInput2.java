//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import input.InputUtils;

public class HelloInput2 {
    public HelloInput2() {
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        String userName = InputUtils.stringInput("PLease enter your name:");
        System.out.println("Welcome, " + userName);
        int howManyClasses = InputUtils.intInput("How many classes are you taking?");
        System.out.println("You are taking " + howManyClasses + " classes.");
        int numberOfClasses = InputUtils.positiveIntInput("How many classes are you taking? this semester?");
        String units = "classes";
        if (numberOfClasses == 1) {
            units = "class";
        }

        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester");
        System.out.printf("You are taking %d %s this semester.", numberOfClasses, units);
    }
}

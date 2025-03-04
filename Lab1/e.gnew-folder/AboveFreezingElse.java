package week1;

import org.w3c.dom.ls.LSOutput;

import static input.InputUtils.doubleInput;

public class AboveFreezingElse {

    public static void main(String[] args) {

        double temp = doubleInput("Enter today's temperature in F");

        if (temp >32) {
            System.out.println("You are above freezing elsewhere");
        } else {
        System.out.println("It's below freezing elsewhere");
        }
    }
}

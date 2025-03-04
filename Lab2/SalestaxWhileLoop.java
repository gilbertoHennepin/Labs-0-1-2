package week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {

        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        while (moreCalculations) {

            price = doubleInput("Type in a price");
            double priceInclTax = price*salesTax;
            System.out.println(price + " The price plus sales tax is $" + priceInclTax);

            moreCalculations = yesNoInput("Do yu want to continue");
        }

        System.out.println("Thank you for using the program");

    }
}

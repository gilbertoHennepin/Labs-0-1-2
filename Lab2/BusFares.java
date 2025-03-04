package week2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {


        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;

        for (int day = 0; day <= dayNames.length; day++) {
            String dayName = dayNames[day];
            double amountSpent = doubleInput("On " + dayName + ", what did you spend on bus fares? ");
            total = total + amountSpent;
        }
        System.out.printf("Total for the week = $%.2f", total);
    }
}





//        int BusFares = 7;
//        double price = 50;
//        double totalPrice = price+price


//        for (int fare = 1 ; fare <= BusFares ; fare++) {
//            price = doubleInput("Enter how much you paid for the bus " + fare);
//            totalPrice += price;
//        }

//        System.out.println("Total money spent   " + totalPrice);
//    }
//}

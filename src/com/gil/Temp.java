package com.gil;

public class Temp {
    public static void main(String[] args) {

//        String and int variable to store the data
        String month = "January";
        int dayOfMonth = 11;

//        Double variables to store the high and low forecast temps
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

//      Find the difference
        double tempDifference = forecastHigh - forecastLow;  // get the difference

//        print info
        System.out.println(" On " + month  + " " +  dayOfMonth + "," + " the difference between the high and low temperatures is "
                + tempDifference + "F");
//      print info but with a number that has 2 decimals using "%.2f"
        System.out.printf(" On " + month  + " " +  dayOfMonth + "," + " the difference between the high and low temperatures is %.2fF "
        , tempDifference);

    }
}

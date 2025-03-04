package week2;

public class LoopCalendar {
    public static void main(String[] args) {

        for (int day = 1; day <= 31; day++) {
            if (day == 1 || day == 21 || day == 31) {
                System.out.println("January " + day + "st");
            } else {
                System.out.println("January " + day + "th");
            }
        }
    }
}

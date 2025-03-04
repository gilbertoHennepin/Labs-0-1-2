package week2;

public class AverageBill {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        double total = 0;

        for (int i = 0; i < months.length; i++) {
            total += i; // Placeholder logic, replace with actual bill values
        }

        System.out.println("Total: " + total);
    }
}

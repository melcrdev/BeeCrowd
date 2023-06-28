package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        if (number >= 0.0 && number <= 25.0) {
            System.out.println("Interval [0,25]");
        }
        else if (number > 25.0 && number <= 50.0) {
            System.out.println("Interval (25,50]");
        }
        else if (number > 50.0 && number <= 75.0) {
            System.out.println("Interval (50,75]");
        }
        else if (number > 75.0 && number <= 100.0) {
            System.out.println("Interval (75,100]");
        }
        else {
            System.out.println("Out of Interval");
        }

        sc.close();
    }
}

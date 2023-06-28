package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double total = 0;

        if (X == 1) {
            total = 5.00 * Y;
        }
        else if (X == 2) {
            total = 4.50 * Y;
        }
        else if (X == 3) {
            total = 5.00 * Y;
        }
        else if (X == 4) {
            total = 2.00 * Y;
        }
        else if (X == 5) {
            total = 1.50 * Y;
        }
        else {
            System.out.println("Invalid number");
        }

        System.out.printf("Total: $ %.2f%n", total);

        sc.close();
    }
}

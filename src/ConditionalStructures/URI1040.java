package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double average = (N1 * 2.0 + N2 * 3.0 + N3 * 4.0 + N4) / 10.0;

        System.out.printf("Average: %.1f%n", average);

        if (average < 5.0) {
            System.out.println("Reproved Student");
        }
        else if (average >= 5.0 && average <= 6.9) {
            System.out.println("In exam student");
            double examScore = sc.nextDouble();
            double recalculateAverage = (average + examScore) / 2.0;

            if (recalculateAverage >= 5.0) {
                System.out.println("Approved student");
            } else {
                System.out.println("Reproved student");
            }
            System.out.printf("Final average: %.1f%n", recalculateAverage);
        }
        else {
            System.out.println("Approved Student");
        }

        sc.close();
    }
}

package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Are Multiples");
        }
        else {
            System.out.println("Aren’t Multiples");
        }

        sc.close();
    }
}

package RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double n1, n2, n3, media;

        for (int i = 0; i < N; i++) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 5.0)) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}

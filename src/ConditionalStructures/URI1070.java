package ConditionalStructures;

import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();


        if (X % 2 == 0) {
            X = X + 1;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(X);
            X = X + 2;
        }

        sc.close();
    }
}

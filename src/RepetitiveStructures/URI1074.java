package RepetitiveStructures;

import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            if (X == 0) {
                System.out.println("NULL");
            }
            else if (X > 0) {
                if (X % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                }
                else {
                    System.out.println("ODD POSITIVE");
                }
            }
            else {
                if (X % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                }
                else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }

        sc.close();
    }
}

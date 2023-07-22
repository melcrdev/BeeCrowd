package RepetitiveStructures;

import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X;
        int contIn = 0;
        int contOut = 0;

        for (int i = 0; i < N; i++) {
            X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                contIn++;
            }
            else {
                contOut++;
            }
        }

        System.out.println(contIn + " in");
        System.out.println(contOut + " out");


        sc.close();
    }
}

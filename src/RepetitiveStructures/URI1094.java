package RepetitiveStructures;

import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int total = 0;
        int totalC = 0;
        int totalR = 0;
        int totalS = 0;
        double pC, pR, pS;

        for (int i = 0; i < N; i++) {
            int quantity = sc.nextInt();
            String type = sc.next();

            total += quantity;

            if (type.equals("C")) {
                totalC += quantity;
            }
            else if (type.equals("R")) {
                totalR += quantity;
            }
            else {
                totalS += quantity;
            }

            if (i == N - 1) {
                System.out.println("Total: " + total + " cobaias");
                System.out.println("Total de coelhos: " + totalC);
                System.out.println("Total de ratos: " + totalR);
                System.out.println("Total de sapos: " + totalS);

                pC = (double) (100 * totalC) / total;
                System.out.printf("Percentual de coelhos: %.2f%%\n", pC);
                pR = (double) (100 * totalR) / total;
                System.out.printf("Percentual de ratos: %.2f%%\n", pR);
                pS = (double) (100 * totalS) / total;
                System.out.printf("Percentual de sapos: %.2f%%\n", pS);
            }

        }

        sc.close();
    }
}

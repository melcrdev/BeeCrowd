package ConditionalStructures;

import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();

            if (N % 2 == 0) {
                cont++;
            }
        }

        System.out.println(cont + " valores pares");

        sc.close();
    }
}

package RepetitiveStructures;

import java.util.Scanner;

public class URI1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            cont++;

            int multiplication = cont * N;

            System.out.println(cont + " x " + N + " = " + multiplication);
        }
        sc.close();
    }
}

package RepetitiveStructures;

import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int cont = 0;

        for (int i = 0; i < X; i++) {

            cont++;

            if (cont % 2 != 0) {
                System.out.println(cont);
            }
        }

        sc.close();
    }
}

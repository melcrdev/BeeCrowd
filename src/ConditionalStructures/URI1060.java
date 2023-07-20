package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        for (int i = 0; i < 6; i++) {
            double number = sc.nextDouble();
            if (number > 0.0) {
                cont++;
            }
        }

        System.out.println(cont + " valores positivos");

        sc.close();
    }
}

package ConditionalStructures;

import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;
        int contPosit = 0;
        int contNegat = 0;

        for (int i = 0; i < 5; i++) {

            int N = sc.nextInt();

            if (N % 2 == 0) {
                contPar++;
            }
            else {
                contImpar++;
            }

            if (N > 0) {
                contPosit++;
            }
            else if (N == 0) {

            } else {
                contNegat++;
            }

        }

        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPosit + " valor(es) positivo(s)");
        System.out.println(contNegat + " valor(es) negativo(s)");


        sc.close();
    }
}

package RepetitiveStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int maior = 0;
        int maiorNumero = 0;
        int posicao = 0;

        for (int i = 0; i < 100; i++) {
            int N = sc.nextInt();

            cont++;

            maior = N;

            if (maiorNumero < maior) {
                maiorNumero = maior;
                posicao = cont;
            }
            else {
                if (cont == 100) {
                    System.out.println(maiorNumero);
                    System.out.println(posicao);
                }
            }

        }








        sc.close();
    }
}

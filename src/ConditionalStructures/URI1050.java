package ConditionalStructures;

import java.util.Scanner;

public class URI1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int DDD = sc.nextInt();

        switch (DDD) {
            case 61 -> System.out.println("Brasilia");
            case 71 -> System.out.println("Salvador");
            case 11 -> System.out.println("São Paulo");
            case 21 -> System.out.println("Rio de Janeiro");
            case 32 -> System.out.println("Juiz de Fora");
            case 19 -> System.out.println("Campinas");
            case 27 -> System.out.println("Vitoria");
            case 31 -> System.out.println("Belo Horizonte");
            default -> System.out.println("DDD not found");
        }

        sc.close();
    }
}

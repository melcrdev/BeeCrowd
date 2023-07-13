package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2, word3;

        if (word1.equals("vertebrado")) {
            word2 = sc.nextLine();
            if (word2.equals("ave")) {
                word3 = sc.nextLine();
                if (word3.equals("carnivoro")) {
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else {
                word3 = sc.nextLine();
                if (word3.equals("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }
        else {
            word2 = sc.nextLine();
            if (word2.equals("inseto")) {
                word3 = sc.nextLine();
                if (word3.equals("hematofago")) {
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else {
                word3 = sc.nextLine();
                if (word3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}

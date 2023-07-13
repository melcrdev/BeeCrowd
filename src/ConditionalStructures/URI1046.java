package ConditionalStructures;

import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();
        int totalTime;

        if (startTime < endTime) {
            totalTime = endTime - startTime;
            System.out.println("THE GAME LASTED " + totalTime + " HOUR(S)");
        }
        else {
            totalTime = (24 - startTime) + endTime;
            System.out.println("THE GAME LASTED " + totalTime + " HOUR(S)");
        }

        sc.close();
    }
}

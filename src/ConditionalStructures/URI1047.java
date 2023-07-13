package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1047 {

    //TODO: terminar este exercício
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int initialHour = sc.nextInt();
        int initialMinute = sc.nextInt();
        int finalHour = sc.nextInt();
        int finalMinute = sc.nextInt();
        int totalH, totalM;

        if (initialHour < finalHour) {
            totalH = finalHour - initialHour;
            if (initialMinute < finalMinute) {
                totalM = finalMinute - initialHour;
                System.out.println("THE GAME LASTED " + totalH + " HOUR(S) AND " + totalM + " MINUTE(S)");
            }
            else {
                totalM = initialMinute - finalMinute;
                System.out.println("THE GAME LASTED " + totalH + " HOUR(S) AND " + totalM + " MINUTE(S)");
            }
        }
        else {
            totalH = (24 - initialHour) + finalHour;
            if (initialMinute < finalMinute) {
                totalM = finalMinute - initialHour;
                System.out.println("THE GAME LASTED " + totalH + " HOUR(S) AND " + totalM + " MINUTE(S)");
            }
            else {
                totalM = initialMinute - finalMinute;
                System.out.println("THE GAME LASTED " + totalH + " HOUR(S) AND " + totalM + " MINUTE(S)");
            }
        }

        sc.close();
    }
}

package ConditionalStructures;

import java.util.Locale;
import java.util.Scanner;

public class URI1051 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double salary = sc.nextDouble();
            double totalTax, tax1, tax2, tax3;
            int valueRate, valueAliquot;

            if (salary >= 0.0 && salary <= 2000.0) {
                System.out.println("Without taxes");
            }
            else if (salary >= 2000.01 && salary <= 3000.00) {
                totalTax = salary * 8 / 100;

                System.out.printf("R$ %.2f%n", totalTax);
            }
            else if (salary >= 3000.01 && salary <= 4500.00) {
                valueRate = (int) salary / 1000;

                valueAliquot = valueRate * 1000 - 2000;

                tax1 = valueAliquot * 8.0 / 100.0;

                tax2 = (salary - valueRate * 1000.0) * 18 / 100;

                totalTax = tax1 + tax2;

                System.out.printf("R$ %.2f%n", totalTax);
            }
            else {
                double valueWithoutExemption = salary - 2000; //2520

                int aliquot = (int) valueWithoutExemption / 1000; //2

                tax1 = ((aliquot * 1000) - 1000) * 0.08; //80

                tax2 = ((aliquot - 1) * 1500) * 0.18;

                tax3 = (valueWithoutExemption - 2500) * 0.28;

                totalTax = tax1 + tax2 + tax3;

                System.out.printf("R$ %.2f%n", totalTax);
            }

            sc.close();
        }
}

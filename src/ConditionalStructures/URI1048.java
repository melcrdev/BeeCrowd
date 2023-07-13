package ConditionalStructures;


import java.util.Locale;
import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double employeeSalary = sc.nextDouble();
        double newSalary, moneyEarned;

        if (employeeSalary > 0.0 && employeeSalary <= 400.0) {
            moneyEarned = employeeSalary * 15.0 / 100.0;
            newSalary = moneyEarned + employeeSalary;
            System.out.printf("New salary: $%.2f%n", newSalary);
            System.out.printf("Money earned: $%.2f%n", moneyEarned);
            System.out.println("In percentage: 15 %");
        }
        else if (employeeSalary >= 400.01 && employeeSalary <= 800.0) {
            moneyEarned = employeeSalary * 12.0 / 100.0;
            newSalary = moneyEarned + employeeSalary;
            System.out.printf("New salary: $%.2f%n", newSalary);
            System.out.printf("Money earned: $%.2f%n", moneyEarned);
            System.out.println("In percentage: 12 %");
        }
        else if (employeeSalary >= 800.01 && employeeSalary <= 1200.00) {
            moneyEarned = employeeSalary * 10.0 / 100.0;
            newSalary = moneyEarned + employeeSalary;
            System.out.printf("New salary: $%.2f%n", newSalary);
            System.out.printf("Money earned: $%.2f%n", moneyEarned);
            System.out.println("In percentage: 10 %");
        }
        else if (employeeSalary >= 1200.01 && employeeSalary <= 2000.00) {
            moneyEarned = employeeSalary * 7.0 / 100.0;
            newSalary = moneyEarned + employeeSalary;
            System.out.printf("New salary: $%.2f%n", newSalary);
            System.out.printf("Money earned: $%.2f%n", moneyEarned);
            System.out.println("In percentage: 7 %");
        }
        else {
            moneyEarned = employeeSalary * 4.0 / 100.0;
            newSalary = moneyEarned + employeeSalary;
            System.out.printf("New salary: $%.2f%n", newSalary);
            System.out.printf("Money earned: $%.2f%n", moneyEarned);
            System.out.println("In percentage: 4 %");
        }

        sc.close();
    }
}

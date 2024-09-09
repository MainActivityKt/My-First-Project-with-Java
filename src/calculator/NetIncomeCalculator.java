package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class NetIncomeCalculator {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] items = new String[] { "Bubblegum", "Toffee", "Ice cream", "Milk chocolate", "Doughnut", "Pancake" };
        int[] prices = new int[] { 202, 118, 2250, 1680, 1075, 80 };

        System.out.println("Earned amount:");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%s: $%d", items[i], prices[i]);
            System.out.println();
        }
        System.out.println();

        int income = Arrays.stream(prices).sum();
        System.out.printf("Income: $%d\n", income);

        int staffExpenses = getIntInput("Staff expenses");
        int additionalExpenses = getIntInput("Other expenses");

        int netIncome = income - staffExpenses - additionalExpenses;

        System.out.printf("Net income: %d", netIncome);


    }

    static int getIntInput(String message) {
        System.out.println(message + ":");
        return sc.nextInt();
    }
}
package calculator;

import java.util.Arrays;

class IncomeCalculator {
    public static void main(String[] args) {
        String[] items = new String[] { "Bubblegum", "Toffee", "Ice cream", "Milk chocolate", "Doughnut", "Pancake" };
        int[] prices = new int[] { 202, 118, 2250, 1680, 1075, 80 };

        System.out.println("Earned amount:");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%s: $%d", items[i], prices[i]);
            System.out.println();
        }
        System.out.println();
        System.out.printf("Income: $%d", Arrays.stream(prices).sum());

    }
}
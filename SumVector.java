package module2;

import java.util.Vector;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> numbers = new Vector<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
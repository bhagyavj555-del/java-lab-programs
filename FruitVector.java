package module2;

import java.util.Vector;
import java.util.Scanner;

public class FruitVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<String> fruits = new Vector<>();

        System.out.println("Enter 5 fruits:");

        for (int i = 0; i < 5; i++) {
            fruits.add(sc.nextLine());
        }

        System.out.println("\nFruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        sc.close();
    }
}
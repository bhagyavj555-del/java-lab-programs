package module2;
import java.util.Vector;
import java.util.Scanner;

public class LargestVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> numbers = new Vector<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number = " + largest);

        sc.close();
    }
}

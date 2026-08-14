package module2;
import java.util.Vector;
import java.util.Scanner;

public class RemoveVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<String> colors = new Vector<>();

        System.out.println("Enter 4 colors:");

        for (int i = 0; i < 4; i++) {
            colors.add(sc.nextLine());
        }

        colors.remove("Green");

        System.out.println("\nVector after removing Green:");

        for (String color : colors) {
            System.out.println(color);
        }

        sc.close();
    }
}

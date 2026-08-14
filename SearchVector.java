package module2;
import java.util.Vector;
import java.util.Scanner;

public class SearchVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<String> items = new Vector<>();

        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        System.out.print("Enter an item: ");
        String item = sc.nextLine();

        if (items.contains(item)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}

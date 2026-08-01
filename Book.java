package module1;
import java.util.Scanner;

class Book {
    String title, author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Display method
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Book 1 input
        System.out.println("Enter details of Book 1:");
        System.out.print("Title: ");
        String t1 = sc.nextLine();

        System.out.print("Author: ");
        String a1 = sc.nextLine();

        System.out.print("Price: ");
        double p1 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Book 2 input
        System.out.println("\nEnter details of Book 2:");
        System.out.print("Title: ");
        String t2 = sc.nextLine();

        System.out.print("Author: ");
        String a2 = sc.nextLine();

        System.out.print("Price: ");
        double p2 = sc.nextDouble();

        // Create objects
        Book b1 = new Book(t1, a1, p1);
        Book b2 = new Book(t2, a2, p2);

        // Output
        System.out.println("\nBook Details:");
        b1.display();
        b2.display();
    }
}

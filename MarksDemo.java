package module2;

import java.util.Scanner;

class Marks {
    int mark1;
    int mark2;
    int mark3;
    Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    void displayResult() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Mark 1 = " + mark1);
        System.out.println("Mark 2 = " + mark2);
        System.out.println("Mark 3 = " + mark3);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}

public class MarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Marks m = new Marks(m1, m2, m3);

        System.out.println("\n--- Student Result ---");
        m.displayResult();

        sc.close();
    }
}

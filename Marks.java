package module1;
import java.util.Scanner;

class Marks {
    int mark1, mark2, mark3;

    // Constructor
    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculate() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 marks:");
        Marks m = new Marks(sc.nextInt(), sc.nextInt(), sc.nextInt());

        m.calculate();
    }
}
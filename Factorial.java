package module1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        class GCD {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }

                System.out.println("GCD = " + a);
            }
        }
        
        int n = sc.nextInt();
        int fact = 1;

        while (n > 0) {
            fact *= n;
            n--;
        }

        System.out.println("Factorial = " + fact);
    }
}
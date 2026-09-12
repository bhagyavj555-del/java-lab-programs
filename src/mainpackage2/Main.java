package mainpackage2;

import java.util.Scanner;
import evenpackage.Even;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (Even.checkEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is not even");
        }

        sc.close();
    }
}

package module1;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of elements: ");
			int n = sc.nextInt();

			int arr[] = new int[n];

			System.out.println("Enter elements:");
			for(int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();
			}

			System.out.println("Array elements:");
			for(int i = 0; i < n; i++) {
			    System.out.print(arr[i] + " ");
			}

			System.out.println("\nReverse order:");
			for(int i = n-1; i >= 0; i--) {
			    System.out.print(arr[i] + " ");
			}
		}
    }
}
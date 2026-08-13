package module1;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
			int even = 0, odd = 0;
			{
			System.out.print("Enter n: ");
			int n = sc.nextInt();

			int arr[] = new int[n];

			System.out.println("Enter elements:");
			for(int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < n; i++) {
			    if(arr[i] % 2 == 0)
			        even++;
			    else
			        odd++;
			}
			
			System.out.println("Even count: " + even);
		}
			{
        System.out.println("Odd count: " + odd);
			}}} 

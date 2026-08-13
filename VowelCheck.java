package module1;
import java.util.Scanner;
public class VowelCheck {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a character: ");
			char ch=sc.next().charAt(0);
			switch(Character.toLowerCase(ch)) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				System.out.println("Vowel");
				break;
				default:
				System.out.println("Consonant");
			
					
				
			
			}
		}

	}

}

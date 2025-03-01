package java_prgrms;
import java.util.Scanner;

public class Prg6_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check if palindrome or not : ");
		int n = sc.nextInt();
		int og = n;
		int reversed = 0;
		while (n > 0) {
            int digit = n % 10; 
            reversed = reversed * 10 + digit; 
            n = n / 10; 
        }

        if (reversed == og) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
		
	}

}

package java_prgrms;
import java.util.Scanner;

public class Prg13_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine().toLowerCase();

        String revString = ""; 
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }

        if (str.equals(revString)) {  
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}

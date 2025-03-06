package java_prgrms;
import java.util.Scanner;
public class Prg14_PatternString {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("enter the string:");
	        String str= scanner.nextLine();

	        System.out.println("enter the pattern to search:");
	        String pattern= scanner.nextLine();

	        if (str.contains(pattern)) {
	            System.out.println("Pattern found!");
	        } else {
	            System.out.println("Pattern not found!");
	            scanner.close();
	            return;
	        }

	        System.out.println("enter the pattern to replace:");
	        String replace= scanner.nextLine();


	        String Result= str.replace(pattern, replace);

	        System.out.println("updated string is:"+Result);
	        scanner.close();


	    
	    
	}

}

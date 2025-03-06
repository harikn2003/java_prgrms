package java_prgrms;
import java.util.Scanner;

public class Prg8_Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int limit = sc.nextInt();
			int a = 0;
			int b = 1;
			System.out.print(a+" "+b+" ");
			for(int i=0;i<limit-2;i++) {
				int c = a + b;
				a = b;
				b = c;
				System.out.print(c+" ");
			}
			sc.close();
		
	}

}

package java_prgrms;
import java.util.Scanner;

public class Prg1_Rectangle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the Rectangle : ");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double  area = length*width;
		double perimeter = 2*(length+width);
		System.out.println("The Area of Rectangle is : "+ area);
		System.out.println("The Perimeter of Rectangle is : "+ perimeter);
		sc.close();
	}
}

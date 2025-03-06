package java_prgrms;

import java.util.Scanner;

public class Prg2_circle {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle : ");
		double radius = sc.nextDouble();
		double area = 3.14*radius*radius;
		double perimeter = 2*3.14*radius;
		System.out.println("The Area of Circle is : "+ area);
		System.out.println("The Perimeter of Circle is : "+ perimeter);
		sc.close();
	}
}

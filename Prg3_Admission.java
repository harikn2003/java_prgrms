package java_prgrms;
import java.util.Scanner;

public class Prg3_Admission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eligibility check for admission");
		System.out.println("Enter the marks for Mathematics : ");
		double mat = sc.nextDouble();
		System.out.println("Enter the marks for	 Physics: ");
		double phy = sc.nextDouble();
		System.out.println("Enter the marks for Chemistry : ");
		double chem = sc.nextDouble();
		double total_three = mat + phy + chem ; 
		double total_two = mat + phy;
		if(mat>=60 && phy>=50 && chem>=40 && total_three>=200 || total_two>=150) {
			System.out.println("Eligibility check passed");
		}
		else {
			System.out.println("Eligibility check failed");
		}
		
	}

}

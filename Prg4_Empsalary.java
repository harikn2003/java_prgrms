package java_prgrms;
import java.util.Scanner;

public class Prg4_Empsalary {
	public static void main(String[] args) {
		double salary = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1-Manager");
		System.out.println("2-Developer");
		System.out.println("3-Intern");
		System.out.println("Enter your job role from above (1,2,3) : ");
		int role = sc.nextInt();
		System.out.println("Enter your year Experience : ");
		int yr = sc.nextInt();
		switch(role) {
		case 1 : 
			salary = 50000;
			break;
		case 2 :
			salary = 30000;
			break;
		case 3 :
			salary = 15000;
			break;
		default:
            System.out.println("Invalid job role! Please enter 1, 2, or 3.");
            sc.close();
            return;
		}
		if(yr>=3 && yr<=5) {
			salary = (salary*10)/100 + salary;
			System.out.println("Salary : "+ salary);
		}
		else if(yr>5) {
			salary = (salary*20)/100 + salary;
			System.out.println("Salary : "+ salary);
		}
		else {
			System.out.println("Salary : "+ salary);
		}
	}
	
}

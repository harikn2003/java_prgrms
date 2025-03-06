package java_prgrms;
import java.util.Scanner;

public class Prg5_Grade {
	public static void main(String[] args) {
		String grade = "A";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage of marks : ");
		double percent = sc.nextDouble();
		if(percent >= 90) {
			grade = "A";
		}
		else if(percent >=80 && percent<89) {
			grade = "B";
		}
		else if(percent >=70 && percent<79) {
			grade = "C";
		}
		else if(percent >=60 && percent<69) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		switch(grade) {
		case "A" :
			System.out.print("Excellent work!");
			break;
		case "B" :
			System.out.print("Good job!");
			break;
		case "C" : 
			System.out.print("You can do better");
			break;	
		case "D" :
			System.out.print("Work harder");
			break;
		case "F" :
			System.out.print("Failed.Try again");
			break;
		default :
			System.out.print("Input incorrect!");
		}
		sc.close();
	}

}

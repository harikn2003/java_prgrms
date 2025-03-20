package cycle1;

import java.util.Scanner;

public class c03Student {
    int studentId;
    String name;
    double marks;

    public c03Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks1 = scanner.nextDouble();

        c03Student student1 = new c03Student(studentId1, name1, marks1);

        System.out.print("Enter Student ID: ");
        int studentId2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks2 = scanner.nextDouble();

        c03Student student2 = new c03Student(studentId2, name2, marks2);

        System.out.print("Enter Student ID: ");
        int studentId3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks3 = scanner.nextDouble();

        c03Student student3 = new c03Student(studentId3, name3, marks3);

        System.out.println("\nStudent 1 Details:");
        student1.displayDetails();
        System.out.println("Passed: " + student1.isPassed());

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        System.out.println("Passed: " + student2.isPassed());

        System.out.println("\nStudent 3 Details:");
        student3.displayDetails();
        System.out.println("Passed: " + student3.isPassed());

        scanner.close();
    }
}

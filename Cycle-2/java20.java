package Cycle2;
import java.util.Scanner;
interface Shape {
 double calculateArea();
}
class Triangle implements Shape {
 private double base;
 private double height;
 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }
 @Override
 public double calculateArea() {
     return 0.5 * base * height;
 }
}
class Rectangle implements Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 @Override
 public double calculateArea() {
     return length * width;
 }
}
public class java20 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter base and height of the triangle: ");
     double base = scanner.nextDouble();
     double height = scanner.nextDouble();
     Shape triangle = new Triangle(base, height);
     System.out.print("Enter length and width of the rectangle: ");
     double length = scanner.nextDouble();
     double width = scanner.nextDouble();
     Shape rectangle = new Rectangle(length, width);
     System.out.println("\nAreas:");
     System.out.println("Triangle Area: " + triangle.calculateArea());
     System.out.println("Rectangle Area: " + rectangle.calculateArea());
     scanner.close();
   }
}
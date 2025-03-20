package cycle1;

public class c02Rect {
    double length;
    double width;

    public c02Rect() {
        length = 1;
        width = 1;
    }

    public c02Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        c02Rect rect1 = new c02Rect();
        System.out.println("Rectangle 1 (Default Constructor):");
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        System.out.println();

        c02Rect rect2 = new c02Rect(5, 3);
        System.out.println("Rectangle 2 (Parameterized Constructor):");
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        System.out.println();

        c02Rect rect3 = new c02Rect(7, 4);
        System.out.println("Rectangle 3 (Parameterized Constructor):");
        System.out.println("Area: " + rect3.calculateArea());
        System.out.println("Perimeter: " + rect3.calculatePerimeter());
    }
}


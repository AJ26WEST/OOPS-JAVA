import java.util.Scanner;

class Overloading {
    public static class Triangle {
        public static double calcArea(float base, float height) {
            return base * height * 0.5;
        }
    }

    public static class Rectangle {
        public static double calcArea(float length, float width) {
            return length * width;
        }
    }

    public static class Circle {
        public static double calcArea(float radius) {
            return 3.14 * radius * radius;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length, width, radius, base, height;
        
        System.out.println("Enter the dimensions of the triangle: ");
        base = sc.nextFloat();
        height = sc.nextFloat();
        
        System.out.println("Enter the dimensions of the rectangle: ");
        length = sc.nextFloat();
        width = sc.nextFloat();
        
        System.out.println("Enter the dimension of the circle: ");
        radius = sc.nextFloat();
        
        System.out.println("The area of the given shapes are: ");
        System.out.println("Rectangle: " + Rectangle.calcArea(length, width));
        System.out.println("Triangle: " + Triangle.calcArea(base, height));
        System.out.println("Circle: " + Circle.calcArea(radius));
    }
}

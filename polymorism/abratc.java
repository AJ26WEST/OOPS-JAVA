import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    void area() {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }
}
class Rectangle extends Shape{
    int lenght;
    int breadth;
    Rectangle(int lenght,int breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    void area(){
        int area=lenght*breadth;
        System.out.println("Area of rectangle :"+area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of square:");
        int squareSide = sc.nextInt();

        Square sq = new Square(squareSide);
        sq.area();

        System.out.println("enter the lenght and breath of rect");
        int rectangleLenght =sc.nextInt();
        int rectangleBreadth =sc.nextInt();
        Rectangle rec = new Rectangle(rectangleBreadth,rectangleLenght);
        rec.area();

    }
}


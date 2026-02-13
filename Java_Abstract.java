abstract class Shape {

    String color; // instance variable
    static int shapeCount; // static variable
    
    static{
      System.out.println("Static block in Shape class");
      shapeCount = 0 ;
    }
    // Constructor
    Shape(String color) {
        System.out.println("Constructor in Shape class - Color: " + color);
        this.color = color;
        shapeCount++;
    }

    // Abstract method
    abstract double area();
    abstract double circumference();

    // Concrete method
    void getColor() {
        System.out.println("Color: " + color);
    }

    // Static method to get the total count of shapes created
    static void getShapeCount() {
        System.out.println("Total Shapes Created: " + shapeCount);
    } 
}

class Circle extends Shape {

    int radius;

    Circle(String color, int radius) {
        super(color);
        System.out.println("Constructor in Circle class");
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {

    int length;
    int breadth;

    Rectangle(String color, int length, int breadth) {
        super(color);
        System.out.println("Constructor in Rectangle class");
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double circumference() {
        return 2 * (length + breadth);
    }
}


public class Java_Abstract 
{
    public static void main(String[] args) {
        Shape circleShape = new Circle("Red", 5);
        circleShape.getColor();
        System.out.println("Area: " + circleShape.area());
        System.out.println("Circumference: " + circleShape.circumference());
        
        Shape rectangleShape = new Rectangle("Blue", 4, 6);
        rectangleShape.getColor();
        System.out.println("Area: " + rectangleShape.area());
        System.out.println("Circumference: " + rectangleShape.circumference());
        
        Shape.getShapeCount(); // Call static method to get shape count
        System.out.println("Total Shapes Created (from static variable): " + Shape.shapeCount);
    }
}


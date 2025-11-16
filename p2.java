class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class p2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayShape();
        c.area();

        Rectangle r = new Rectangle(4, 6);
        r.displayShape();
        r.area();
    }
}

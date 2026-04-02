class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    // Overloaded methods
    double calculate(double a) {
        return a * a;
    }

    double calculate(double a, double b) {
        return a * b;
    }
}

public class pol2 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        Shape s2 = new Circle(3);

        System.out.println("Rectangle Area: " + s1.area());
        System.out.println("Circle Area: " + s2.area());

        AreaCalculator calc = new AreaCalculator();
        System.out.println(calc.calculate(5));
        System.out.println(calc.calculate(4, 6));
    }
}
package M15_Shapes;
import java.util.ArrayList;
import java.util.Scanner;

class Shape {
    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 22/7 * (radius * radius);
    }


    
}

class Square extends Shape {
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }
    


}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    
}

public class Main {
    /* Ask the user to decide whether to create a rectangle, circle or square
     * If rectangle, ask for width and length
     * if circle, ask for radius
     * If square, ask for length
     * Then the user can type in q to ened the data entry
     * After which, for each shape the user has entered, show the area of the shape
     * IN THE SAME ORDER THE USER HAS TYPE IN
     */
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("What kind of shape?");
            String shape = sc.nextLine();
            if (shape.equals("c")) {
                System.out.println("Enter radius: ");
                double r = sc.nextDouble();
                sc.nextLine();
                Circle c = new Circle(r);
                shapes.add(c);
            }
            if (shape.equals("s")) {
                System.out.println("Enter the length of the square: ");
                double l = sc.nextDouble();
                sc.nextLine();
                Square sq = new Square(l);
                shapes.add(sq);
            }
            if (shape.equals("r")) {
                System.out.println("Enter the width and height of the rectangle");
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                Rectangle rect = new Rectangle(w, h);
                shapes.add(rect);

            }
            if (shape.equals("q")) {
                break;
            }
        }
    
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }
}

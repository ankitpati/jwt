/* Shape.java */
/* Date  : 08 March 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

abstract class Shape{
    String color;
    boolean filled;

    Shape()
    {
        this("", false);
    }

    Shape(String color, boolean filled)
    {
        setColor(color);
        setFilled(filled);
    }

    String getColor()
    {
        return color;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    boolean isFilled()
    {
        return filled;
    }

    void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString()
    {
        String ret;
        ret = "" +
            "Color    : " + getColor() + '\n' +
            "Filled   : " + isFilled() + '\n'
        ;
        return ret;
    }

    public static void main(String args[])
    {
        String color;
        boolean filled;
        Scanner sc;
        Shape s;

        sc = new Scanner(System.in);

        System.out.printf("Fill? (Y/N)\n");
        filled = sc.nextLine().toUpperCase().charAt(0) == 'Y' ? true : false;

        System.out.printf("Colour?\n");
        color = sc.nextLine();
        System.out.printf("\n");

        System.out.printf("Radius of Circle?\n");
        s = new Circle(sc.nextDouble(), color, filled); sc.nextLine();
        System.out.printf("Details of Circle:\n%s\n", s);

        System.out.printf("Side of Square?\n");
        s = new Square(sc.nextDouble(), color, filled); sc.nextLine();
        System.out.printf("Details of Square:\n%s\n", s);

        System.out.printf("Width and Length of Rectangle?\n");
        s = new Rectangle(sc.nextDouble(), sc.nextDouble(), color, filled);
                                                                  sc.nextLine();
        System.out.printf("Details of Rectangle:\n%s\n", s);

        return;
    }
};

class Circle extends Shape{
    double radius;

    Circle()
    {
        this(0.0);
    }

    Circle(double radius)
    {
        setRadius(radius);
    }

    Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        setRadius(radius);
    }

    double getRadius()
    {
        return radius;
    }

    void setRadius(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return Math.PI * radius * radius;
    }

    double getPerimeter()
    {
        return 2.0 * Math.PI * radius;
    }

    public String toString()
    {
        String ret;
        ret = super.toString() +
            "Radius   : " + getRadius()    + '\n' +
            "Area     : " + getArea()      + '\n' +
            "Perimeter: " + getPerimeter() + '\n'
        ;
        return ret;
    }
};

class Rectangle extends Shape{
    double width, length;

    Rectangle()
    {
        this(0.0, 0.0);
    }

    Rectangle(double width, double length)
    {
        setWidth(width);
        setLength(length);
    }

    Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    double getWidth()
    {
        return width;
    }

    void setWidth(double width)
    {
        this.width = width;
    }

    double getLength()
    {
        return length;
    }

    void setLength(double length)
    {
        this.length = length;
    }

    double getArea()
    {
        return width * length;
    }

    double getPerimeter()
    {
        return 2.0 * (width + length);
    }

    public String toString()
    {
        String ret;
        ret = super.toString() +
            "Width    : " + getWidth()     + '\n' +
            "Length   : " + getLength()    + '\n' +
            "Area     : " + getArea()      + '\n' +
            "Perimeter: " + getPerimeter() + '\n'
        ;
        return ret;
    }
};

class Square extends Rectangle{
    Square()
    {
    }

    Square(double side)
    {
        super(side, side);
    }

    Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    double getSide()
    {
        return super.width;
    }

    void setSide(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }

    void setWidth(double side)
    {
        setSide(side);
    }

    void setLength(double side)
    {
        setSide(side);
    }

    public String toString()
    {
        String ret;
        ret = "" +
            "Color    : " + getColor()     + '\n' +
            "Filled   : " + isFilled()     + '\n' +
            "Side     : " + getSide()      + '\n' +
            "Area     : " + getArea()      + '\n' +
            "Perimeter: " + getPerimeter() + '\n'
        ;
        return ret;
    }
};
/* end of Shape.java */

/* OUTPUT

Fill? (Y/N)
y
Colour?
Blue

Radius of Circle?
43.5
Details of Circle:
Color    : Blue
Filled   : true
Radius   : 43.5
Area     : 5944.678698755286
Perimeter: 273.318560862312

Side of Square?
5
Details of Square:
Color    : Blue
Filled   : true
Side     : 5.0
Area     : 25.0
Perimeter: 20.0

Width and Length of Rectangle?
5.43
43
Details of Rectangle:
Color    : 243
Filled   : false
Width    : 5.43
Length   : 43.0
Area     : 233.48999999999998
Perimeter: 96.86

*/

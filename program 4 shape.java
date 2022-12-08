import java.util.Scanner;
abstract class Shape
{
    abstract void Printarea();
}

class Rectangle extends Shape
{
    double length,breadth;

    Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    void Printarea() {
        System.out.println("the area of the rectangle is:"+(length*breadth));
    }
}
class Triangle extends Shape
{
    double height,base;

    Triangle(double b,double h)
    {
        base=b;
        height=h;
    }
    void Printarea() {
        System.out.println("the area of the triangle is:"+(0.5*base*height));
    }
}
class Circle extends Shape
{
    double radius;

    Circle(double r)
    {
        radius=r;
    }
    void Printarea() {
        System.out.println("the area of the circle is:"+(3.14*radius*radius));
    }
}

  class Myshape{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rect=new Rectangle(20,10);
        Triangle tri=new Triangle(10,8);
        Circle cir=new Circle(50);

        rect.Printarea();
        tri.Printarea();
        cir.Printarea();

    }
}

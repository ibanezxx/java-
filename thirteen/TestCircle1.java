package homework.thirteen;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class TestCircle1{
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(2);
        Circle1 c2 = new Circle1(2);
        System.out.println(c1.equals(c2));
    }
}

class Circle1 extends GeometricObject{
    private double radius;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(String color, boolean filled, double radius) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public double getDiameter(){
        return 2*radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }


    @Override
    public int compareTo(GeometricObject o) {
        return super.compareTo(o);
    }

    public void printCircle(){
        System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Circle1 circle1 = (Circle1) o;
        return Double.compare(circle1.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public void howToColor() {

    }
}

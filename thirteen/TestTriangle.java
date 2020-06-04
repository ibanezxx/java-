package homework.thirteen;


import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入边长");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        System.out.println("请输入颜色");
        String color=input.next();
        System.out.println("是否填充");
        boolean isFilled=input.nextBoolean();
        Triangle triangle=new Triangle(side1,side2,side3,isFilled,color);
        if (isFilled) {
            System.out.printf("面积:%.2fd 周长：%.2f 颜色: %s 填充",triangle.getArea(),triangle.getPerimeter(),triangle.getColor());
        }
        else {
            System.out.printf("面积:%.2f 周长：%.2f 颜色: %s 不填充",triangle.getArea(),triangle.getPerimeter(),triangle.getColor());
        }
    }
}

abstract class GeometricObject implements Comparable<GeometricObject>, Colorable,Cloneable {
    private String color="white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated =new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated=new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea()>o.getArea()){
         return 1;
        }
        else if (getArea()==o.getArea()){
            return 0;
        }
        return -1;
    }

    public static GeometricObject max(GeometricObject o1,GeometricObject o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        else {
            return o2;
        }
    }
}

class Triangle extends GeometricObject {
    private double side1=1;
    private double side2=1;
    private double side3=1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3,boolean t,String c) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setFilled(t);
        setColor(c);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle:side1="+side1+" side2="+side2+" side3="+side3;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return 0;
    }

    @Override
    public void howToColor() {

    }
}

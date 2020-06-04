package homework.thirteen;

import homework.thirteen.GeometricObject;

public interface Colorable {
    public void howToColor();
}

class Square extends GeometricObject {
    private double side;

    public Square() {
        side=0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides ");
    }
}

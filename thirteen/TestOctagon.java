package homework.thirteen;

public class TestOctagon {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1=new Octagon(5);
        System.out.println("面积："+o1.getArea()+" 周长："+o1.getPerimeter());

        Octagon o2=(Octagon) o1.clone();
        //返回0就是一样大
        System.out.println(o1.compareTo(o2));
    }
}

class Octagon extends GeometricObject{
    private double side;

    public Octagon() {
    }



    public Octagon(double side) {
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
        return (2+4/Math.sqrt(2))*side*side;
    }

    @Override
    public double getPerimeter() {
        return 8*side;
    }

    @Override
    public void howToColor() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

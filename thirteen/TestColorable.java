package homework.thirteen;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects=new GeometricObject[5];
        geometricObjects[0]=new Square(1);
        geometricObjects[1]=new Square(2);
        geometricObjects[2]=new Square(3);
        geometricObjects[3]=new Square(4);
        geometricObjects[4]=new Square(5);
        for (int i=0;i<geometricObjects.length;i++){
            geometricObjects[i].howToColor();
        }
    }
}

package homework.ten;


import java.util.Scanner;

public class Frame {
    public static void main(String[] args) {
        MyRectangle2D myRectangle2D=new MyRectangle2D();
        Scanner input=new Scanner(System.in);
        double[][] points=new double[5][2];
        System.out.print("Enter five points:");

        for (int i=0;i<points.length;i++){
            for (int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
        System.out.println();
        myRectangle2D=getRectangle(points);
        System.out.println("The bounding rectangle's center("+myRectangle2D.getX()+","+myRectangle2D.getY()+"),width "
                            +myRectangle2D.getWidth()+",height "+myRectangle2D.getHeight());
    }
    public static MyRectangle2D getRectangle(double[][] points){
        MyRectangle2D myRectangle2D=new MyRectangle2D();
        double minX = points[0][0];
        double maxX=points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];
        //找最小的x坐标
        for (int i = 0; i < points.length; i++) {
            if (minX > points[i][0])
                minX = points[i][0];
        }
        //找最大的x坐标
        for (int i = 0; i < points.length; i++) {
            if (maxX < points[i][0])
                maxX = points[i][0];
        }
        //找最小的y坐标
        for (int i = 0; i < points.length; i++){
            if (minY > points[i][1])
                minY = points[i][1];
        }
        //找最大的y坐标
        for (int i = 0; i < points.length; i++) {
            if (maxY < points[i][1])
                maxY = points[i][1];
        }

        myRectangle2D.setWidth(maxX-minX);
        myRectangle2D.setHeight(maxY-minY);
        myRectangle2D.setX((maxX+minX)/2);
        myRectangle2D.setY((maxY+minY)/2);
        return myRectangle2D;
    }
}

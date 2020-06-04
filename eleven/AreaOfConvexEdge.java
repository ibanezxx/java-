package homework.eleven;

import java.util.Scanner;

public class AreaOfConvexEdge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of points:");
        int numberOfPoints=input.nextInt();
        System.out.println("Enter the coordinates of the point clockwise:");
        double[][] points=new double[numberOfPoints][2];

        for (int i=0;i<points.length;i++){
            for (int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
        //将凸多边形分成n-2个三角形来计算面积，n为边数,固定输入的第一个点坐标顺时针计算面积
        double sumArea=0;
        for (int i=2;i<points.length;i++){
            sumArea+=area(points[0][0],points[0][1],points[i-1][0],points[i-1][1],points[i][0],points[i][1]);
        }
        System.out.println("The total area is: "+sumArea);
    }
    public static double area(double x1,double y1,double x2,double y2,double x3,double y3){
        //计算每一个三角形的面积
        double s1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double s2=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double s3=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double s=(s1+s2+s3)/2;

        double area =Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return  area;
    }
}

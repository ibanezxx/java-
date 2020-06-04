package homework.eight;

import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入4个点");
        double[][] points=new double[4][2];

        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
    if (getIntersectionPoint(points)==null)
        System.out.println("The two lines are parallel");
    else System.out.printf("The intersecting point is at(%.5f,%.5f)",getIntersectionPoint(points)[0],getIntersectionPoint(points)[1]);

    }
    public static double[] getIntersectionPoint(double[][] points){
        double x1=points[0][0];
        double y1=points[0][1];

        double x2=points[1][0];
        double y2=points[1][1];

        double x3=points[2][0];
        double y3=points[2][1];

        double x4=points[3][0];
        double y4=points[3][1];

        double[] result=new double[2];
        double a00=y1-y2;
        double a01=-(x1-x2);
        double a10=y3-y4;
        double a11=-(x3-x4);
        double b0=(y1-y2)*x1-(x1-x2)*y1;
        double b1=(y3-y4)*x3-(x3-x4)*y3;

        result[0]=(b0*a11-b1*a01)/(a00*a11-a01*a10);
        result[1]=(b1*a00-b0*a10)/(a00*a11-a01*a10);

        if (a00*a11-a01*a10==0)
            return null;
        else
        return result;
    }
}
